package com.ums.dao;

import com.hibernate.HibernateConnection;
import com.ums.exceptions.DAOException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public abstract class HibernateObjectDaoImpl <T> implements IDao<T> {
    private Class<T> typeObject;

    public HibernateObjectDaoImpl(Class<T> typeObject) {
        this.typeObject = typeObject;
    }

    @Override
    public void create(T entity) throws DAOException {
        Session session;
        Transaction transaction = null;
        try {
            session = HibernateConnection.getSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            throw new DAOException("ERROR : " + e.getClass() + " : " + e.getMessage());
            }
        }


    @Override
    public T read(int id) throws DAOException {
        try {
            Session session = HibernateConnection.getSession();
            return session.find(typeObject, id);
        } catch (Exception e) {
            throw new DAOException("ERROR : " + e.getClass() + ":" + e.getMessage());
        }
    }

    @Override
    public List<T> list() throws DAOException {
        try {
            Session session = HibernateConnection.getSession();
            String query = "from " + typeObject.getSimpleName();
            return session.createQuery(query, typeObject).getResultList();
        } catch (Exception e) {
            throw new DAOException("ERROR : " + e.getClass() + ":" + e.getMessage());
        }
    }

    @Override
    public void update(T entity) throws DAOException {
        Session session = null;
        Transaction transaction = null;
        try {
             session = HibernateConnection.getSession();
             transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            throw new DAOException("ERROR : " + e.getClass() + ":" + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(int id) throws DAOException {
        Session session = null;
        Transaction transaction = null;
        try {
             session = HibernateConnection.getSession();
             transaction = session.beginTransaction();
            //T entity = read(id);
            T entityToDelete = session.find(typeObject, id);
            if (entityToDelete != null) {
                session.remove(entityToDelete);
            }
            transaction.commit();
        } catch (Exception e) {
            throw new DAOException("ERROR : " + e.getClass() + ":" + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

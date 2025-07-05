package com.ums.factory;

import com.ums.dao.*;
import com.ums.entities.*;

public class HibernateDaoFactory implements IDaoFactory {
    private static HibernateDaoFactory instance = new HibernateDaoFactory();

    private HibernateDaoFactory() {}

    public static HibernateDaoFactory getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> IDao<T> getDao(Class<T> entityClass) {
        if (entityClass.equals(Utilisateur.class)) {
            return (IDao<T>) new HibernateUtilisateurDaoImpl();
        } else if (entityClass.equals(Client.class)) {
            return (IDao<T>) new HibernateClientDaoImpl();
        } else if (entityClass.equals(Chauffeur.class)) {
            return (IDao<T>) new HibernateChauffeurDaoImpl();
        } else if (entityClass.equals(Vehicule.class)) {
            return (IDao<T>) new HibernateVehiculeDaoImpl();
        } else if (entityClass.equals(Reservation.class)) {
            return (IDao<T>) new HibernateReservationDaoImpl();
        } else if (entityClass.equals(Facture.class)) {
            return (IDao<T>) new HibernateFactureDaoImpl();
        }
//        else if (entityClass.equals(Admin.class)) { // Ajoutez le cas pour Admin
//            return (IDao<T>) new HibernateAdminDaoImpl();
//        }
        // Ajoutez d'autres entités au fur et à mesure
        throw new IllegalArgumentException("No DAO implementation found for entity class: " + entityClass.getName());
    }
}

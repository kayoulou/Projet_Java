package com.ums.dao;

import com.ums.entities.Utilisateur;
import com.ums.dao.HibernateObjectDaoImpl;

public class HibernateUtilisateurDaoImpl extends HibernateObjectDaoImpl<Utilisateur> {

    public HibernateUtilisateurDaoImpl() {
             super(Utilisateur.class);
        }
}

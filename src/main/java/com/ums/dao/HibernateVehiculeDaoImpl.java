package com.ums.dao;

import com.ums.entities.Vehicule;

public class HibernateVehiculeDaoImpl  extends HibernateObjectDaoImpl<Vehicule>{
    public HibernateVehiculeDaoImpl() {super(Vehicule.class); }
}

package com.ums.dao;

import com.ums.entities.Facture;

public class HibernateFactureDaoImpl extends HibernateObjectDaoImpl<Facture> {
    public HibernateFactureDaoImpl() {
        super(Facture.class);
    }
}

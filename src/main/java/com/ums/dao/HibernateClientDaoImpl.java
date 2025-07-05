package com.ums.dao;

import com.ums.entities.Client;

public class HibernateClientDaoImpl extends HibernateObjectDaoImpl<Client>{
    public HibernateClientDaoImpl() {super(Client.class); }
}

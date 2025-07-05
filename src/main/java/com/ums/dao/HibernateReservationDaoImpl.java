package com.ums.dao;

import com.ums.entities.Reservation;

public class HibernateReservationDaoImpl extends HibernateObjectDaoImpl<Reservation>{
    public HibernateReservationDaoImpl() {super(Reservation.class); }
}

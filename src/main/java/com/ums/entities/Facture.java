package com.ums.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "T_facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facture")
    private int id;

    private  double montant;
    private LocalDate dateFacture;

    @OneToOne
    @JoinColumn(name = "reservation_id", referencedColumnName = "id_reservation")
    private Reservation reservation;


    public Facture(){}

    public Facture(double montant, LocalDate dateFacture, Reservation reservation) {
        this.montant = montant;
        this.dateFacture = dateFacture;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDateFacture() {
        return dateFacture;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
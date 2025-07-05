package com.ums.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "T_reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "vehicule_id", referencedColumnName = "id_vehicule")
    private Vehicule vehicule;

    private  LocalDate datedebut;
    private  LocalDate dateFin;

    private  String statut;


    private  Reservation(){}

    public Reservation(Client client, Vehicule vehicule, LocalDate datedebut, LocalDate dateFin, String statut) {
        this.client = client;
        this.vehicule = vehicule;
        this.datedebut = datedebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public LocalDate getDatedebut() {
        return datedebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public String getStatut() {
        return statut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

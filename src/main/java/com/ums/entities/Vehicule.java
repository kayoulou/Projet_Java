package com.ums.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "T_Vehicule")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehicule")
    private int id;
    private  String marque;
    private  String  modele;
    private  double tarif;
    private boolean disponibilite;
    private String immatriculation;

    public  Vehicule() {}

    public Vehicule(String marque, String modele, double tarif, boolean disponibilite, String immatriculation) {
        this.marque = marque;
        this.modele = modele;
        this.tarif = tarif;
        this.disponibilite = disponibilite;
        this.immatriculation = immatriculation;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getTarif() {
        return tarif;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
}
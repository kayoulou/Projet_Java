package com.ums.entities;

import jakarta.persistence.*;

@Entity(name="T_utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private int id;
    private String nom;
    private  String role;
    private  String motPasse;


    public String getRole() {
        return role;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Utilisateur(){}

    public Utilisateur(String role, String nom, String motPasse) {
        this.role = role;
        this.nom = nom;
        this.motPasse = motPasse;
    }


}
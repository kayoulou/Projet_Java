package com.ums.entities;

import jakarta.persistence.*;

@Entity(name = "T_Client")
@PrimaryKeyJoinColumn(name = "id_client")
public class Client  extends  Utilisateur {


    private String email;

    private int pointsFidelite;


    public Client() {
    }

    public Client(String email, int pointsFidelite, Utilisateur utilisateur) {
        this.email = email;
        this.pointsFidelite = pointsFidelite;

    }

    public Client(String role, String nom, String motDePasse, String email, int pointsFidelite) {
        super(role, nom, motDePasse);
        this.email = email;
        this.pointsFidelite = pointsFidelite;
    }

    public int getPointsFidelite() {
        return pointsFidelite;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPointsFidelite(int pointsFidelite) {
        this.pointsFidelite = pointsFidelite;
    }

}
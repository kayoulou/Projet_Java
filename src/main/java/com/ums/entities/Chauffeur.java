package com.ums.entities;

import jakarta.persistence.*;

@Entity(name = "T_Chauffeur")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
public class Chauffeur extends Utilisateur {

    private boolean disponibilite;

    public Chauffeur() {}

    public Chauffeur(String nom, String motDePasse, boolean disponibilite) {
        super("chauffeur", nom, motDePasse);
        this.disponibilite = disponibilite;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}

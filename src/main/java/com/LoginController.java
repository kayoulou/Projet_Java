package com;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    private TextField nomutilisateurField;

    @FXML
    private PasswordField motDePasseField;

    @FXML
    public   void handleLogin()
    {
        String username = nomutilisateurField.getText();
        String password = motDePasseField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Erreur", "Veuillez remplir tous les champs.");
            return;
        }
        if ("Aya".equals(username) && "adminpasser".equals(password)) {
            showAlert("Succès", "Connexion admin réussie !");
            // TODO : changer de scène, ouvrir tableau de bord admin
        } else if ("Awa".equals(username) && "clientpasser".equals(password)) {
            showAlert("Succès", "Connexion client réussie !");
            // TODO : changer de scène, ouvrir tableau de bord client
        } else {
            showAlert("Erreur", "Nom d'utilisateur ou mot de passe incorrect.");
        }
    }


    private void showAlert(String titre, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    }


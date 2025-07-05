package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application {

    public void start(Stage primaryStage) throws Exception {
        // Charger le fichier FXML de la page de login
        Parent root = FXMLLoader.load(getClass().getResource("/com/login.fxml"));

        primaryStage.setTitle("Page de connexion");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

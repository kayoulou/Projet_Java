package com.runtime;

import com.hibernate.HibernateConnection;
import com.ums.dao.IDao;
import com.ums.entities.Chauffeur;
import com.ums.entities.Client;
import com.ums.entities.Utilisateur;
import com.ums.exceptions.DAOException;
import com.ums.factory.ConcreteFactory;
import com.ums.factory.HibernateDaoFactory;

import java.util.List;

public class Testeur {
    public static void main(String[] args) {
        HibernateDaoFactory hibernateFactory = ConcreteFactory.getFactory(HibernateDaoFactory.class);

        try {
            // Initialiser les DAO
            IDao<Utilisateur> utilisateurDao = hibernateFactory.getDao(Utilisateur.class);
            IDao<Client> clientDao = hibernateFactory.getDao(Client.class);
            IDao<Chauffeur> chauffeurDao = hibernateFactory.getDao(Chauffeur.class);
            System.out.println("--- Création d’un administrateur ---");

            // Créer un utilisateur administrateur
            Utilisateur admin = new Utilisateur("admin", "Aya", "adminpasser");
            utilisateurDao.create(admin);
            System.out.println("Administrateur créé : " + admin.getNom() + " (ID: " + admin.getId() + ")");
            //créer un utilisateur client
            System.out.println("--- Création d’un utilisateur client ---");

            Client client = new Client("client", "Awa", "clientpasser", "awa@gmail.com", 50);
            clientDao.create(client);
            System.out.println("Client créé avec email : " + client.getEmail() + " (ID client : " + client.getId() + ")");


            // Créer un chauffeur
            Chauffeur chauffeur = new Chauffeur("Mahad", "chauffeurpasser", true);
            chauffeurDao.create(chauffeur);
            System.out.println("Chauffeur créé : " + chauffeur.getNom());

        } catch (DAOException e) {
            System.err.println("Erreur DAO : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

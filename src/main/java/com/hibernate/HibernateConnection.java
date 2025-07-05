package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConnection {
    private static final SessionFactory factory;

    static {
        try {
            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();

            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

            factory = meta.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    private HibernateConnection() {}

    public static Session getSession() {
        return factory.openSession();
    }

    public static void shutdown() {
        if (factory != null && !factory.isClosed()) {
            factory.close();
            System.out.println("SessionFactory closed.");
        }
    }
}

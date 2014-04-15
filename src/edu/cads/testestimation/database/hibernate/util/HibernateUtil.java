package edu.cads.testestimation.database.hibernate.util;

/**
 * Created by Ari100tell on 16.03.2014.
 */

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.service.ServiceRegistry;

import javax.swing.*;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry;

    static {
        Configuration configuration = new Configuration();
        configuration.configure();
    //   configuration.setProperty("hibernate.connection.password", "0972414752");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        try {
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (JDBCConnectionException jdbcConnectionException){
            JOptionPane.showMessageDialog(null, "Перевірте параметри підключення", "Помилка підключення", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
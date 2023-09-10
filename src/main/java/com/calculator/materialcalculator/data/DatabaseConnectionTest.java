package com.calculator.materialcalculator.data;

import com.calculator.materialcalculator.data.HibernateUtil;
import org.hibernate.SessionFactory;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
    try {
        // Attempt to get the Hibernate SessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        if (sessionFactory != null) {
            System.out.println("Database connection successful.");
            sessionFactory.close(); // Close the session factory when done
        } else {
            System.err.println("Failed to connect to the database.");
        }
    } catch (Exception e) {
        System.err.println("An error occurred while connecting to the database:");
        e.printStackTrace();
    }
}
}

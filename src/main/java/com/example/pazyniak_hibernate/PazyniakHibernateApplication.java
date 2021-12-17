package com.example.pazyniak_hibernate;

import com.example.pazyniak_hibernate.util.HibernateUtil;
import com.example.pazyniak_hibernate.view.View;
import org.hibernate.Session;



public class PazyniakHibernateApplication {

    public static void main(String[] args) {

        try (Session SESSION = HibernateUtil.getSession()) {
            System.out.println("Test session established. ");
            new View().show();
        } catch (Throwable ex) {
            System.err.println("Test session failed.");
            ex.printStackTrace();
        }
    }

}

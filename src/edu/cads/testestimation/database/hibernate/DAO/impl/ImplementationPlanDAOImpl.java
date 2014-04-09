package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.ImplementationPlanDAO;
import edu.cads.testestimation.database.hibernate.logic.EstimationResults;
import edu.cads.testestimation.database.hibernate.logic.ImplementationPlan;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class ImplementationPlanDAOImpl implements ImplementationPlanDAO {


    @Override
    public void addImplementationPlan(ImplementationPlan implementationPlan) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(implementationPlan);
            session.getTransaction().commit();
        } catch(ConstraintViolationException constraintViolationException){
        JOptionPane.showMessageDialog(null, "Номер плану впровадження повинен бути унікальним", "Хибний номер плану", JOptionPane.ERROR_MESSAGE);
        } catch (HibernateException e) {             
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {              
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateImplementationPlan(ImplementationPlan implementationPlan) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(implementationPlan);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public ImplementationPlan getImplementationPlanByNumber(String implementationPlanNumber) throws SQLException {
        Session session = null;
        ImplementationPlan implementationPlan = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            implementationPlan = (ImplementationPlan) session.get(ImplementationPlan.class, implementationPlanNumber);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return implementationPlan;
    }

    @Override
    public List getAllImplementationPlan() throws SQLException {
        Session session = null;
        List<ImplementationPlan> implementationPlanList = new ArrayList<ImplementationPlan>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            implementationPlanList = session.createCriteria(EstimationResults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return implementationPlanList;
    }

    @Override
    public void deleteImplementationPlan(ImplementationPlan implementationPlan) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(implementationPlan);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Дані не виділені", "Ошибка", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}

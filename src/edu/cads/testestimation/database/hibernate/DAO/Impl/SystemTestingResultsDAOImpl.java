package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.SystemTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.logic.SystemTestingResults;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class SystemTestingResultsDAOImpl implements SystemTestingResultsDAO {

    @Override
    public void addSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(systemTestingResults);
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
    public void updateSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(systemTestingResults);
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
    public SystemTestingResults getSystemTestingResultsBySystemTestingNumber(int systemTestingNumber) throws SQLException {
        Session session = null;
        System.out.println("systemTestingNumber="+systemTestingNumber);
        SystemTestingResults systemTestingResults = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            systemTestingResults = (SystemTestingResults) session.get(SystemTestingResults.class, systemTestingNumber);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return systemTestingResults;
    }

    @Override
    public List getAllSystemTestingResults(){
        Session session = null;
        List<SystemTestingResults> systemTestingResultsList = new ArrayList<SystemTestingResults>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            systemTestingResultsList = session.createCriteria(SystemTestingResults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return systemTestingResultsList;
    }

    @Override
    public void deleteSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(systemTestingResults);
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

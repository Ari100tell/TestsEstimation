package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.UnitTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.logic.UnitTestingResults;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class UnitTestingResultsDAOImpl implements UnitTestingResultsDAO {

    @Override
    public void addUnitTestingResults(UnitTestingResults unitTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(unitTestingResults);
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
    public void updateUnitTestingResults(UnitTestingResults unitTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(unitTestingResults);
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
    public UnitTestingResults getUnitTestingResultsByUnitTestingNumber(Integer unitTestingNumber) throws SQLException {
        Session session = null;
        UnitTestingResults unitTestingResults = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            unitTestingResults = (UnitTestingResults) session.get(UnitTestingResults.class, unitTestingNumber);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return unitTestingResults;
    }

    @Override
    public List getAllUnitTestingNumber() throws SQLException {
        Session session = null;
        List<UnitTestingResults> unitTestingResultsList = new ArrayList<UnitTestingResults>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            unitTestingResultsList = session.createCriteria(UnitTestingResults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return unitTestingResultsList;
    }

    @Override
    public void deleteUnitTestingNumber(UnitTestingResults unitTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(unitTestingResults);
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

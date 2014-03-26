package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.InternalTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.logic.InternalTestingResults;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class InternalTestingResultsDAOImpl implements InternalTestingResultsDAO {

    @Override
    public void addInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(internalTestingResults);
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
    public void updateInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(internalTestingResults);
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
    public List getAllInternalTestingResults() throws SQLException {
        Session session = null;
        List<InternalTestingResults> internalTestingResultsList = new ArrayList<InternalTestingResults>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            internalTestingResultsList = session.createCriteria(InternalTestingResults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return internalTestingResultsList;
    }

    @Override
    public void deleteInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(internalTestingResults);
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

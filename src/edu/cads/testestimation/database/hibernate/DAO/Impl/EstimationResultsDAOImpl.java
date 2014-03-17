package edu.cads.testestimation.database.hibernate.DAO.Impl;

import edu.cads.testestimation.database.hibernate.DAO.EstimationResultsDAO;
import edu.cads.testestimation.database.hibernate.logic.EstimationResults;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class EstimationResultsDAOImpl implements EstimationResultsDAO {
    @Override
    public void addEstimationResults(EstimationResults estimationResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(estimationResults);
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
    public void updateEstimationResults(EstimationResults estimationResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(estimationResults);
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
    public EstimationResults getEstimationResultsByEstimationNumber(Integer estimationNumber) throws SQLException {
        Session session = null;
        EstimationResults estimationResults = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            estimationResults = (EstimationResults) session.load(EstimationResults.class, estimationNumber);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return estimationResults;
    }

    @Override
    public List getAllEstimationResults() throws SQLException {
        Session session = null;
        List<EstimationResults> estimationResultsList = new ArrayList<EstimationResults>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            estimationResultsList = session.createCriteria(EstimationResults.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return estimationResultsList;
    }

    @Override
    public void deleteEstimationResults(EstimationResults estimationResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(estimationResults);
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

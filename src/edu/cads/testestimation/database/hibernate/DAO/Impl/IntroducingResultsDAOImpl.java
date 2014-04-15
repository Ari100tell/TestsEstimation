package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.IntroducingResultsDAO;
import edu.cads.testestimation.database.hibernate.logic.IntroducingResults;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Created by Ari100tell on 16.03.2014.
 */
public class IntroducingResultsDAOImpl implements IntroducingResultsDAO {

    @Override
    public void addIntroducingResults(IntroducingResults introducingResults) throws SQLException {
            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(introducingResults);
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
    public void updateIntroducingResults(IntroducingResults introducingResults) throws SQLException {
            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.update(introducingResults);
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
    public IntroducingResults getIntroducingResultsByNumber(Integer introducingResultNumber) throws SQLException {
            Session session = null;
        IntroducingResults introducingResults = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                introducingResults = (IntroducingResults) session.get( IntroducingResults.class, introducingResultNumber);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            return introducingResults;
    }

    @Override
    public List getAllIntroducingResults() throws SQLException {
            Session session = null;
            List< IntroducingResults> introducingResultsList = new ArrayList< IntroducingResults>();
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                introducingResultsList = session.createCriteria( IntroducingResults.class).list();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            return introducingResultsList;
    }

    @Override
    public void deleteIntroducingResults(IntroducingResults introducingResults) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(introducingResults);
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

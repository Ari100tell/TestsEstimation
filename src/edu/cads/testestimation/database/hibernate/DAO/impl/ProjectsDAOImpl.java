package edu.cads.testestimation.database.hibernate.DAO.impl;

import edu.cads.testestimation.database.hibernate.DAO.ProjectsDAO;
import edu.cads.testestimation.database.hibernate.logic.Projects;
import edu.cads.testestimation.database.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ari100tell on 14.04.2014.
 */
public class ProjectsDAOImpl implements ProjectsDAO {

    @Override
    public Projects getProjectsById(Integer projectId) throws SQLException {
        Session session = null;
        Projects projects = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            projects = (Projects) session.get(Projects.class, projectId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return projects;
    }

    @Override
    public List getAllProjects() throws SQLException {
        Session session = null;
        List<Projects> projectsList = new ArrayList<Projects>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            projectsList = session.createCriteria(Projects.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return projectsList;
    }
}


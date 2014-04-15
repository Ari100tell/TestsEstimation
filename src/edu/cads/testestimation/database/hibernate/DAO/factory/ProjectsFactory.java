package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.ProjectsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.ProjectsDAOImpl;

/**
 * Created by Ari100tell on 14.04.2014.
 */
public class ProjectsFactory {

    private static ProjectsDAO projectsDAO = null;
    private static ProjectsFactory instance = null;

    public static synchronized  ProjectsFactory getInstance() {
        if (instance == null) {
            instance = new ProjectsFactory();
        }
        return instance;
    }

    public static ProjectsDAO getProjectsDAO() {
        if (projectsDAO == null) {
            projectsDAO = new ProjectsDAOImpl();
        }
        return projectsDAO;
    }
}

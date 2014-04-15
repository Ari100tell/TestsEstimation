package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.Projects;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 14.04.2014.
 */
public interface ProjectsDAO {

    public Projects getProjectsById(Integer projectId) throws SQLException;

    public List getAllProjects() throws SQLException;
}

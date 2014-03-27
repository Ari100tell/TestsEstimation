package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.SystemTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.SystemTestingResultsDAOImpl;

/**
 * Created by Ari100tell on 24.03.2014.
 */
public class SystemTestingResultsFactory {
    private static SystemTestingResultsDAO systemTestingResultsDAO = null;
    private static  SystemTestingResultsFactory instance = null;

    public static synchronized  SystemTestingResultsFactory getInstance() {
        if (instance == null) {
            instance = new  SystemTestingResultsFactory();
        }
        return instance;
    }

    public static SystemTestingResultsDAO getSystemTestingResultsDAO() {
        if (systemTestingResultsDAO == null) {
            systemTestingResultsDAO = new SystemTestingResultsDAOImpl();
        }
        return systemTestingResultsDAO;
    }
}

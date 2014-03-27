package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.UnitTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.UnitTestingResultsDAOImpl;

/**
 * Created by Ari100tell on 24.03.2014.
 */
public class UnitTestingResultsFactory {
    private static UnitTestingResultsDAO unitTestingResultsDAO = null;
    private static  UnitTestingResultsFactory instance = null;

    public static synchronized  UnitTestingResultsFactory getInstance() {
        if (instance == null) {
            instance = new  UnitTestingResultsFactory();
        }
        return instance;
    }

    public static UnitTestingResultsDAO getUnitTestingResultsDAO() {
        if (unitTestingResultsDAO == null) {
            unitTestingResultsDAO = new UnitTestingResultsDAOImpl();
        }
        return unitTestingResultsDAO;
    }
}

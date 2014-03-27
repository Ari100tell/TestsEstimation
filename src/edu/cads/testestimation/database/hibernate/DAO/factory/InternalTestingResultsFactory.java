package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.InternalTestingResultsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.InternalTestingResultsDAOImpl;

/**
 * Created by Ari100tell on 24.03.2014.
 */
public class InternalTestingResultsFactory {
    private static InternalTestingResultsDAO internalTestingResultsDAO = null;
    private static InternalTestingResultsFactory instance = null;

    public static synchronized InternalTestingResultsFactory getInstance() {
        if (instance == null) {
            instance = new InternalTestingResultsFactory();
        }
        return instance;
    }

    public static InternalTestingResultsDAO getInternalTestingResultsDAO() {
        if (internalTestingResultsDAO == null) {
            internalTestingResultsDAO = new InternalTestingResultsDAOImpl();
        }
        return internalTestingResultsDAO;
    }
}

package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.DAO.Impl.EstimationResultsDAOImpl;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class Factory {

    private static EstimationResultsDAO estimationResultsDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static EstimationResultsDAO getEstimationResultsDAO() {
        if (estimationResultsDAO == null) {
            estimationResultsDAO = new EstimationResultsDAOImpl();
        }
        return estimationResultsDAO;
    }
}
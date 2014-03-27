package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.EstimationResultsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.EstimationResultsDAOImpl;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public class EstimationResultFactory {

    private static EstimationResultsDAO estimationResultsDAO = null;
    private static EstimationResultFactory instance = null;

    public static synchronized EstimationResultFactory getInstance() {
        if (instance == null) {
            instance = new EstimationResultFactory();
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
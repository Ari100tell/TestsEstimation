package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.IntroducingResultsDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.IntroducingResultsDAOImpl;

/**
 * Created by Ari100tell on 24.03.2014.
 */
public class IntroducingResultsFactory {
    private static IntroducingResultsDAO introducingResultsDAO = null;
    private static IntroducingResultsFactory instance = null;

    public static synchronized IntroducingResultsFactory getInstance() {
        if (instance == null) {
            instance = new IntroducingResultsFactory();
        }
        return instance;
    }

    public static IntroducingResultsDAO getIntroducingResultDAO() {
        if (introducingResultsDAO == null) {
            introducingResultsDAO = new IntroducingResultsDAOImpl();
        }
        return introducingResultsDAO;
    }
}

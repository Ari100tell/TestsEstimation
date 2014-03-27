package edu.cads.testestimation.database.hibernate.DAO.factory;

import edu.cads.testestimation.database.hibernate.DAO.ImplementationPlanDAO;
import edu.cads.testestimation.database.hibernate.DAO.impl.ImplementationPlanDAOImpl;

/**
 * Created by Ari100tell on 24.03.2014.
 */
public class ImplementationPlanFactory {
    private static ImplementationPlanDAO implementationPlanDAO = null;
    private static ImplementationPlanFactory instance = null;

    public static synchronized ImplementationPlanFactory getInstance() {
        if (instance == null) {
            instance = new ImplementationPlanFactory();
        }
        return instance;
    }

    public static ImplementationPlanDAO getImplementationPlanDAO() {
        if (implementationPlanDAO == null) {
            implementationPlanDAO = new ImplementationPlanDAOImpl();
        }
        return implementationPlanDAO;
    }
}

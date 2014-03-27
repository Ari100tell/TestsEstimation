package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.ImplementationPlan;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface ImplementationPlanDAO {

    public void addImplementationPlan(ImplementationPlan implementationPlan) throws SQLException;

    public void updateImplementationPlan(ImplementationPlan implementationPlan) throws SQLException;

    public ImplementationPlan getImplementationPlanByNumber(String implementationPlanNumber) throws SQLException;

    public List getAllImplementationPlan() throws SQLException;

    public void deleteImplementationPlan(ImplementationPlan implementationPlan) throws SQLException;
}

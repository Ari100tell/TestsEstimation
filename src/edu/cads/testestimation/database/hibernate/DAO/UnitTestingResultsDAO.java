package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.UnitTestingResults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface UnitTestingResultsDAO {
    public void addUnitTestingResults( UnitTestingResults unitTestingResults) throws SQLException;

    public void updateUnitTestingResults( UnitTestingResults unitTestingResults) throws SQLException;

    public UnitTestingResults getUnitTestingResultsByUnitTestingNumber(Integer unitTestingNumber) throws SQLException;

    public List getAllUnitTestingNumber() throws SQLException;

    public void deleteUnitTestingNumber(UnitTestingResults unitTestingResults) throws SQLException;
}

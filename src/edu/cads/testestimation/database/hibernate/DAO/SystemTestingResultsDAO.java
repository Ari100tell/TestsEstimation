package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.SystemTestingResults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface SystemTestingResultsDAO {
    public void addSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException;

    public void updateSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException;

    public SystemTestingResults getSystemTestingResultsBySystemTestingNumber(int systemTestingNumber) throws SQLException;

    public List getAllSystemTestingResults() throws SQLException;

    public void deleteSystemTestingResults(SystemTestingResults systemTestingResults) throws SQLException;
}

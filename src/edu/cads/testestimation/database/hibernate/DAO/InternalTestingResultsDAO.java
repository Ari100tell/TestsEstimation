package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.InternalTestingResults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface InternalTestingResultsDAO {

    public void addInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException;

    public void updateInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException;

    public List getAllInternalTestingResults() throws SQLException;

    public void deleteInternalTestingResults(InternalTestingResults internalTestingResults) throws SQLException;
}

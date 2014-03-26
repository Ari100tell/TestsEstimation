package edu.cads.testestimation.database.hibernate.DAO;

import edu.cads.testestimation.database.hibernate.logic.IntroducingResults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface IntroducingResultsDAO {
    public void addIntroducingResults(IntroducingResults introducingResults) throws SQLException;

    public void updateIntroducingResults(IntroducingResults introducingResults) throws SQLException;

    public IntroducingResults getIntroducingResultsByNumber(Integer introducingResultNumber) throws SQLException;

    public List getAllIntroducingResults() throws SQLException;

    public void deleteIntroducingResults(IntroducingResults introducingResults) throws SQLException;
}

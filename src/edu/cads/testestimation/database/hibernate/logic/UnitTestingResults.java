package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ari100tell on 16.03.2014.
 */

@Entity
@Table(name = "UNIT_TESTING_RESULTS")
public class UnitTestingResults {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer unitTestingNumber;
    private String systemName;
    private Integer totalBugs;
    private int evaluationRegressionTesting;
    private int mockObjectNumber;
    private int coverRatioUnitTests;
    private Integer reportedBugsNumber;
    private Integer totalBugFixes;
    private String testingData;

    public String getTestingData() {
        return testingData;
    }

    public void setTestingData(String testingData) {
        this.testingData = testingData;
    }

    public Integer getTotalBugFixes() {
        return totalBugFixes;
    }

    public void setTotalBugFixes(Integer totalBugFixes) {
        this.totalBugFixes = totalBugFixes;
    }

    public Integer getReportedBugsNumber() {
        return reportedBugsNumber;
    }

    public void setReportedBugsNumber(Integer reportedBugsNumber) {
        this.reportedBugsNumber = reportedBugsNumber;
    }

    public int getCoverRatioUnitTests() {
        return coverRatioUnitTests;
    }

    public void setCoverRatioUnitTests(int coverRatioUnitTests) {
        this.coverRatioUnitTests = coverRatioUnitTests;
    }

    public int getMockObjectNumber() {
        return mockObjectNumber;
    }

    public void setMockObjectNumber(int mockObjectNumber) {
        this.mockObjectNumber = mockObjectNumber;
    }

    public int getEvaluationRegressionTesting() {
        return evaluationRegressionTesting;
    }

    public void setEvaluationRegressionTesting(int evaluationRegressionTesting) {
        this.evaluationRegressionTesting = evaluationRegressionTesting;
    }

    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Integer getUnitTestingNumber() {
        return unitTestingNumber;
    }

    public void setUnitTestingNumber(Integer unitTestingNumber) {
        this.unitTestingNumber = unitTestingNumber;
    }
}

package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UNIT_TESTING_RESULTS")
public class UnitTestingResults implements Serializable {


    private Integer unitTestingNumber;
    private String systemName;
    private Integer totalBugs;
    private Integer evaluationRegressionTesting;
    private Integer mockObjectNumber;
    private Integer coverRatioUnitTests;
    private Integer reportedBugsNumber;
    private Integer totalBugFixes;
    private String testingDate;
    private Integer projectId;
    private Integer branchId;


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")


    @Column(name = "UNIT_TESTING_NUMBER")
    public Integer getUnitTestingNumber() {
        return unitTestingNumber;
    }

    public void setUnitTestingNumber(Integer unitTestingNumber) {
        this.unitTestingNumber = unitTestingNumber;
    }

    @Column(name = "SYSTEM_NAME")
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Column(name = "TOTAL_BUGS")
    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    @Column(name = "EVALUATION_REGRESSION_TESTING")
    public Integer getEvaluationRegressionTesting() {
        return evaluationRegressionTesting;
    }

    public void setEvaluationRegressionTesting(Integer evaluationRegressionTesting) {
        this.evaluationRegressionTesting = evaluationRegressionTesting;
    }

    @Column(name = "MOCK_OBJECT_NUMBER")
    public Integer getMockObjectNumber() {
        return mockObjectNumber;
    }

    public void setMockObjectNumber(Integer mockObjectNumber) {
        this.mockObjectNumber = mockObjectNumber;
    }

    @Column(name = "COVER_RATIO_UNIT_TESTS")
    public Integer getCoverRatioUnitTests() {
        return coverRatioUnitTests;
    }

    public void setCoverRatioUnitTests(Integer coverRatioUnitTests) {
        this.coverRatioUnitTests = coverRatioUnitTests;
    }

    @Column(name = "REPORTED_BUGS_NUMBER")
    public Integer getReportedBugsNumber() {
        return reportedBugsNumber;
    }

    public void setReportedBugsNumber(Integer reportedBugsNumber) {
        this.reportedBugsNumber = reportedBugsNumber;
    }

    @Column(name = "TOTAL_BUG_FIXES")
    public Integer getTotalBugFixes() {
        return totalBugFixes;
    }

    public void setTotalBugFixes(Integer totalBugFixes) {
        this.totalBugFixes = totalBugFixes;
    }

    @Column(name = "TESTING_DATE")
    public String getTestingDate() {
        return testingDate;
    }

    public void setTestingDate(String testingDate) {
        this.testingDate = testingDate;
    }

    private Set<InternalTestingResults> internalTestingResultsSet = new HashSet<InternalTestingResults>(0);

    @Column(name = "PROJECT_ID")
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Column(name = "BRANCH_ID")
    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @OneToMany
    @JoinColumn(name = "UNIT_TESTING_NUMBER")
    public Set<InternalTestingResults> getInternalTestingResultsSet() {
        return internalTestingResultsSet;
    }

    public void setInternalTestingResultsSet(Set<InternalTestingResults> internalTestingResultsSet) {
        this.internalTestingResultsSet = internalTestingResultsSet;
    }
}

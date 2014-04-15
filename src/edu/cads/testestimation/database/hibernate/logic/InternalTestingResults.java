package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INTERNAL_TESTING_RESULTS")


public class InternalTestingResults implements Serializable {


    private Integer internalResultNumber;
    private String internalResultDate;
    private Integer systemTestingNumber;
    private Integer unitTestingNumber;
    private Integer userRating;
    private Integer percentEfficiencySoftware;
    private Integer fixesBugsPercent;
    private Integer criticalStrikeChanceBug;
    private Integer availabilityMajorBugs;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "INTERNAL_RESULTS_NUMBER")
    public Integer getInternalResultNumber() {
        return internalResultNumber;
    }

    public void setInternalResultNumber(Integer internalResultNumber) {
        this.internalResultNumber = internalResultNumber;
    }

    @Column(name = "AVAILABILITY_MAJOR_BUGS")
    public Integer getAvailabilityMajorBugs() {
        return availabilityMajorBugs;
    }

    public void setAvailabilityMajorBugs(Integer availabilityMajorBugs) {
        this.availabilityMajorBugs = availabilityMajorBugs;
    }

    @Column(name = "CRITICAL_STRIKE_CHANCE_BUG")
    public Integer getCriticalStrikeChanceBug() {
        return criticalStrikeChanceBug;
    }

    public void setCriticalStrikeChanceBug(Integer criticalStrikeChanceBug) {
        this.criticalStrikeChanceBug = criticalStrikeChanceBug;
    }

    @Column(name = "FIXES_BUGS_PERCENT")
    public Integer getFixesBugsPercent() {
        return fixesBugsPercent;
    }

    public void setFixesBugsPercent(Integer fixesBugsPercent) {
        this.fixesBugsPercent = fixesBugsPercent;
    }

    @Column(name = "PERCENT_EFFICIENCY_SOFTWARE")
    public Integer getPercentEfficiencySoftware() {
        return percentEfficiencySoftware;
    }

    public void setPercentEfficiencySoftware(Integer percentEfficiencySoftware) {
        this.percentEfficiencySoftware = percentEfficiencySoftware;
    }

    @Column(name = "USER_RATING")
    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }

    @Column(name = "UNIT_TESTING_NUMBER")
    public Integer getUnitTestingNumber() {
        return unitTestingNumber;
    }

    public void setUnitTestingNumber(Integer unitTestingNumber) {
        this.unitTestingNumber = unitTestingNumber;
    }

    @Column(name = "SYSTEM_TESTING_NUMBER")
    public Integer getSystemTestingNumber() {
        return systemTestingNumber;
    }

    public void setSystemTestingNumber(Integer systemTestingNumber) {
        this.systemTestingNumber = systemTestingNumber;
    }

    @Column(name = "INTERNAL_RESULTS_DATE")
    public String getInternalResultDate() {
        return internalResultDate;
    }

    public void setInternalResultDate(String internalResultDate) {
        this.internalResultDate = internalResultDate;
    }


    private UnitTestingResults unitTestingResults;

    @ManyToOne
    @JoinColumn(name = "UNIT_TESTING_NUMBER", referencedColumnName = "UNIT_TESTING_NUMBER", insertable = false, updatable = false)
    public UnitTestingResults getUnitTestingResults() {
        return unitTestingResults;
    }

    public void setUnitTestingResults(UnitTestingResults unitTestingResults) {
        this.unitTestingResults = unitTestingResults;
    }

    private SystemTestingResults systemTestingResults;

    @ManyToOne
    @JoinColumn(name = "SYSTEM_TESTING_NUMBER", referencedColumnName = "SYSTEM_TESTING_NUMBER", insertable = false, updatable = false)
    public SystemTestingResults getSystemTestingResults() {
        return systemTestingResults;
    }

    public void setSystemTestingResults(SystemTestingResults systemTestingResults) {
        this.systemTestingResults = systemTestingResults;
    }

    private Set<EstimationResults> estimationResultsSet = new HashSet<EstimationResults>(0);

    @OneToMany
    @JoinColumn(name = "INTERNAL_RESULTS_NUMBER")
    public Set<EstimationResults> getEstimationResultsSet() {
        return estimationResultsSet;
    }

    public void setEstimationResultsSet(Set<EstimationResults> estimationResultsSet) {
        this.estimationResultsSet = estimationResultsSet;
    }

}

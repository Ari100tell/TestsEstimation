package edu.cads.testestimation.database.hibernate.logic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERNAL_TESTING_RESULTS")


public class InternalTestingResults {
    @Id
    private String internalResultDate;
    private Integer systemTestingNumber;
    private Integer unitTestingNumber;
    private Integer userRating;
    private Integer percentEfficiencySoftware;
    private Integer fixesBugsPercent;
    private Integer criticalStrikeChanceBug;
    private Integer availabilityMajorBugs;


    public String getInternalResultDate() {
        return internalResultDate;
    }

    public void setInternalResultDate(String internalResultDate) {
        this.internalResultDate = internalResultDate;
    }

    public Integer getAvailabilityMajorBugs() {
        return availabilityMajorBugs;
    }

    public void setAvailabilityMajorBugs(Integer availabilityMajorBugs) {
        this.availabilityMajorBugs = availabilityMajorBugs;
    }

    public Integer getCriticalStrikeChanceBug() {
        return criticalStrikeChanceBug;
    }

    public void setCriticalStrikeChanceBug(Integer criticalStrikeChanceBug) {
        this.criticalStrikeChanceBug = criticalStrikeChanceBug;
    }

    public Integer getFixesBugsPercent() {
        return fixesBugsPercent;
    }

    public void setFixesBugsPercent(Integer fixesBugsPercent) {
        this.fixesBugsPercent = fixesBugsPercent;
    }

    public Integer getPercentEfficiencySoftware() {
        return percentEfficiencySoftware;
    }

    public void setPercentEfficiencySoftware(Integer percentEfficiencySoftware) {
        this.percentEfficiencySoftware = percentEfficiencySoftware;
    }

    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }

    public Integer getUnitTestingNumber() {
        return unitTestingNumber;
    }

    public void setUnitTestingNumber(Integer unitTestingNumber) {
        this.unitTestingNumber = unitTestingNumber;
    }

    public Integer getSystemTestingNumber() {
        return systemTestingNumber;
    }

    public void setSystemTestingNumber(Integer systemTestingNumber) {
        this.systemTestingNumber = systemTestingNumber;
    }


}

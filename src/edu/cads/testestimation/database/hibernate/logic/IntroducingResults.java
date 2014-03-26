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
@Table(name = "INTRODUCING_RESULTS")
public class IntroducingResults {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    private Integer introducingResultNumber;
    private String introducingResultDate;
    private Integer totalBugs;
    private Integer totalUserEstimation;
    private Integer fundsSpentOnImplementation;
    private Integer stability;
    private Integer preliminaryIncome;

    public Integer getPreliminaryIncome() {
        return preliminaryIncome;
    }

    public void setPreliminaryIncome(Integer preliminaryIncome) {
        this.preliminaryIncome = preliminaryIncome;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public Integer getFundsSpentOnImplementation() {
        return fundsSpentOnImplementation;
    }

    public void setFundsSpentOnImplementation(Integer fundsSpentOnImplementation) {
        this.fundsSpentOnImplementation = fundsSpentOnImplementation;
    }

    public int getTotalUserEstimation() {
        return totalUserEstimation;
    }

    public void setTotalUserEstimation(int totalUserEstimation) {
        this.totalUserEstimation = totalUserEstimation;
    }

    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    public String getIntroducingResultDate() {
        return introducingResultDate;
    }

    public void setIntroducingResultDate(String introducingResultDate) {
        this.introducingResultDate = introducingResultDate;
    }

    public Integer getIntroducingResultNumber() {
        return introducingResultNumber;
    }

    public void setIntroducingResultNumber(Integer introducingResultNumber) {
        this.introducingResultNumber = introducingResultNumber;
    }
}

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
@Table(name = "IMPLEMENTATION_PLAN")
public class ImplementationPlan {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    private Integer implementationPlanNumber;
    private String implementationPlanName;
    private String estimationDate;
    private Integer expectedIncome;
    private String stability;
    private int totalBugs;
    private int totalUserEstimation;

    public int getTotalUserEstimation() {
        return totalUserEstimation;
    }

    public void setTotalUserEstimation(int totalUserEstimation) {
        this.totalUserEstimation = totalUserEstimation;
    }

    public int getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(int totalBugs) {
        this.totalBugs = totalBugs;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public Integer getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(Integer expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    public String getEstimationDate() {
        return estimationDate;
    }

    public void setEstimationDate(String estimationDate) {
        this.estimationDate = estimationDate;
    }

    public String getImplementationPlanName() {
        return implementationPlanName;
    }

    public void setImplementationPlanName(String implementationPlanName) {
        this.implementationPlanName = implementationPlanName;
    }

    public Integer getImplementationPlanNumber() {
        return implementationPlanNumber;
    }

    public void setImplementationPlanNumber(Integer implementationPlanNumber) {
        this.implementationPlanNumber = implementationPlanNumber;
    }
}

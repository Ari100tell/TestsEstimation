package edu.cads.testestimation.database.hibernate.logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "IMPLEMENTATION_PLAN")
public class ImplementationPlan implements Serializable {


    private Integer implementationPlanNumber;
    private String implementationPlanName;
    private String implementationDate;
    private Integer expectedIncome;
    private Integer stability;
    private Integer totalBugs;
    private Integer totalUserEstimation;

    @Id      /*
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
               */
    @Column(name = "IMPLEMENTATION_PLAN_NUMBER")
    public Integer getImplementationPlanNumber() {
        return implementationPlanNumber;
    }

    public void setImplementationPlanNumber(Integer implementationPlanNumber) {
        this.implementationPlanNumber = implementationPlanNumber;}

    @Column(name = "TOTAL_USER_ESTIMATION")
    public Integer getTotalUserEstimation() {
        return totalUserEstimation;
    }

    public void setTotalUserEstimation(Integer totalUserEstimation) {
        this.totalUserEstimation = totalUserEstimation;
    }

    @Column(name = "TOTAL_BUGS")
    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    @Column(name = "STABILITY")
    public Integer getStability() {
        return stability;
    }

    public void setStability(Integer stability) {
        this.stability = stability;
    }

    @Column(name = "EXPECTED_INCOME")
    public Integer getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(Integer expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    @Column(name = "IMPLEMENTATION_DATE")
    public String getImplementationDate() {
        return implementationDate;
    }

    public void setImplementationDate(String estimationDate) {
        this.implementationDate = estimationDate;
    }

    @Column(name = "IMPLEMENTATION_PLAN_NAME")
    public String getImplementationPlanName() {
        return implementationPlanName;
    }

    public void setImplementationPlanName(String implementationPlanName) {
        this.implementationPlanName = implementationPlanName;
    }
}

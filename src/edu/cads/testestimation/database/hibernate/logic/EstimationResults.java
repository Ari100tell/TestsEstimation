package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ESTIMATION_RESULTS")
public class EstimationResults implements Serializable {
    private Integer estimationNumber;
    private String estimationDate;
    private Integer internalResultsNumber;
    private Integer introducingResultNumber;
    private Integer implementationPlanNumber;
    private Integer successProbability;
    private Long expectedIncome;
    private boolean needIntroduction;


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    @Column(name = "ESTIMATION_NUMBER")
    public Integer getEstimationNumber() {
        return estimationNumber;
    }

    public void setEstimationNumber(Integer estimationNumber) {
        this.estimationNumber = estimationNumber;
    }

    @Column(name = "ESTIMATION_DATE")
    public String getEstimationDate() {
        return estimationDate;
    }

    public void setEstimationDate(String estimationDate) {
        this.estimationDate = estimationDate;
    }

    @Column (name = "INTERNAL_RESULTS_NUMBER")

    public Integer getInternalResultsNumber() {
        return internalResultsNumber;
    }

    public void setInternalResultsNumber(Integer internalResultsNumber) {
        this.internalResultsNumber = internalResultsNumber;
    }

    @Column(name = "INTRODUCING_RESULT_NUMBER")
    public Integer getIntroducingResultNumber() {
        return introducingResultNumber;
    }

    public void setIntroducingResultNumber(Integer introducing_Result_Number) {
        this.introducingResultNumber = introducing_Result_Number;
    }

    @Column(name = "IMPLEMENTATION_PLAN_NUMBER")

    public Integer getImplementationPlanNumber() {
        return implementationPlanNumber;
    }

    public void setImplementationPlanNumber(Integer implementationPlanNumber) {
        this.implementationPlanNumber = implementationPlanNumber;
    }

    @Column(name = "SUCCESS_PROBABILITY")
    public Integer getSuccessProbability() {
        return successProbability;
    }

    public void setSuccessProbability(Integer successProbability) {
        this.successProbability = successProbability;
    }

    @Column(name = "EXPECTED_INCOME")
    public Long getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(Long expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    @Column(name = "NEED_INTRODUCTION")
    public boolean isNeedIntroduction() {
        return needIntroduction;
    }

    public void setNeedIntroduction(boolean needIntroduction) {
        this.needIntroduction = needIntroduction;
    }


}

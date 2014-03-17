package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ESTIMATION_RESULTS")
public class EstimationResults {
    private Integer estimationNumber;
    private String estimationDate;
    private String internalResultsDate;
    private Integer introducingResultNumber;
    private String implementationPlanName;
    private int implementationPlanVersion;
    private int successProbability;
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
     @Column (name = "INTERNAL_RESULTS_DATE")
    public String getInternalResultsDate() {
        return internalResultsDate;
    }

    public void setInternalResultsDate(String internal_results_date) {
        this.internalResultsDate = internal_results_date;
    }

    @Column(name = "INTRODUCING_RESULT_NUMBER")
    public Integer getIntroducingResultNumber() {
        return introducingResultNumber;
    }

    public void setIntroducingResultNumber(Integer introducing_Result_Number) {
        this.introducingResultNumber = introducing_Result_Number;
    }

    @Column(name = "IMPLEMENTATION_PLAN_NAME")
    public String getImplementationPlanName() {
        return implementationPlanName;
    }

    public void setImplementationPlanName(String name) {
        this.implementationPlanName = name;
    }

    @Column(name = "IMPLEMENTATION_PLAN_VERSION")
    public int getImplementationPlanVersion() {
        return implementationPlanVersion;
    }

    public void setImplementationPlanVersion(int version) {
        this.implementationPlanVersion = version;
    }

    @Column(name = "SUCCESS_PROBABILITY")
    public int getSuccessProbability() {
        return successProbability;
    }

    public void setSuccessProbability(int successProbability) {
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

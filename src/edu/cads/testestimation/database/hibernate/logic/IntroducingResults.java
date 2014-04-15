package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INTRODUCING_RESULTS")
public class IntroducingResults implements Serializable {

    private Integer introducingResultNumber;
    private String introducingResultDate;
    private Integer totalBugs;
    private Integer totalUserEstimation;
    private Integer fundsSpentOnImplementation;
    private Integer preliminaryIncome;
    private Integer stability;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "INTRODUCING_RESULT_NUMBER")
    public Integer getIntroducingResultNumber() {
        return introducingResultNumber;
    }

    public void setIntroducingResultNumber(Integer introducingResultNumber) {
        this.introducingResultNumber = introducingResultNumber;
    }

    @Column(name = "STABILITY")
    public Integer getStability() {
        return stability;
    }

    public void setStability(Integer stability) {
        this.stability = stability;
    }

    @Column(name = "PRELIMINARY_INCOME")
    public Integer getPreliminaryIncome() {
        return preliminaryIncome;
    }

    public void setPreliminaryIncome(Integer preliminaryIncome) {
        this.preliminaryIncome = preliminaryIncome;
    }

    @Column(name = "FUNDS_SPENT_ON_IMPLEMENTATION")
    public Integer getFundsSpentOnImplementation() {
        return fundsSpentOnImplementation;
    }

    public void setFundsSpentOnImplementation(Integer fundsSpentOnImplementation) {
        this.fundsSpentOnImplementation = fundsSpentOnImplementation;
    }

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

    @Column(name = "INTRODUCING_RESULT_DATE")
    public String getIntroducingResultDate() {
        return introducingResultDate;
    }

    public void setIntroducingResultDate(String introducingResultDate) {
        this.introducingResultDate = introducingResultDate;
    }

    private Set<EstimationResults> estimationResultsSet = new HashSet<EstimationResults>(0);

    @OneToMany
    @JoinColumn(name = "INTRODUCING_RESULT_NUMBER")
    public Set<EstimationResults> getEstimationResultsSet() {
        return estimationResultsSet;
    }

    public void setEstimationResultsSet(Set<EstimationResults> estimationResultsSet) {
        this.estimationResultsSet = estimationResultsSet;
    }

}

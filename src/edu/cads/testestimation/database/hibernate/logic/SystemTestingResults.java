package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SYSTEM_TESTING_RESULTS")
public class SystemTestingResults implements Serializable {


    private Integer systemTestingNumber;
    private String systemName;
    private Integer totalBugs;
    private Integer totalBugFixes;
    private String testingDate;
    private Integer evaluationUsability;
    private Integer exerciseTestingEvaluation;
    private Integer evaluationUI;
    private Integer evaluationCompatibility;
    private Integer evaluationSafety;
    private Integer evaluationPerformance;


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
     @Column(name = "SYSTEM_TESTING_NUMBER")
    public Integer getSystemTestingNumber() {
        return systemTestingNumber;
    }

    public void setSystemTestingNumber(Integer systemTestingNumber) {
        this.systemTestingNumber = systemTestingNumber;
    }

    @Column(name = "EVALUATION_PERFORMANCE")
    public Integer getEvaluationPerformance() {
        return evaluationPerformance;
    }

    public void setEvaluationPerformance(Integer evaluationPerformance) {
        this.evaluationPerformance = evaluationPerformance;
    }

    @Column(name = "EVALUATION_SAFETY")
    public Integer getEvaluationSafety() {
        return evaluationSafety;
    }

    public void setEvaluationSafety(Integer evaluationSafety) {
        this.evaluationSafety = evaluationSafety;
    }

    @Column(name = "EVALUATION_COMPATIBILITY")
    public Integer getEvaluationCompatibility() {
        return evaluationCompatibility;
    }

    public void setEvaluationCompatibility(Integer evaluationCompatibility) {
        this.evaluationCompatibility = evaluationCompatibility;
    }

    @Column(name = "EVALUATION_UI")
    public Integer getEvaluationUI() {
        return evaluationUI;
    }

    public void setEvaluationUI(Integer evaluationUI) {
        this.evaluationUI = evaluationUI;
    }

    @Column(name = "EXERCISE_TESTING_EVALUATION")
    public Integer getExerciseTestingEvaluation() {
        return exerciseTestingEvaluation;
    }

    public void setExerciseTestingEvaluation(Integer exerciseTestingEvaluation) {
        this.exerciseTestingEvaluation = exerciseTestingEvaluation;
    }

    @Column(name = "EVALUATION_USABILITY")
    public Integer getEvaluationUsability() {
        return evaluationUsability;
    }

    public void setEvaluationUsability(Integer evaluationUsability) {
        this.evaluationUsability = evaluationUsability;
    }

    @Column(name = "TESTING_DATE")
    public String getTestingDate() {
        return testingDate;
    }

    public void setTestingDate(String testingDate) {
        this.testingDate = testingDate;
    }

    @Column(name = "TOTAL_BUG_FIXES")
    public Integer getTotalBugFixes() {
        return totalBugFixes;
    }

    public void setTotalBugFixes(Integer totalBugFixes) {
        this.totalBugFixes = totalBugFixes;
    }

    @Column(name = "TOTAL_BUGS")
    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    @Column(name = "SYSTEM_NAME")
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}

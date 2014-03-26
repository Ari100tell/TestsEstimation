package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERNAL_TESTING_RESULTS")
public class SystemTestingResults {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer systemTestingNumber;
    private String systemName;
    private Integer totalBugs;
    private Integer totalBugFixes;
    private String testingData;
    private int evaluationUsability;
    private int exerciseTestingEvaluation;
    private int evaluationUI;
    private int evaluationCompatibility;
    private int evaluationSafety;
    private int evaluationPerformance;

    public int getEvaluationPerformance() {
        return evaluationPerformance;
    }

    public void setEvaluationPerformance(int evaluationPerformance) {
        this.evaluationPerformance = evaluationPerformance;
    }

    public int getEvaluationSafety() {
        return evaluationSafety;
    }

    public void setEvaluationSafety(int evaluationSafety) {
        this.evaluationSafety = evaluationSafety;
    }

    public int getEvaluationCompatibility() {
        return evaluationCompatibility;
    }

    public void setEvaluationCompatibility(int evaluationCompatibility) {
        this.evaluationCompatibility = evaluationCompatibility;
    }

    public int getEvaluationUI() {
        return evaluationUI;
    }

    public void setEvaluationUI(int evaluationUI) {
        this.evaluationUI = evaluationUI;
    }

    public int getExerciseTestingEvaluation() {
        return exerciseTestingEvaluation;
    }

    public void setExerciseTestingEvaluation(int exerciseTestingEvalution) {
        this.exerciseTestingEvaluation = exerciseTestingEvalution;
    }

    public int getEvaluationUsability() {
        return evaluationUsability;
    }

    public void setEvaluationUsability(int evaluationUsability) {
        this.evaluationUsability = evaluationUsability;
    }

    public String getTestingData() {
        return testingData;
    }

    public void setTestingData(String testingData) {
        this.testingData = testingData;
    }

    public Integer getTotalBugFixes() {
        return totalBugFixes;
    }

    public void setTotalBugFixes(Integer totalBugFixes) {
        this.totalBugFixes = totalBugFixes;
    }

    public Integer getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(Integer totalBugs) {
        this.totalBugs = totalBugs;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Integer getSystemTestingNumber() {
        return systemTestingNumber;
    }

    public void setSystemTestingNumber(Integer systemTestingNumber) {
        this.systemTestingNumber = systemTestingNumber;
    }
}

package edu.cads.testestimation.database.hibernate.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PROJECTS")
public class Projects implements Serializable {
    private Integer projectId;
    private String projectCreationTime;
    private String projectDescription;
    private String userName;
    private String projectName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")

    @Column(name = "PROJECT_ID")
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    @Column(name = "PROJECT_CREATION_TIME")
    public String getProjectCreationTime() {
        return projectCreationTime;
    }

    public void setProjectCreationTime(String projectCreationTime) {
        this.projectCreationTime = projectCreationTime;
    }
    @Column(name = "PROJECT_DESCRIPTION")
    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "PROJECT_NAME")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}

package test.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Statistics")
public class Statistics {

    private Long stid;
    private Long id;
    private Long tid;

    public Statistics(){
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="stid")
    public Long getStid(){
        return stid;
    }

    @Column(name="id")
    public Long getId(){
        return id;
    }

    @Column(name="tid")
    public Long getTid(){
        return tid;
    }
    private Statistics stat;

    private Set<Student> studs = new HashSet<Student>(0);

    @OneToMany
    @JoinColumn(name = "id")
    public Set<Student> getStuds() {
        return studs;
    }

    private Set<Test> tests = new HashSet<Test>(0);

    @OneToMany
    @JoinColumn(name = "tid")
    public Set<Test> getTests() {
        return tests;
    }


    public void setStid(Long stid) {
        this.stid = stid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setStat(Statistics stat) {
        this.stat = stat;
    }

    public void setStuds(Set<Student> studs) {
        this.studs = studs;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }
}
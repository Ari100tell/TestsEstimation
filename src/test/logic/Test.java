package test.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Test")
public class Test implements Serializable {


    private Long tid;
    private String tname;

    public Test(){
        tname = null;
    }

    public Test(Test s){
        tname = s.getTName();
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setStat(Statistics stat) {
        this.stat = stat;
    }


    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="tid")
    public Long getTid() {
        return tid;
    }

    @Column(name="tname")
    public String getTName(){
        return tname;
    }

    public void setId(Long i){
        tid = i;
    }

    public void setTName(String s){
        tname = s;
    }

    private Statistics stat;

    @ManyToOne
    @JoinColumn(name = "tid")
    public Statistics getStat(){
        return stat;
    }

}
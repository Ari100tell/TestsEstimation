package test.logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {

    private Long id;
    private String name;
    private Long age;

    public void setStat(Statistics stat) {
        this.stat = stat;
    }

    public Student(){
        name = null;
    }

    public Student(Student s){
        name = s.getName();
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long i){
        id = i;
    }

    @Column(name="name")
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }

    @Column(name="age")
    public Long getAge(){
        return age;
    }
    public void setAge(Long l){
        age = l;
    }

    private Statistics stat;

    @ManyToOne
    @JoinColumn(name = "id")
    public Statistics getStat(){
        return stat;
    }
}
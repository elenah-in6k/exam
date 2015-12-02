package core.entity;

import javax.persistence.*;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name="subjects")
public class Subject {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;


    public Subject(){}

    public Subject(String name){
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

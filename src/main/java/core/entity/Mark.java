package core.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by employee on 12/2/15.
 */
@Entity
@Table(name = "marks")
public class Mark implements Serializable {
    @Id
    @Column(name = "idStudent")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudent;

    @Id
    @Column(name = "idSubject")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubject;

    @Column(name = "mark", nullable = false)
    private int mark;


    public Mark() {
    }

    public Mark(int idStudent, int idSubject, int mark) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.mark = mark;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public void setMark(int mark) {
        this.mark = mark;

    }

    public int getIdStudent() {
        return idStudent;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public int getMark() {
        return mark;

    }
}

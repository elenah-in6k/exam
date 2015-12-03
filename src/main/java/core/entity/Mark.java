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
    @ManyToOne
    @JoinColumn(name = "idStudent")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "idSubject")

    private Subject subject;

    @Column(name = "mark", nullable = false)
    private int mark;


    public Mark() {
    }

    public Mark(Student student, Subject subject, int mark) {
        this.student = student;
        this.subject = subject;
        this.mark = mark;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setMark(int mark) {
        this.mark = mark;

    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;

    }
}

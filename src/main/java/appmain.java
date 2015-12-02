import core.entity.Student;
import core.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import persistance.StudentDaoImpl;

import java.text.ParseException;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public class appmain {


    static public void main(String[] s){
        StudentService studentService = new StudentService();
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student.getName());
        }

    }
}

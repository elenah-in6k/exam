package core.services;

import core.dao.StudentDao;
import core.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistance.StudentDaoImpl;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Service("studentService")
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAll();
    }

    public Student createStudent(Student student) {
        return studentDao.create(student);
    }

    public Student findStudentById(int id) {
        return studentDao.read(id);
    }

    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        studentDao.delete(student);
    }
}

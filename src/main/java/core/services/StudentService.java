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
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    List<Student> getAllStudents() {
        return studentDao.getAll();
    }

    Student createStudent(Student student) {
        return studentDao.create(student);
    }

    Student findStudentById(int id) {
        return studentDao.read(id);
    }

    void deleteStudent(Student student) {
        studentDao.delete(student);
    }
}

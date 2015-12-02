package controllers;

import core.entity.Student;
import core.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@RestController
@Controller
@RequestMapping(value = "/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/", method = RequestMethod.POST)
    public void addCity(@RequestBody Student student) {
        studentService.createStudent(student);

    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteCity(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);

    }
}

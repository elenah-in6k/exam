package controllers;

import core.entity.Subject;
import core.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
@RestController
@Controller
@RequestMapping(value = "/")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/subjects", method = RequestMethod.GET)
    List<Subject> getSubject(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(value = "/subjects/", method = RequestMethod.POST)
    public void addSubject(@RequestBody Subject student) {
        subjectService.createSubject(student);

    }

    @RequestMapping(value = "/subjects/{id}", method = RequestMethod.DELETE)
    public void deleteSubject(@PathVariable("id") Integer id) {
        subjectService.deleteSubject(id);
    }
}

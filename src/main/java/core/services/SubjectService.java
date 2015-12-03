package core.services;

import core.dao.SubjectDao;
import core.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
@Service("subjectService")
public class SubjectService {
    @Autowired
    SubjectDao subjectDao;

    public List<Subject> getAllSubjects() {
        return subjectDao.getAll();
    }

    public Subject createSubject(Subject student) {
        return subjectDao.create(student);
    }

    public Subject findSubjectById(int id) {
        return subjectDao.read(id);
    }

    public void deleteSubject(int id) {
        Subject student = findSubjectById(id);
        subjectDao.delete(student);
    }


}

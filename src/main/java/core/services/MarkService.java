package core.services;


import core.dao.MarkDao;

import core.entity.Mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
@Service("markService")
public class MarkService {
    @Autowired
    MarkDao markDao;

    public List<Mark> getAllMarks() {
        return markDao.getAll();
    }

    public Mark createMark(Mark mark) {
        return markDao.create(mark);
    }

    public Mark findMarkById(int id) {
        return markDao.read(id);
    }

    public void deleteMark(int id) {
        Mark mark = findMarkById(id);
        markDao.delete(mark);
    }
}

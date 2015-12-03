package core.dao;

import core.entity.Mark;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public interface MarkDao extends BaseDao<Mark> {

    public List<Mark> getTopMarks();
}

package persistance;

import core.dao.StudentDao;
import core.entity.Student;

import org.springframework.stereotype.Repository;

/**
 * Created by employee on 12/2/15.
 */
@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {
    public StudentDaoImpl() {
        super();
    }

}

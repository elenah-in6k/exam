package persistance;

import core.dao.SubjectDao;
import core.entity.Subject;
import org.springframework.stereotype.Repository;

/**
 * Created by employee on 12/2/15.
 */
@Repository("subjectDao")
public class SubjectDaoImpl extends BaseDaoImpl<Subject> implements SubjectDao {
}

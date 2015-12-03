package persistance;

import core.dao.MarkDao;
import core.entity.Mark;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository("markDao")
public class MarkDaoImpl extends BaseDaoImpl<Mark> implements MarkDao {
    public MarkDaoImpl() {
        super();
    }


    public List<Mark> getTopMarks() {
        Query query = getSession()
                .createSQLQuery("select * from (select * from marks order by mark desc) as T  group by idSubject;").addEntity(Mark.class);
        return query.list();
    }
}


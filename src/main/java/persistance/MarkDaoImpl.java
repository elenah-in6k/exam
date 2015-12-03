package persistance;

import core.dao.MarkDao;
import core.entity.Mark;
import org.springframework.stereotype.Repository;

/**
 * Created by employee on 12/2/15.
 */
@Repository("markDao")
public class MarkDaoImpl extends BaseDaoImpl<Mark> implements MarkDao {
    public MarkDaoImpl() {
        super();
    }
}

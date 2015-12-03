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

    public List<Mark> getAllMarks() {
//        Query query = getSession()
//                .createQuery("from core.entity.Mark m" +
//                        "join core.entity.Student st on (m.idStudent = st.id)" +
//                        "join core.entity.Subject sb on (m.idSubject = sb.id) ");
//
        return null;
    }
}

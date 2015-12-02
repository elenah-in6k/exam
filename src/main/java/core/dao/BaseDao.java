package core.dao;

import javax.annotation.Resources;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */

public interface BaseDao<T> {
    T create(T t);

    T read(int id);

    void delete(T t);

    List<T> getAll();
}

package core.persistance;

import core.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    protected SessionFactory sessionFactory;
    public Class<T> entityClass;

    public BaseDaoImpl() {
        Class<T> currentClass;
        try {
            currentClass = getTypeOfClass();
        } catch (Exception e) {
            currentClass = null;
        }
        this.entityClass = currentClass;
    }

    @SuppressWarnings("unchecked")
    private Class<T> getTypeOfClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T create(T t) {
        getSession().persist(t);
        return t;
    }

    public T read(int id) {
        return getSession().get(entityClass, id);
    }

    public void update(T t) {
        getSession().update(t);
    }


    public void delete(T t) {

        getSession().delete(t);
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return getSession().createCriteria(entityClass).list();
    }

}

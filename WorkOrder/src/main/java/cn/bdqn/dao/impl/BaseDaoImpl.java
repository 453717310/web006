package cn.bdqn.dao.impl;

import cn.bdqn.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by dll on 2017/7/28.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    private SessionFactory sessionFactory;

    /**
     * 返回session 对象
     * @return
     */
    private Session getCurrentSession(){
        Session session= sessionFactory.getCurrentSession();
        return session;

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(T t) {
        sessionFactory.getCurrentSession().save(t);
    }

    @Override
    public void delete(T t) {
        sessionFactory.getCurrentSession().delete(t);
    }

    @Override
    public void update(T t) {
        sessionFactory.getCurrentSession().update(t);
    }

    @Override
    public List<T> findList(String hql) {
        return  sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public List<T> findList(String hql, Integer pageIndex, Integer pageSize) {
        return getCurrentSession().createQuery(hql).setFirstResult(pageIndex)
                .setMaxResults(pageSize).list();
    }

    @Override
    public long findCount(String hql) {

        return (Long) getCurrentSession().createQuery(hql).uniqueResult();
    }
}

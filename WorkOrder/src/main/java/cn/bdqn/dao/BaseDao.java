package cn.bdqn.dao;

import java.util.List;

/**
 * Created by dll on 2017/7/28.
 * 公共的Dao
 */
public interface BaseDao<T> {
    /**
     * 添加
     * @param t
     */
    void add(T t);

    /**
     * 删除
     * @param t
     */
    void delete(T t);

    /**
     * 修改
     * @param t
     */
    void update(T t);

    /**
     * 查询所有
     * @param hql
     * @return
     */
    List<T> findList(String hql);

    List<T> findList(String hql,Integer pageIndex,Integer pageSize);

    long findCount(String hql);

}

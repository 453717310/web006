package cn.bdqn.service;

/**
 * Created by dll on 2017/7/
 * 公共的service层
 */
public interface SuperService<T> {
    /**
     * 添加
     * @param t
     */
    boolean add(T t);

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




}

package cn.bdqn.service;

import cn.bdqn.bean.Project;
import cn.bdqn.bean.Workorder;

import java.util.List;

/**
 * Created by dll on 2017/7/29.
 */
public interface WorkorderService extends SuperService<Workorder> {

    /**
     * 查询所有项目
     * @return
     */
    List<Workorder> findList(Integer pageSize,Integer pageIndex,Integer id);

    Integer findCount(Integer id);
}

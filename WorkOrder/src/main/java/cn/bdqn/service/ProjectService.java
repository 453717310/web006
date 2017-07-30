package cn.bdqn.service;

import cn.bdqn.bean.Project;
import cn.bdqn.dao.BaseDao;

import java.util.List;

/**
 * Created by dll on 2017/7/28.
 */
public interface ProjectService extends SuperService<Project>{
    /**
     * 查询所有项目
     * @return
     */
     List<Project> findList();

}

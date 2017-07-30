package cn.bdqn.service.impl;

import cn.bdqn.bean.Project;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.ProjectService;

import java.util.List;

/**
 * Created by dll on 2017/7/28.
 */
public class ProjectServiceImpl implements ProjectService {
    private BaseDao<Project> dao;

    public BaseDao<Project> getDao() {
        return dao;
    }

    public void setDao(BaseDao<Project> dao) {
        this.dao = dao;
    }

    @Override
    public List<Project> findList() {
        return dao.findList("from Project");
    }

    @Override
    public boolean add(Project project) {

        try {
            dao.add(project);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;

    }

    @Override
    public void delete(Project project) {
        dao.delete(project);
    }

    @Override
    public void update(Project project) {
        dao.update(project);
    }
}

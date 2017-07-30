package cn.bdqn.service.impl;

import cn.bdqn.bean.Workorder;
import cn.bdqn.dao.BaseDao;
import cn.bdqn.service.WorkorderService;

import java.util.List;

/**
 * 工单的实现类
 * Created by dll on 2017/7/29.
 */
public class WorkorderServiceImpl implements WorkorderService {
    private BaseDao<Workorder> workorderBaseDao;

    public BaseDao<Workorder> getWorkorderBaseDao() {
        return workorderBaseDao;
    }

    public void setWorkorderBaseDao(BaseDao<Workorder> workorderBaseDao) {
        this.workorderBaseDao = workorderBaseDao;
    }

    @Override
    public boolean add(Workorder workorder) {

        try {
            workorderBaseDao.add(workorder);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public void delete(Workorder workorder) {
        workorderBaseDao.delete(workorder);
    }

    @Override
    public void update(Workorder workorder) {
        workorderBaseDao.update(workorder);
    }

    @Override
    public List<Workorder> findList(Integer pageSize, Integer pageIndex, Integer id) {
        pageIndex=(pageIndex-1)*pageSize;
        workorderBaseDao.findList("from Workorder w where w.projectId="+id,pageIndex,pageSize);
        return null;
    }

    @Override
    public Integer findCount(Integer id) {
        return  (int) workorderBaseDao.findCount(
                "select count(w.id) Workorder w where w.id="+id);
    }
}

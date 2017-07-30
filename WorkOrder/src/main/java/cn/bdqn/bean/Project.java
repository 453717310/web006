package cn.bdqn.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * 项目表
 * Created by dll on 2017/7/28.
 */
public class Project {
    private Integer id;//项目编号
    private String projectName;//项目名称
    //一对多
    private Set<Workorder> workorders=new HashSet<Workorder>();

    public Project(Integer id, String projectName, Set<Workorder> workorders) {
        this.id = id;
        this.projectName = projectName;
        this.workorders = workorders;
    }

    public Project() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Set<Workorder> getWorkorders() {
        return workorders;
    }

    public void setWorkorders(Set<Workorder> workorders) {
        this.workorders = workorders;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", workorders=" + workorders +
                '}';
    }
}

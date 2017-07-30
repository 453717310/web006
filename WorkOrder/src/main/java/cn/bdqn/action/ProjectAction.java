package cn.bdqn.action;

import cn.bdqn.bean.Project;
import cn.bdqn.service.ProjectService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dll on 2017/7/28.
 */





public class ProjectAction extends ActionSupport {
    private ProjectService projectService;
    private  Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    List<Project> list=new ArrayList<Project>();

    public List<Project> getList() {
        return list;
    }

    public void setList(List<Project> list) {
        this.list = list;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    public String findList(){
       list= projectService.findList();
        System.out.println(list);
       return SUCCESS;
    }
    public String temp(){
        return SUCCESS;
    }

}

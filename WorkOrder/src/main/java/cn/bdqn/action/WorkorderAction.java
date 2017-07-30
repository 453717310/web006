package cn.bdqn.action;

import cn.bdqn.bean.Workorder;
import cn.bdqn.service.WorkorderService;
import cn.bdqn.util.PageUtil;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import javax.rmi.CORBA.Util;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dll on 2017/7/29.
 */
public class WorkorderAction extends ActionSupport {
    private WorkorderService workorderService;
    private List<Workorder> workorders;
    private Workorder workorder;
    private org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(WorkorderAction.class);
    private PageUtil pageUtil;

//$.post(url: {"pageUtil.pageIndex":1,"workorder.projectId":1},function,type="json")
    public Workorder getWorkorder() {
        return workorder;
    }

    public void setWorkorder(Workorder workorder) {
        this.workorder = workorder;
    }

    public WorkorderService getWorkorderService() {
        return workorderService;
    }

    public void setWorkorderService(WorkorderService workorderService) {
        this.workorderService = workorderService;
    }

    public List<Workorder> getWorkorders() {
        return workorders;
    }

    public void setWorkorders(List<Workorder> workorders) {
        this.workorders = workorders;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public PageUtil getPageUtil() {
        return pageUtil;
    }

    public void setPageUtil(PageUtil pageUtil) {
        this.pageUtil = pageUtil;
    }

    /**
     * 添加
     * @return
     */
    public String add(){
        Map<String, Object> contextMap = ActionContext.getContext().getContextMap();
        workorder.setCreateDate(new Date());
        boolean flag = workorderService.add(workorder);
        contextMap.put("flag",flag);
        contextMap.put("proId",workorder.getProjectId());
        return SUCCESS;
    }
/*
var flag="<s:property value="#flag"/>";
            if(flag=="true"){
                .val("保存成功").
            }else{
                .val("保存失败")
    }
*/
            //.val()
    /**
     * 查询所有工单信息
     * @return
     */
    public String find(){
        Integer id=Integer.parseInt((String) ActionContext.getContext().getContextMap().get("id"));
        Integer count=workorderService.findCount(id);
        if (pageUtil!=null){
            workorders=workorderService.findList(pageUtil.getPageSize(),
                    pageUtil.getPageIndex(),id);
        }else{
            pageUtil=new PageUtil();
            workorders=workorderService.findList(pageUtil.getPageSize(),
                    pageUtil.getPageIndex(),id);
        }
        pageUtil.setTotalCount(count);
       // String workordersString=JSON.toJSONString(workorders);
        //String pages=JSON.toJSONString(pageUtil);
       // String out=workordersString.replace("]",","+pages+"]");

        return SUCCESS;
    }
    public String temp(){
        return SUCCESS;
    }
}

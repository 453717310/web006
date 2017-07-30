import cn.bdqn.bean.Project;
import cn.bdqn.bean.Workorder;
import cn.bdqn.service.ProjectService;
import cn.bdqn.service.WorkorderService;
import cn.bdqn.service.impl.WorkorderServiceImpl;
import javafx.scene.input.DataFormat;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/7/28.
 */
public class ProjectServiceTest {

    @Test
            public void test() throws ParseException {

    ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Workorder workorder=new Workorder();
        workorder.setDescription("哈哈");
        workorder.setExecutor("小黑");
        workorder.setOrderLevel(1);
        workorder.setProjectId(11);
        WorkorderService workorderService= (WorkorderService) ac.getBean("workService");
        workorderService.add(workorder);
        System.out.println(workorder);

    }




}
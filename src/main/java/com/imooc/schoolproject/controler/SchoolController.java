package com.imooc.schoolproject.controler;

import com.imooc.schoolproject.bo.Student;
import com.imooc.schoolproject.bo.StudentSocialActivity;
import com.imooc.schoolproject.entity.SocialActivity;
import com.imooc.schoolproject.entity.StudenEntity;
import com.imooc.schoolproject.request.QueryRequest;
import com.imooc.schoolproject.service.ActivityService;
import com.imooc.schoolproject.service.ISchoolService;
import com.imooc.schoolproject.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 下午4:08
 */
@Controller
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ISchoolService schoolService;

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/activitiesList")
    @ResponseBody
    public List<SocialActivity> queryActivities(){
        // 测试 分页暂时写死， 应在页面传参数
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setPageSize(2);
        queryRequest.setPageNum(3);
        List<SocialActivity> activities = activityService.getActivityLists(queryRequest);
        return activities;
    }

    @RequestMapping(value = "/activitiesListV2")
    @ResponseBody
    public List<StudentSocialActivity> queryActivitiesV2(){
        // 测试 分页暂时写死， 应在页面传参数
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setPageSize(5);
        queryRequest.setPageNum(5);

        return schoolService.getActivityLists(queryRequest);
    }

    @RequestMapping(value = "/queryStudentById")
    @ResponseBody
    public StudenEntity queryStudentById (@RequestParam("xjh") String xjh){
        StudenEntity student = activityService.queryStudentById(xjh);
        return student;
    }


    @RequestMapping(value = "/queryStudentByIdV2")
    @ResponseBody
    public Student queryStudentByIdV2(@RequestParam("xjh") String xjh){
        return studentService.queryStudentById(xjh);

    }

    @RequestMapping(value = "/hello")
    public String queryhello(){
        return "hello";
    }

    @RequestMapping(value = "/student")
    public ModelAndView student(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dataName", activityService.queryStudentById("11104330"));
        modelAndView.setViewName("/student");
        return modelAndView;
    }


    @RequestMapping(value = "/activitiesViews")
    @ResponseBody
    public ModelAndView activitiesViews(){
        // 测试 分页暂时写死， 应在页面传参数
        ModelAndView modelAndView = new ModelAndView();
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setPageNum(3);
        queryRequest.setPageSize(2);
        modelAndView.addObject("activitiDatas", schoolService.getActivityLists(queryRequest));
        modelAndView.setViewName("/activities");
        return modelAndView;
    }
}

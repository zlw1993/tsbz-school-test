package com.imooc.schoolproject.dao;

import com.imooc.schoolproject.bo.Student;
import com.imooc.schoolproject.bo.StudentSocialActivity;
import com.imooc.schoolproject.entity.SocialActivity;
import com.imooc.schoolproject.entity.StudenEntity;
import com.imooc.schoolproject.request.QueryRequest;
import com.imooc.schoolproject.service.ActivityService;
import com.imooc.schoolproject.service.ISchoolService;
import com.imooc.schoolproject.service.IStudentService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 上午10:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(ActivityDaoTest.class);

    @Autowired
    private ActivityDaoMapper activityDaoMapper;

    @Autowired
    private ActivityService service;

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ISchoolService schoolService;


    @Test
    @Ignore
    public void queryActivities() {
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setPageNum(2);
        queryRequest.setPageSize(3);
        List<SocialActivity> lists = service.getActivityLists(queryRequest);
        logger.info(lists.toString());
    }

    @Test
    @Ignore
    public void queryById(){
        String xjh = "11104330";
        StudenEntity student = activityDaoMapper.queryStudentById(xjh);
        System.out.println(student);
    }

    @Test
    @Ignore
    public void testExample(){
        Student student = studentService.queryStudentById("11104330");
        System.out.println(student);
    }

    @Test
    public void testQueryPage(){
        QueryRequest request = new QueryRequest();
        request.setPageNum(2);
        request.setPageSize(4);
        List<StudentSocialActivity> results = schoolService.getActivityLists(request);
        logger.info(request.toString());
    }
}
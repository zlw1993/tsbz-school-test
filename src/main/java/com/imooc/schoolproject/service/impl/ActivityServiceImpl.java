package com.imooc.schoolproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.imooc.schoolproject.dao.ActivityDaoMapper;
import com.imooc.schoolproject.entity.SocialActivity;
import com.imooc.schoolproject.entity.StudenEntity;
import com.imooc.schoolproject.request.QueryRequest;
import com.imooc.schoolproject.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author zhangliwei
 * @Date 2018/9/2 下午1:47
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    private static final Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);

    @Autowired
    private ActivityDaoMapper activityDaoMapper;
    @Override
    public List<SocialActivity> getActivityLists(QueryRequest request) {
        List<SocialActivity> lists = new ArrayList<>();
        try{
            PageHelper.startPage(request.getPageNum(), request.getPageSize());
            lists = activityDaoMapper.queryActivities();
        } catch (Exception e){
            logger.error("query error : " + e.getMessage());
        } finally {
            PageHelper.clearPage();
        }
        return lists;
    }

    @Override
    public StudenEntity queryStudentById(String xjh) {

        return activityDaoMapper.queryStudentById(xjh);
    }
}

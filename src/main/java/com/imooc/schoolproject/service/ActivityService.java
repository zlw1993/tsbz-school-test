package com.imooc.schoolproject.service;

import com.imooc.schoolproject.entity.SocialActivity;
import com.imooc.schoolproject.entity.StudenEntity;
import com.imooc.schoolproject.request.QueryRequest;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 下午1:45
 */
public interface ActivityService {
    List<SocialActivity> getActivityLists (QueryRequest request);
    StudenEntity queryStudentById(String xjh);
}

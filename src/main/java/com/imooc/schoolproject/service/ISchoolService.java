package com.imooc.schoolproject.service;

import com.imooc.schoolproject.bo.StudentSocialActivity;
import com.imooc.schoolproject.request.QueryRequest;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/3 下午10:00
 */
public interface ISchoolService {

    List<StudentSocialActivity> getActivityLists (QueryRequest request);
}

package com.imooc.schoolproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.imooc.schoolproject.bo.StudentSocialActivity;
import com.imooc.schoolproject.bo.StudentSocialActivityExample;
import com.imooc.schoolproject.dao.StudentSocialActivityMapper;
import com.imooc.schoolproject.request.QueryRequest;
import com.imooc.schoolproject.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/3 下午10:01
 */
@Service
public class SchoolServiceImpl implements ISchoolService{

    @Autowired
    private StudentSocialActivityMapper mapper;
    @Override
    public List<StudentSocialActivity> getActivityLists(QueryRequest request) {
        StudentSocialActivityExample example = new StudentSocialActivityExample();
        StudentSocialActivityExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        List<StudentSocialActivity> resultLists = new ArrayList<>();
        try{
            PageHelper.startPage(request.getPageNum(), request.getPageSize());
            resultLists = mapper.selectByExample(example);
        } finally {
            PageHelper.clearPage();
        }


        return resultLists;
    }
}

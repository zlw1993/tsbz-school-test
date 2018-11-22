package com.imooc.schoolproject.dao;

import com.imooc.schoolproject.entity.SocialActivity;
import com.imooc.schoolproject.entity.StudenEntity;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 上午10:46
 */
public interface ActivityDaoMapper {
    /**
     * 查询所有列表信息
     * @return
     */
    List<SocialActivity> queryActivities();

    StudenEntity queryStudentById(String xjh);


}

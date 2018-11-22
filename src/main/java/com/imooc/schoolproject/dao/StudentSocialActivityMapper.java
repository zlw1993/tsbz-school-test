package com.imooc.schoolproject.dao;

import com.imooc.schoolproject.bo.StudentSocialActivity;
import com.imooc.schoolproject.bo.StudentSocialActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentSocialActivityMapper {
    int countByExample(StudentSocialActivityExample example);

    int deleteByExample(StudentSocialActivityExample example);

    int deleteByPrimaryKey(String id);

    int insert(StudentSocialActivity record);

    int insertSelective(StudentSocialActivity record);

    List<StudentSocialActivity> selectByExample(StudentSocialActivityExample example);

    StudentSocialActivity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StudentSocialActivity record, @Param("example") StudentSocialActivityExample example);

    int updateByExample(@Param("record") StudentSocialActivity record, @Param("example") StudentSocialActivityExample example);

    int updateByPrimaryKeySelective(StudentSocialActivity record);

    int updateByPrimaryKey(StudentSocialActivity record);
}
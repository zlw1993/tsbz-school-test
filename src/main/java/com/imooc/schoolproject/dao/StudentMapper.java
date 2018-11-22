package com.imooc.schoolproject.dao;

import com.imooc.schoolproject.bo.Student;
import com.imooc.schoolproject.bo.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String xjh);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExampleWithBLOBs(StudentExample example);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String xjh);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExampleWithBLOBs(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKeyWithBLOBs(Student record);

    int updateByPrimaryKey(Student record);
}
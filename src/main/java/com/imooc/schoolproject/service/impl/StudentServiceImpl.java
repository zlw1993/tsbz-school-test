package com.imooc.schoolproject.service.impl;

import com.imooc.schoolproject.bo.Student;
import com.imooc.schoolproject.bo.StudentExample;
import com.imooc.schoolproject.dao.StudentMapper;
import com.imooc.schoolproject.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author zhangliwei
 * @Date 2018/9/3 下午9:40
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(String xjh) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andXjhEqualTo(xjh);
        List<Student> result =  studentMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(result)){
            return result.get(0);
        }
        return  new Student();
    }
}

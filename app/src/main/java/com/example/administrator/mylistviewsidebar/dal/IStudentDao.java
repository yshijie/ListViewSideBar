package com.example.administrator.mylistviewsidebar.dal;

import com.example.administrator.mylistviewsidebar.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2015/12/9 0009.
 */
public interface IStudentDao {

    List<Student> getStudentList(int offset) ;

    int getTotalStudentCount() ;

    List<Student> getStudentList() ;

}

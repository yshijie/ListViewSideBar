package com.example.administrator.mylistviewsidebar.dal;

/**
 * Created by Administrator on 2015/12/9 0009.
 */
public class StudentDaoFactory {

    public static IStudentDao newInstance() {

        return new StudentDao() ;

    }

}

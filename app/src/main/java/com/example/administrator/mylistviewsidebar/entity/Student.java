package com.example.administrator.mylistviewsidebar.entity;

/**
 * Created by Administrator on 2015/12/9 0009.
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name ;
    /**
     * 学生姓名拼音
     */
    private String sortKey ;

    public Student() {

    }

    public Student(String name, String sortKey) {
        this.name = name;
        this.sortKey = sortKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sortKey='" + sortKey + '\'' +
                '}';
    }
}

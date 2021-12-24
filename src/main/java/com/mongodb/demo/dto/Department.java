package com.mongodb.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class Department {

    private String deptName;
    @Field(name = "noOfStudents")
    private int no_of_students_in_dept;

    public Department(String deptName, int no_of_students_in_dept) {
        this.deptName = deptName;
        this.no_of_students_in_dept= no_of_students_in_dept;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getNo_of_students_in_dept() {
        return no_of_students_in_dept;
    }

    public void setNo_of_students_in_dept(int no_of_students_in_dept) {
        this.no_of_students_in_dept = no_of_students_in_dept;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", no_of_students_in_dept=" + no_of_students_in_dept +
                '}';
    }
}

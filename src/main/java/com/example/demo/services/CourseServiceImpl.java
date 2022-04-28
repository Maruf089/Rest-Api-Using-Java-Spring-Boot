package com.example.demo.services;

import com.example.demo.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(145 , "java Core Course" , "This Course Contain Basic Things about Java"));
        list.add(new Course(4343 , "Spring Boot Course" , "Creating Rest Api using Spring Boot"));

    }

    @Override
    public List<Course> getCourse()
    {
        return list;
    }
}

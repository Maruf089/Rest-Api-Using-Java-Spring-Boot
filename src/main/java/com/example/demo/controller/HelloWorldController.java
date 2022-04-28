package com.example.demo.controller;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private CourseService courseService;
    // Get the courses
    @GetMapping("\courses")
    public List<Course> getCourses()
    {
        return this.courseService.getCourse();

    }

}

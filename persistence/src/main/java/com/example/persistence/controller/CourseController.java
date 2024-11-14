package com.example.persistence.controller;


import com.example.persistence.aggregates.request.RequestCourse;
import com.example.persistence.entity.CourseEntity;
import com.example.persistence.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping()
    public ResponseEntity<CourseEntity> createCourse(@RequestBody RequestCourse course){
        CourseEntity newCourse = courseService.saveCourse(course);
        return new ResponseEntity<>(newCourse, HttpStatus.CREATED);
    }
}

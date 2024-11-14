package com.example.persistence.service;

import com.example.persistence.aggregates.request.RequestCourse;
import com.example.persistence.entity.CourseEntity;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    CourseEntity saveCourse(RequestCourse course);
    CourseEntity getCourseById(UUID id);
    List<CourseEntity> getAllCourses();
    CourseEntity updateCourse(UUID id, CourseEntity course);
    void deleteCourse(UUID id);
}

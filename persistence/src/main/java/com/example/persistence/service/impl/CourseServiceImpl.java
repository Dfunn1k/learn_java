package com.example.persistence.service.impl;

import com.example.persistence.aggregates.request.RequestCourse;
import com.example.persistence.entity.CourseEntity;
import com.example.persistence.repository.CourseRepository;
import com.example.persistence.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseEntity saveCourse(RequestCourse course) {
        CourseEntity newCourse = new CourseEntity();
        newCourse.setDescription(course.getDescription());
        return courseRepository.save(newCourse);
    }

    @Override
    public CourseEntity getCourseById(UUID id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso no encontrado"));
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity updateCourse(UUID id, CourseEntity course) {
        CourseEntity courseFound = getCourseById(id);
        courseFound.setDescription(courseFound.getDescription());
        return courseRepository.save(courseFound);
    }

    @Override
    public void deleteCourse(UUID id) {
        CourseEntity courseFound = getCourseById(id);
        courseRepository.delete(courseFound);
    }
}

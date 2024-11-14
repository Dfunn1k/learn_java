package com.example.persistence.service.impl;

import com.example.persistence.aggregates.request.RequestStudent;
import com.example.persistence.entity.CourseEntity;
import com.example.persistence.entity.StudentEntity;
import com.example.persistence.repository.CourseRepository;
import com.example.persistence.repository.StudentRepository;
import com.example.persistence.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentServiceImpl(StudentRepository studentRepository,
                              CourseRepository courseRepository){
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    private Set<CourseEntity> loadCoursesByIds(Set<UUID> course_ids) {
        return course_ids.stream()
                .map(this::findCoursesByID)
                .collect(Collectors.toSet());
    }

    private CourseEntity findCoursesByID(UUID id) {
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("¡Curso no encontrado!"));
    }

    @Override
    public StudentEntity saveStudent(RequestStudent student) {
        StudentEntity studentEntity = new StudentEntity();
        Set<CourseEntity> courses = loadCoursesByIds(student.getCourses());
        studentEntity.setName(student.getName());
        studentEntity.setCourses(courses);
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity getStudentById(UUID id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("¡Estudiante no encontrado!"));
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity updateStudent(UUID id, RequestStudent student) {
        StudentEntity studentFound = getStudentById(id);
        studentFound.setName(student.getName());
        studentFound.setCourses(loadCoursesByIds(student.getCourses()));
        return studentRepository.save(studentFound);
    }

    @Override
    public void deleteStudent(UUID id) {
        StudentEntity studentFound = getStudentById(id);
        studentRepository.delete(studentFound);
    }
}

package com.example.persistence.service;

import com.example.persistence.aggregates.request.RequestStudent;
import com.example.persistence.entity.StudentEntity;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    // ahora devolvemos una entidad pero esperamos un DTO
    StudentEntity saveStudent(RequestStudent student);
    StudentEntity getStudentById(UUID id);
    List<StudentEntity> getAllStudents();
    StudentEntity updateStudent(UUID id, RequestStudent student);
    void deleteStudent(UUID id);
}


package com.example.persistence.controller;

import com.example.persistence.aggregates.request.RequestStudent;
import com.example.persistence.entity.StudentEntity;
import com.example.persistence.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentEntity> createStudent(@RequestBody RequestStudent student) {
        StudentEntity newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable UUID id) {
        StudentEntity studentFound = studentService.getStudentById(id);
        return new ResponseEntity<>(studentFound, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> updateStudent(@PathVariable UUID id, @RequestBody RequestStudent student) {
        StudentEntity studentUpdated = studentService.updateStudent(id, student);
        return new ResponseEntity<>(studentUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable UUID id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

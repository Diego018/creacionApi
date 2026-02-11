package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;

    }

    // GET ALL
    @GetMapping
    public List<Student> getAll() {

        return studentService.studentList();

    }

    // GET BY ID
    @GetMapping("/{id}")

    public Student getById(@PathVariable Long id) {
        return studentService.findById(id);

    }

    // CREATE
    @PostMapping
    public Student create(@RequestBody Student student) {

        return studentService.createStudent(student);

    }

    // UPDATE
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {

        return studentService.updateStudent(id, student);

    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        studentService.deleteStudent(id);

    }

}

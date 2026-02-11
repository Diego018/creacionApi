package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final IStudentRepository istudentRepository;

    public StudentService(IStudentRepository iStudentRepository) {

        this.istudentRepository = iStudentRepository;

    }

    //Method for create student

    public Student createStudent(Student estudiante){

        return istudentRepository.save(estudiante);

    }

    //List all students

    public List<Student> studentList () {

        return istudentRepository.findAll();
    }

    // Get all students by ID

    public Student findById(Long id) {

        return istudentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

    }

    //I update the student

    public Student updateStudent(Long id, Student nuevo) {

        Student existing = findById(id);

        existing.setName(nuevo.getName());
        existing.setCareer(nuevo.getCareer());

        return istudentRepository.save(existing);


    }

    //Method for remove Student

    public void deleteStudent(Long id) {

        istudentRepository.deleteById(id);

    }


}

package com.example.demo.controller;

import com.example.demo.entity.Estudiante;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {

    @PostMapping("/estudiantes")
    public Estudiante crearEstudiante (@RequestBody Estudiante estudiante) {


        return estudiante;

    }

}

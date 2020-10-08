package com.example.alumno.controller;

import com.example.alumno.entities.Alumnos;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class PersonaController extends BaseControllerImpl<Alumnos,AlumnosServiceImpl> {

}

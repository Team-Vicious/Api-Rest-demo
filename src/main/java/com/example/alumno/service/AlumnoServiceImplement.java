package com.example.alumno.service;

import com.example.alumno.entities.Alumnos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlumnoServiceImplement extends BaseServiceImplement<Alumnos, Long> implements AlumnoService{


    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImplement (BaseRepository<Alumnos, Long> baseRepository) {

        super(baseRepository);
    }


}

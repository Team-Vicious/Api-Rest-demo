package com.example.alumno.repositories;


import com.example.alumno.entities.Alumnos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface AlumnosRepository extends BaseRepository<Alumnos, Long> {




}

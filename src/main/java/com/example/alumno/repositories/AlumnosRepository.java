package com.example.alumno.repositories;


import com.example.alumno.entities.Alumnos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlumnosRepository extends BaseRepository<Alumnos, Long> {

List<Alumnos> findByNombreContainingOrApellidoContainingOrEmailContaining(String nombre, String apellido, String email);

@Query(value = "SELECT a FROM Alumnos a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro% OR a.email LIKE %filtro% ")
List<Alumnos> search(@Param("filtro") String filtro);

@Query(value = "SELECT * FROM alumno WHERE alumno.nombre LIKE %:filtro% OR alumno.apellido LIKE %:filtro% OR alumno.email LIKE %:filtro% ", nativeQuery = true)
List<Alumnos> searchNativo(@Param("filtro") String filtro);



}

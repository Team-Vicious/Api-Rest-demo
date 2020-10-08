package com.example.alumno.service;

import com.example.alumno.entities.Base;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public interface baseService  <E extends Base, ID extends Serializable>{

    public List<E> finall() throws Exception;

    @Transactional
    List<E> findall() throws Exception;

    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update (ID id, E entity ) throws Exception;
    public boolean delete(ID id) throws Exception;
}

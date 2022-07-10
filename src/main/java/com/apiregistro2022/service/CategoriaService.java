package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;


public interface CategoriaService {
    //mostrar todo
    List<Categoria> findAll();
    //mostrar todos los habilitados
    List<Categoria> findAllCustom();
    //buscar por nombre
    List<Categoria> findByName();
    //buscar por id
    Optional<Categoria> findById(Long id);
    //agregar
    Categoria add(Categoria c);
    //actualizar
    Categoria update(Categoria c);
    //eliminar
    Categoria delete(Categoria c);
    
}

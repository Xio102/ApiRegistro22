
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;


public interface DistritoService {
    
    //mostrar todo
    List<Distrito> findAll();
    //mostrar todos los habilitados
    List<Distrito> findAllCustom();
    //buscar por nombre
    List<Distrito> findByName();
    //buscar por nombre
    Optional<Distrito> findById(Long id);
    //agregar
    Distrito add(Distrito d);
    //actualizar
    Distrito update(Distrito d);
    //eliminar
    Distrito delete(Distrito d);
}

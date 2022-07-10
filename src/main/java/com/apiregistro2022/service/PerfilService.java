
package com.apiregistro2022.service;


import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;


public interface PerfilService {
    
    //mostrar todo
    List<Perfil> findAll();
    //mostrar todos los habilitados
    List<Perfil> findAllCustom();
    //buscar por nombre
    List<Perfil> findByName();
    //buscar por nombre
    Optional<Perfil> findById(Long id);
    //agregar
    Perfil add(Perfil p);
    //actualizar
    Perfil update(Perfil p);
    //eliminar
    Perfil delete(Perfil p);
}

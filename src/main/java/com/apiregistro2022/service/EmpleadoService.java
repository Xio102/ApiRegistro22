package com.apiregistro2022.service;


import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;


public interface EmpleadoService {
    
    //mostrar todo
    List<Empleado> findAll();
    //mostrar habilitados
    List<Empleado> findAllCustom();
    //buscar por nombre
    List<Empleado> findByName();
    //buscar por id
    Optional<Empleado> findById(Long id);
    //agregar
    Empleado add(Empleado e);
    //actualizar
    Empleado update(Empleado e);
    //eliminar
    Empleado delete(Empleado e);
}

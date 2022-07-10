
package com.apiregistro2022.service;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    //mostrar todo
    List<Cliente> findAll();
    //mostrar todos los habilitados
    List<Cliente> findAllCustom();
    //buscar por nombre
    List<Cliente> findByName();
    //buscar por nombre
    Optional<Cliente> findById(Long id);
    //agregar
    Cliente add(Cliente c);
    //actualizar
    Cliente update(Cliente c);
    //eliminar
    Cliente delete(Cliente c);
}

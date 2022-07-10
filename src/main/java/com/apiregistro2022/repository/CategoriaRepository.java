package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    //creamos una funcion para mostrar todas las categorias habilitadas
    //categoria hace refencia a Entidad y eso a Tabla
    //estado referncia--> atributo de la entidad --> escat de la tabla --> 1 o 0
    //donde 1 hacerefencia a todos los habilitados y cero a los desabilitados
    @Query("select c from Categoria c where c.estado='1'")
    List<Categoria> findAllCustom();
    
    @Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    List<Categoria> findByName(@Param("nombre") String nombre);
    
    
}

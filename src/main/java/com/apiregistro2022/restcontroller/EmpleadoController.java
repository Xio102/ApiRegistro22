
package com.apiregistro2022.restcontroller;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    //listar
    @GetMapping
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }
    
    //llamar positivos
    @GetMapping("/custom")
    public List<Empleado> findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    //buscar por codigo
    @GetMapping("/{id}")
    public Optional<Empleado> FinById(@PathVariable Long id){
       return empleadoService.findById(id);
    }
    
    //registrar
    @PostMapping
    public Empleado add(@RequestBody Empleado e){
        return empleadoService.add(e);
    }
    
    //actualizar valores
    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado e){
        e.setCodigo(id);
        return empleadoService.update(e);
    }
    
    //eliminar valores
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable Long id){
        Empleado objEmpleado= new Empleado();
        objEmpleado.setCodigo(id);
        return empleadoService.delete(objEmpleado);
    }
}

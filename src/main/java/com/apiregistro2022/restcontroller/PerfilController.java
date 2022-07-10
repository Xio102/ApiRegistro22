
package com.apiregistro2022.restcontroller;


import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.service.PerfilService;
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
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;
    
    //listar
    @GetMapping
     public List<Perfil> findAll(){
        return perfilService.findAll();
    }
    
     //llamar solo los positivos
    @GetMapping("/custom")
    public List<Perfil> findAllCustom(){
        return perfilService.findAllCustom();
    }
     
    //buscar por codigo
    @GetMapping("/{id}")
    public Optional<Perfil> FinById(@PathVariable Long id){
       return perfilService.findById(id);
    }
    
    //para enviar valores--registrar
    @PostMapping
    public Perfil add(@RequestBody Perfil p){
        return perfilService.add(p);
    }
    
    //actualizar valores
    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id, @RequestBody Perfil p){
        p.setCodigo(id);
        return perfilService.update(p);
    }
    
    //elimar valores
    @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable Long id){
        Perfil objPerfil= new Perfil();
        objPerfil.setCodigo(id);
        return perfilService.delete(objPerfil);
    }
}

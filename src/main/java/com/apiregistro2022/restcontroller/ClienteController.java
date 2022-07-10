
package com.apiregistro2022.restcontroller;


import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.service.ClienteService;
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
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    //listar
    @GetMapping
     public List<Cliente> findAll(){
        return clienteService.findAll();
    }
    
     //llamar solo los positivos
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return clienteService.findAllCustom();
    }
     
    //buscar por codigo
    @GetMapping("/{id}")
    public Optional<Cliente> FinById(@PathVariable Long id){
       return clienteService.findById(id);
    }
    
    //para enviar valores--registrar
    @PostMapping
    public Cliente add(@RequestBody Cliente p){
        return clienteService.add(p);
    }
    
    //actualizar valores
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente c){
        c.setCodigo(id);
        return clienteService.update(c);
    }
    
    //elimar valores
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objProducto= new Cliente();
        objProducto.setCodigo(id);
        return clienteService.delete(objProducto);
    }
}

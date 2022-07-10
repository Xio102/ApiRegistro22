package com.apiregistro2022.service.impl;


import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.repository.CategoriaRepository;
import com.apiregistro2022.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//se agrega la anotacionqeu indica que es un servicio de Spring
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public List<Categoria> findByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return categoriaRepository.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objCategoria= categoriaRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCategoria);
        return categoriaRepository.save(objCategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objCategoria= categoriaRepository.getById(c.getCodigo());
        objCategoria.setEstado(false);
        return categoriaRepository.save(objCategoria);
    }
    
}

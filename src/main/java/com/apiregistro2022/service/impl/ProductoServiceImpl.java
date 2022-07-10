package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Producto;
import com.apiregistro2022.repository.ProductoRepository;
import com.apiregistro2022.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return productoRepository.findAllCustom();
    }

    @Override
    public List<Producto> findByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objProducto=productoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objProducto);
        return productoRepository.save(objProducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objProducto= productoRepository.getById(p.getCodigo());
        objProducto.setEstado(false);
        return productoRepository.save(objProducto);
    }
    
}

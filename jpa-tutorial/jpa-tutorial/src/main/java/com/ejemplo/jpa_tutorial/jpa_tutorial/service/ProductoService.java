package com.ejemplo.jpa_tutorial.jpa_tutorial.service;

import com.ejemplo.jpa_tutorial.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.jpa_tutorial.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    public List<Producto> findByNombre(String nombre) {
        return productoRepository.findByNombreContaining(nombre);
    }

    public List<Producto> findByPrecioBetween(Double preciomin, Double preciomax) {
        return productoRepository.findByPrecioBetween(preciomin, preciomax);
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}

package com.ejemplo.jpa_tutorial.jpa_tutorial.repository;

import com.ejemplo.jpa_tutorial.jpa_tutorial.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContaining(String nombre);
    List<Producto> findByPrecioBetween(Double preciomin, Double preciomax);
}

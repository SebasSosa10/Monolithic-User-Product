package com.UsuarioProducto.Usuario_productos.repository;

import com.UsuarioProducto.Usuario_productos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduct extends JpaRepository<Product, Long> {
}

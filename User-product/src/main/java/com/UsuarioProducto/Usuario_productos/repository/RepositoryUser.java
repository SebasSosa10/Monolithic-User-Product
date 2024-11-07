package com.UsuarioProducto.Usuario_productos.repository;

import com.UsuarioProducto.Usuario_productos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryUser extends JpaRepository<User, Long> {
    Optional<User> findByEmailOrUsername(String email, String username);
}

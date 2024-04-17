package me.tech.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.tech.domain.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{
    
}

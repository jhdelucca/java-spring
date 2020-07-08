package com.joao.catalogo.repository;

import com.joao.catalogo.model.Musica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository<Musica,Long> {
    
}
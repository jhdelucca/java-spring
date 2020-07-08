package com.joao.catalogo.service;

import java.util.List;

import com.joao.catalogo.model.Musica;

public interface CatalogoService {
    
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);
    void deleteById(Long id);
}
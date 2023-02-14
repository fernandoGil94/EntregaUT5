package com.fernando.peliculasFernando;

import com.fernando.peliculasFernando.Model.Pelicula;

import java.util.ArrayList;
import java.util.Optional;

public interface PeliculaService {
    ArrayList<Pelicula> findAll();
    Optional<Pelicula> findById(Long id);
    void save(Pelicula peli);
    Pelicula update(Long i, Pelicula peli);
    void delete(Long idPeli);
}

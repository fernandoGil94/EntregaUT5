package com.fernando.peliculasFernando;

import com.fernando.peliculasFernando.Model.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {
}

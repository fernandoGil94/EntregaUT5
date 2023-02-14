package com.fernando.peliculasFernando;

import com.fernando.peliculasFernando.Model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class PeliculaServiceImp implements PeliculaService{
    @Autowired
    private PeliculaRepository pr;

    public ArrayList<Pelicula> findAll() {
        return(ArrayList<Pelicula>) pr.findAll();
    }

    public Optional<Pelicula> findById(Long id) {
        return pr.findById(id);
    }

    public void save(Pelicula peli) {
        pr.save(peli);
    }


    public Pelicula update(Long id, Pelicula peli) {
        if(findById(id).isPresent()){
            pr.save(peli);
        }
        return peli;
    }
    public void delete(Long idPeli) {
        pr.deleteById(idPeli);
    }
}

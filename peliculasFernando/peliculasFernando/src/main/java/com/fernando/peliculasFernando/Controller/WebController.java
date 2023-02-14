package com.fernando.peliculasFernando.Controller;

import com.fernando.peliculasFernando.Model.Pelicula;
import com.fernando.peliculasFernando.PeliculaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private PeliculaServiceImp psi;

    @PostMapping("/alta")
    public void savePelicula(Pelicula peli ){
        psi.save(peli);
    }

    @GetMapping("/lista")
    public List<Pelicula> listaPeliculas(){
        return psi.findAll();
    }

    @PutMapping("/actualiza/{id}")
    public Pelicula actualizaPelicula(@PathVariable("id") Long id, Pelicula peli){
        return psi.update(id, peli);
    }

    @DeleteMapping("/elimina/{id}")
    public String borraPelicula(@PathVariable ("id") Long id){
        psi.delete(id);
        return "Película borrada con éxito.";

    }
}

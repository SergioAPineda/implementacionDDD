package co.com.sofka.ddd.pelicula;

import co.com.sofka.ddd.pelicula.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PeliculaChange extends EventChange {

    public PeliculaChange(Pelicula pelicula) {

        apply((PeliculaCreada event) -> {
            pelicula.nombrePelicula = event.getNombrePelicula();
            pelicula.funciones = new HashSet<>();
            pelicula.salas= new HashSet<>();

        });

        apply((FuncionAgregada event) -> {
            pelicula.funciones.add(new Funcion(
                    event.getEntityId(),
                    event.getIdioma(),
                    event.getHorario()
            ));

        });

        apply((HorarioFuncionCambiado event) -> {
            var funcion = pelicula.getFuncionPorId(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la funcion solicitada para la pelicula"));
            funcion.definirHorario(event.getHorario());
        });

        apply((IdiomaFuncionCambiado event) -> {
            var funcion = pelicula.getFuncionPorId(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la funcion solicitada para la pelicula"));
            funcion.definirIdioma(event.getIdioma());
        });

        apply((SalaAgregada event) -> {
            pelicula.salas.add(new Sala(
                    event.getEntityId(),
                    event.getDisponibilidad(),
                    event.getTipoSala()
            ));

        });

        apply((NombreCambiado event) -> {
            pelicula.nombrePelicula = event.getNombrePelicula();
        });
    }


}

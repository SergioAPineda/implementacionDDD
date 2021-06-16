package co.com.sofka.ddd.pelicula;

import co.com.sofka.ddd.pelicula.events.*;
import co.com.sofka.ddd.pelicula.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Pelicula extends AggregateEvent<PeliculaID> {


    protected NombrePelicula nombrePelicula;
    protected Categoria categoria;
    protected Set<Funcion> funciones;
    protected Set<Sala> salas;

    public Pelicula(PeliculaID entityId, NombrePelicula nombrePelicula){
        super(entityId);
        appendChange(new PeliculaCreada(nombrePelicula)).apply();
    }

    private Pelicula(PeliculaID entityId){
        super(entityId);
        subscribe(new PeliculaChange(this));
    }

    public static Pelicula from(PeliculaID peliculaID, List<DomainEvent> events){
        var pelicula = new Pelicula(peliculaID);
        events.forEach(pelicula::applyEvent);
        return pelicula;
    }

    public void agregarFuncion(FuncionID entityId, Idioma idioma, Horario horario){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(idioma);
        Objects.requireNonNull(horario);
        appendChange(new FuncionAgregada(entityId, idioma, horario)).apply();
    }

    public void agregarSala(SalaID entityId, Disponibilidad disponibilidad, TipoSala tipoSala){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(disponibilidad);
        Objects.requireNonNull(tipoSala);
        appendChange(new SalaAgregada(entityId, disponibilidad, tipoSala)).apply();
    }

    public void cambiarNombrePelicula(NombrePelicula nombrePelicula){
        Objects.requireNonNull(nombrePelicula);
        appendChange(new NombreCambiado(nombrePelicula)).apply();
    }

    public void definirHoraFuncion(FuncionID entityId, Horario horario){
        appendChange(new HorarioFuncionCambiado(entityId, horario)).apply();
    }

    public void definirIdiomaFuncion(FuncionID entityId, Idioma idioma){
        appendChange(new IdiomaFuncionCambiado(entityId, idioma)).apply();
    }

    public NombrePelicula nombrePelicula() {
        return nombrePelicula;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Set<Funcion> funciones() {
        return funciones;
    }

    public Set<Sala> salas() {
        return salas;
    }

    public Optional<Funcion> getFuncionPorId(FuncionID funcionID){
        return funciones()
                .stream()
                .filter(funcion -> funcion.identity().equals(funcionID))
                .findFirst();
    }

    public Optional<Sala> getSalaPorId(SalaID salaID){
        return salas()
                .stream()
                .filter(sala -> sala.identity().equals(salaID))
                .findFirst();
    }
}

package co.com.sofka.ddd.pelicula;

import co.com.sofka.ddd.pelicula.values.FuncionID;
import co.com.sofka.ddd.pelicula.values.Horario;
import co.com.sofka.ddd.pelicula.values.Idioma;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Funcion extends Entity<FuncionID> {


    private Idioma idioma;
    private Horario horario;

    public Funcion(FuncionID entityId, Idioma idioma, Horario horario) {
        super(entityId);
        this.idioma = idioma;
        this.horario = horario;
    }

    public void definirHorario(Horario horario){
        this.horario = Objects.requireNonNull(horario);
    }

    public void definirIdioma(Idioma idioma) {
        this.idioma = Objects.requireNonNull(idioma);
    }

    public Idioma idioma() {
        return idioma;
    }

    public Horario horario() {
        return horario;
    }
}

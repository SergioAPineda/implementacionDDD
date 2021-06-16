package co.com.sofka.ddd.pelicula.values;

import co.com.sofka.domain.generic.Identity;

public class PeliculaID extends Identity {

    public PeliculaID(){}

    private PeliculaID(String id){
        super(id);
    }

    public static PeliculaID of(String id){
        return new PeliculaID(id);
    }
}

package co.com.sofka.ddd.pelicula.values;

import co.com.sofka.domain.generic.Identity;

public class SalaID extends Identity {

    public SalaID(){

    }

    private SalaID(String id){
        super(id);
    }

    public static SalaID of(String id){
        return new SalaID(id);
    }
}

package co.com.sofka.ddd.cliente.values;

import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.Identity;

public class ClienteID  extends Identity {
    public ClienteID(){}

    private ClienteID(String id){
        super(id);
    }

    public static ClienteID of(String id){
        return new ClienteID(id);

    }
}

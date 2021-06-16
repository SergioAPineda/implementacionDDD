package co.com.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class TarjetaID extends Identity {

    public TarjetaID(){}

    private TarjetaID(String id){
        super(id);
    }

    public static TarjetaID of(String id){
        return new TarjetaID(id);

    }
}

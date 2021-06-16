package co.com.sofka.ddd.boleto.values;

import co.com.sofka.domain.generic.Identity;

public class SillaID extends Identity {

    public SillaID(){

    }

    private SillaID(String id){
        super(id);
    }

    public static SillaID of(String id){
        return new SillaID(id);
    }
}

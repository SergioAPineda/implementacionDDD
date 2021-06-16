package co.com.sofka.ddd.boleto.values;

import co.com.sofka.domain.generic.Identity;

public class BoletoID extends Identity {

    public BoletoID(){

    }

    private BoletoID(String id){
        super(id);
    }

    public static BoletoID of(String id){
        return new BoletoID(id);
    }
}

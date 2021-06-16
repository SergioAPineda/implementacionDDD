package co.com.sofka.ddd.cliente;

import co.com.sofka.ddd.cliente.values.Clase;
import co.com.sofka.ddd.cliente.values.NombreCliente;
import co.com.sofka.ddd.cliente.values.TarjetaID;
import co.com.sofka.domain.generic.Entity;

import java.util.Set;

public class Tarjeta extends Entity<TarjetaID> {

    private NombreCliente nombreCliente;
    private Clase clase;

    public Tarjeta(TarjetaID entityId, NombreCliente nombreCliente, Clase clase){
        super(entityId);
        this.nombreCliente = nombreCliente;
        this.clase = clase;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public Clase clase() {
        return clase;
    }
}

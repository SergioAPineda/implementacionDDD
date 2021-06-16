package co.com.sofka.ddd.cliente.commands;


import co.com.sofka.ddd.cliente.values.Clase;
import co.com.sofka.ddd.cliente.values.TarjetaID;
import co.com.sofka.domain.generic.Command;

public class CambiarClase implements Command {

    private final TarjetaID tarjetaID;
    private final Clase clase;

    public CambiarClase(TarjetaID tarjetaID, Clase clase) {
        this.tarjetaID = tarjetaID;
        this.clase = clase;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }

    public Clase getClase() {
        return clase;
    }
}

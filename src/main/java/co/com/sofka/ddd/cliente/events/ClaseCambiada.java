package co.com.sofka.ddd.cliente.events;

import co.com.sofka.ddd.cliente.values.Clase;
import co.com.sofka.ddd.cliente.values.TarjetaID;
import co.com.sofka.domain.generic.DomainEvent;

public class ClaseCambiada extends DomainEvent {
    private final TarjetaID tarjetaID;
    private final Clase clase;

    public ClaseCambiada(TarjetaID tarjetaID, Clase clase) {
        super("sofka.cliente.clasecambiada");
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

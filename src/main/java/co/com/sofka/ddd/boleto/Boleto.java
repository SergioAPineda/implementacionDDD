package co.com.sofka.ddd.boleto;

import co.com.sofka.ddd.boleto.events.*;
import co.com.sofka.ddd.boleto.values.BoletoID;
import co.com.sofka.ddd.boleto.values.Costo;
import co.com.sofka.ddd.boleto.values.DisponibilidadSilla;
import co.com.sofka.ddd.boleto.values.SillaID;
import co.com.sofka.ddd.pelicula.values.PeliculaID;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Boleto extends AggregateEvent<BoletoID> {

    protected Costo costo;
    protected Set<Silla> sillas;
    protected PeliculaID peliculaID;



    public Boleto(BoletoID entityId, Costo costo, PeliculaID peliculaID) {
        super(entityId);
        appendChange( new BoletoCreado(entityId)).apply();
    }

    private Boleto(BoletoID entityId) {
        super(entityId);
    }

    public void actualizarCosto(BoletoID boletoID, Costo costo){
        Objects.requireNonNull(costo);
        appendChange(new CostoActualizado(boletoID, costo)).apply();
    }

    public void actualizarDisponibilidadSilla(SillaID sillaID, DisponibilidadSilla disponibilidad){
        Objects.requireNonNull(disponibilidad);
        Objects.requireNonNull(sillaID);
        appendChange(new DisponibilidadSillaActualizada(sillaID, disponibilidad)).apply();
    }

    public void escogerSilla(BoletoID boletoID, SillaID sillaID, DisponibilidadSilla disponibilidadSilla){
        Objects.requireNonNull(boletoID);
        Objects.requireNonNull(disponibilidadSilla);
        Objects.requireNonNull(sillaID);
        appendChange(new SillaEscogida(boletoID, sillaID, disponibilidadSilla)).apply();
    }

    public void crearSilla(SillaID sillaID, DisponibilidadSilla disponibilidadSilla){
        Objects.requireNonNull(disponibilidadSilla);
        Objects.requireNonNull(sillaID);
        appendChange(new SillaCreada(sillaID, disponibilidadSilla)).apply();
    }

    public Costo costo() {
        return costo;
    }

    public Set<Silla> sillas() {
        return sillas;
    }

    public PeliculaID getPeliculaID() {
        return peliculaID;
    }

    public Optional<Silla> getSillaPorId(SillaID sillaID){
        return sillas
                .stream()
                .filter(silla -> silla.identity().equals(sillaID))
                .findFirst();
    }
}


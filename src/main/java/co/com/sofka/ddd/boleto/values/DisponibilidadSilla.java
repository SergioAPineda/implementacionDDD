package co.com.sofka.ddd.boleto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class DisponibilidadSilla implements ValueObject<Boolean> {

    private final Boolean value;

    public DisponibilidadSilla(Boolean value){
        this.value = Objects.requireNonNull(value);
    }

    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisponibilidadSilla that = (DisponibilidadSilla) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

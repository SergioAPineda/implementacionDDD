package co.com.sofka.ddd.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Gafas implements ValueObject<Boolean> {

    private final Boolean value;

    public Gafas(Boolean value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gafas gafas = (Gafas) o;
        return Objects.equals(value, gafas.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

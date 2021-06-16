package co.com.sofka.ddd.boleto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Costo implements ValueObject<Integer> {

    private final Integer value;

    public Costo(Integer value){
        this.value = Objects.requireNonNull(value);
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Costo costo = (Costo) o;
        return Objects.equals(value, costo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

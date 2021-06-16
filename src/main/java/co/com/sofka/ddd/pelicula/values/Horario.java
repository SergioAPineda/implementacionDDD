package co.com.sofka.ddd.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Horario implements ValueObject<Date> {

    private final Date value;

    public Horario(Date value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(value, horario.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

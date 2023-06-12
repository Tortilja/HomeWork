package io.codelex.oop.summary.ExerciseNr1;

import java.util.function.Supplier;

public class LazyBox<T> {

    protected T value;
    protected final Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (value == null) {
            value = (T) supplier.get();
        }
        return value;
    }
}

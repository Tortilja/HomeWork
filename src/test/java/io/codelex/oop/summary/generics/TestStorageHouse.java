package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStorageHouse {
    @Test
    void getMaybeFirstItemString() {
        String expected = "First";
        StorageHouse storageHouse = new StorageHouse("First");
        storageHouse.addMoreItems("Hello!");
        storageHouse.addMoreItems(69);
        storageHouse.addMoreItems(new BigDecimal(100043));
        Optional<String> result = storageHouse.getMaybeFirstItem();
        assertEquals(expected, result.get());
    }

    @Test
    void getMaybeFirstItemInteger() {
        Integer expected = Integer.valueOf(100);
        StorageHouse storageHouse = new StorageHouse(100);
        storageHouse.addMoreItems(Integer.valueOf(1000));
        storageHouse.addMoreItems("Hello!");
        storageHouse.addMoreItems(new BigDecimal(10000));
        Optional<Integer> result = storageHouse.getMaybeFirstItem();
        assertEquals(expected, result.get());
    }
}

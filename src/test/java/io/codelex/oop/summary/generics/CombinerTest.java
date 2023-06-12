package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinerTest {
    @Test
    public void testCombineIntegerBigDecimal() {

        Integer integer = 55;
        BigDecimal decimal = new BigDecimal("55.55");
        String combined = Combiner.combineTwoItems(integer, decimal);
        String result = "First item: 55; Second item: 55.55";
        assertEquals(result, combined);

    }

    @Test
    public void testCombineCharBoolean() {

        Character charItem = 'M';
        Boolean bool = true;
        String combined = Combiner.combineTwoItems(charItem, bool);
        String result = "First item: M; Second item: true";
        assertEquals(result, combined);

    }

    @Test
    public void testCombineDoubleString() {

        Double doubleItem = 1.99;
        String string = "first String";
        String combined = Combiner.combineTwoItems(doubleItem, string);
        String result = "First item: 1.99; Second item: first String";
        assertEquals(result, combined);

    }


}

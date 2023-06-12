package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {
    @Test
    public void getThingToPrintString() {
        String text = "Get Thing To Print";
        Printer<String> printer = new Printer<>(text);
        printer.print();
        assertEquals(text, printer.getThingToPrint());
    }

    @Test
    public void getThingToPrintInteger() {
        Integer number = 69;
        Printer<Integer> printer = new Printer<>(number);
        printer.print();
        assertEquals(number, printer.getThingToPrint());
    }

    @Test
    public void getThingToPrintBigDecimal() {
        Double decimal = 420.69;
        Printer<Double> printer = new Printer<>(decimal);
        printer.print();
        assertEquals(decimal, printer.getThingToPrint());
    }
}

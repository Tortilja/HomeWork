package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {

    //Fix this method, so it can receive two any kind of objects
    //Test the functionality

    public static <T, G> String combineTwoItems(T first, G second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}

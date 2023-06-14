package io.codelex.PatstavigaisDarbs;

import io.codelex.PatstavigaisDarbs.ExerciseNr3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {
    @Test
    void testJoinIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");

        String result = joiner.join(1, 2, 3, 4);

        Assertions.assertEquals("1-2-3-4", result);
    }

    @Test
    void testJoinStrings() {
        Joiner<String> joiner = new Joiner<>(",");

        String result = joiner.join("apple", "banana", "orange");

        Assertions.assertEquals("apple,banana,orange", result);
    }

    @Test
    void testJoinCharacters() {
        Joiner<Character> joiner = new Joiner<>("|");

        String result = joiner.join('a', 'b', 'c', 'd');

        Assertions.assertEquals("a|b|c|d", result);
    }
}

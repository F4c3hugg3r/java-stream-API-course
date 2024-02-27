package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {

    @Test
    public void min() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Optional<Integer> min = numbers.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println(min);
    }

    @Test
    public void max() {
        List<Integer> numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        Optional<Integer> max = numbers.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(max);
    }
}

package com.amigoscode.examples;


import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingData {

    @Test
    public void simpleGrouping() throws Exception {
        List<Car> cars = MockData.getCars();
        Map<String, List<Car>> byColor = cars.stream().collect(Collectors.groupingBy(Car::getColor));

        byColor.forEach((color, cars1) -> {
            System.out.println(color);
            cars1.forEach(System.out::println);
        });
    }

    @Test
    public void groupingAndCounting() throws Exception {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );

        Map<String, Long> groupedWithCount = names.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

        groupedWithCount.forEach((count, namess) -> {
            System.out.println(count);
            System.out.println(namess);
            System.out.println();
        } );
    }

}
package com.amigoscode.examples;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

    @Test
    public void sortingSteamOfElements() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).toList();

    }

    //TODO
    //Mit Internet Testen
    @Test
    public void sortingSteamOfElementsReverse() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).toList();
    }

    @Test
    public void sortingSteamOfObjets() throws IOException {
        List<Person> people = MockData.getPeople();
        //TODO
    }

    @Test
    public void topTenMostExpensiveBlueCars() throws IOException {
        List<Car> cars = MockData.getCars();
        List<Car> tenMostExpensiveBlue = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .sorted(Comparator.comparing(car -> Objects.equals(car.getColor(), "Blue")))
                .limit(10).toList();
    }

}

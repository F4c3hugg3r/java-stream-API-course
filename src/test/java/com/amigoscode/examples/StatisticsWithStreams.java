package com.amigoscode.examples;


import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class StatisticsWithStreams {

    @Test
    public void count() throws Exception {
        List<Car> cars = MockData.getCars();
        long count = cars.stream().filter(car -> car.getColor().equals("Red")).count();
        System.out.println(count);
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();
        Optional<Car> min = cars.stream().min(Comparator.comparing(Car::getPrice));
        System.out.println(min);
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();
        Optional<Car> newest = cars.stream().max(Comparator.comparing(Car::getYear));
        System.out.println(newest);
    }

    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
        //TODO
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
        //TODO
    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
        //TODO
    }

}
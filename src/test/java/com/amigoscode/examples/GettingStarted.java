package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> people = MockData.getPeople();
        List<Person> underEighteen = new ArrayList<>();
        int limit = 0;
        int age = 18;
        for(Person p : people) {
            if(limit == 10) break;
            if(p.getAge() <= age) {
                underEighteen.add(p);
                limit++;
            }
        }

        underEighteen.forEach(System.out::println);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
        List<Person> underEighteen = people.stream()
                .filter(person -> person.getAge() <= 18).
                limit(10).toList();
        underEighteen.forEach(System.out::println);
    }
}

package 기초알고리즘.정렬;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */

public class 나이순정렬Test {

    나이순정렬 application = new 나이순정렬();

    @Test
    public void name() throws Exception {
        int numberOfPerson = 3;
        Person[] people = new Person[numberOfPerson];
        people[0] = new Person(21, "Junkyu", 0);
        people[1] = new Person(20, "Sunyoung", 1);
        people[2] = new Person(21, "Dohyun", 2);

        application.sortPerson(numberOfPerson, people);
    }
}
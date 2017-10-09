package 기초알고리즘.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 */

class Person{
    int age;
    String name;
    int index;

    public Person(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return getAge()+" "+getName();
    }
}

class orderedByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int firAge = o1.getAge();
        int secAge = o2.getAge();

        if (firAge == secAge){
            int firIndex = o1.getIndex();
            int secIndex = o2.getIndex();

            return Integer.compare(firIndex, secIndex);
        }

        return Integer.compare(firAge, secAge);
    }
}

public class 나이순정렬 {
    public void sortPerson(int numberOfPerson, Person[] people) {
        Arrays.sort(people, new orderedByAge());

        printPeople(numberOfPerson, people);
    }

    private void printPeople(int numberOfPerson, Person[] people) {
        for (int i = 0; i < numberOfPerson; i++){
            System.out.print(people[i]+"\n");
        }
    }

    public static void main(String[] args) {
        나이순정렬 application = new 나이순정렬();

        Scanner scanner = new Scanner(System.in);

        int numberOfPerson = scanner.nextInt();
        Person[] people = new Person[numberOfPerson];

        for (int i = 0; i < numberOfPerson; i++){
            people[i] = new Person(scanner.nextInt(), scanner.nextLine(), i);
        }

        application.sortPerson(numberOfPerson, people);
   }
}

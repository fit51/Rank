package algos.graph;

import java.util.Arrays;
import java.util.List;

public class Graph {

    public static void main(String[] args) {
        List<Person> l = Arrays.asList(new Person("1", 23), new Person("1", 23));
        int age = l.get(0).age;
        Boolean ageIsSame = l.stream().allMatch(p -> p.age == age);
        System.out.println(ageIsSame);
    }
}

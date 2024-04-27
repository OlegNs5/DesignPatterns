package ro.ctrln.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
    public static void main(String[] args) {
        ArrayList<Programmer> programmers = new ArrayList<>();
        Programmer programmerOne = new Programmer(); //in loc de asa structurare folosim build() ↓

        programmers.add(Programmer.builder()
                        .name("John")
                        .programmingLanguage("Java")
                .build());

        programmers.add(Programmer.builder()
                        .lastName("Eva")
                        .programmingLanguage("Scala")
                        .skillLevel(9)
                .build());

        programmers.add(Programmer.builder()
                        .name("Joe")
                        .lastName("Doe")
                .build());
//        System.out.println(programmers);

        ArrayList<Developer> developers = new ArrayList<>();

        developers.add(Developer.builder()
                        .name("Erica")
                        .lastName("Jane")
                        .programmingLanguage("Python")
                .build());
        System.out.println(developers);

    }

}

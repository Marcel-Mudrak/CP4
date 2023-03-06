package pl.marcelmudrak.krakow.uek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var names = Arrays.asList("Jakub", "Michał", "Agnieszka", "Ola", "Kasia");

        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("Jakub")); // -> Hello Jakub

        // Greet just ladies
        System.out.println(Greeter.ladies(names));

    }
}
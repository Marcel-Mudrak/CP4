package pl.marcelmudrak.krakow.uek;

import java.util.ArrayList;
import java.util.List;

public class Greeter {
    public String greet(String name){
        return "Hello " + name;
    }

    public static List<String> ladies(List<String> names){
        var ladies = new ArrayList<String>();

        for (String name : names) {
            if (name.endsWith("a")) {
                ladies.add(name);
            }
        }
        return ladies;

//        names.stream()
//                .filter(name -> name.endsWith("a"))
//                .filter(name -> name.endsWith("A"))
//                .map(String::toUpperCase)
//                .forEach(greeter::greet);

    }
}

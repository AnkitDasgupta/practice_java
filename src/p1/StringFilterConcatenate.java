package p1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilterConcatenate {

    public static void main(String[] args) {

        List<String> s = List.of("Ankit","Indranil","Ashu","Babu");

        List <String> k = s.stream()
                .filter(t->t.length()<5)
                .collect(Collectors.toList());

        System.out.println(k);

    }
}

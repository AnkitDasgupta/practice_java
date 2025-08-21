package p1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListPractice {

    public static void main(String[] args) {

                List<Integer> num = List.of(20,40,69,10,5,20,40,88,44,200);

         List<Integer> k = num.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(k);


                List j = num.stream()
                        .sorted(Integer::compareTo)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(j);



        List<Integer> integers = List.of(10, 20, 30, 20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random no --  ");
        int i = sc.nextInt();
        if (integers.contains(i)) {
            System.out.println(i + "  no is present in the list");
        }else {
            System.out.println(i + "  not present");
        }
    }
}

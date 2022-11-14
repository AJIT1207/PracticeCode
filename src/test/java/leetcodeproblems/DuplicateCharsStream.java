package leetcodeproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharsStream {
    public static void main(String[] args) {
        String str = "ajitja";

        List<Object> list = Arrays.asList(str.split(" "));

        list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());

        System.out.println(list);




    }
}

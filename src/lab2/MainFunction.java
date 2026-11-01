package lab2;

import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {


        Function<String, String> uppercase = text -> (text == null) ? "" : text.toUpperCase();


        System.out.println(uppercase.apply("hello"));

    }
}

package com.autobots.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {

    public static void main(String[] args) {
        MathOperations addition = (a, b) -> a + b;
        MathOperations multiply = (a, b) -> a * b;

        System.out.println("5 + 3 = " + addition.operation(5,3));
        System.out.println("5 * 3 = " + multiply.operation(5,3));

        // Predicate Принимает Объект, возврвщает boolean
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("Java"));

        //
        Function<Integer, String> toStringFun = i -> "Число: " + i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("Wriitng: " + s);
        print.accept("Hello world");
    }
}

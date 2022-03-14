package com.archasmiel.learning.lecture39;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(210);
        numbers.add(69);
        numbers.add(420);

        System.out.println(numbers);

        numbers = numbers.stream().map(i -> i += 4).collect(Collectors.toList());

        System.out.println(numbers);


        // Functions as Variables
        // Supplier, Consumer, Callable, Runnable, Function

        // Supplier: no parameter, but return a value
        // () -> x
        Supplier<Integer> supplier = () -> {
            return 10;
        };
        System.out.println(supplier.get());

        // Supplier: one parameter, but no return value
        // x -> ()
        Consumer<String> consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("hello world");

        // Callable: no parameter, but return value and throws exceptions
        // () -> x && throws Exception
        Callable<Float> callable = () -> {
            return 100f / 0f;
        };

        try{
            callable.call();
        } catch (Exception e){
            System.out.println(e);
        }

        // Runnable: no parameters, no return value
        // () -> ()
        Runnable runnable = () -> {
            System.out.println("Hello runnable");
        };
        runnable.run();

        // Function: has parameter, and return value
        // x -> y
        Function<Double, Double> function = (r) -> {
            return r * 3.141592;
        };
        System.out.println(function.apply(10.0));
    }

}

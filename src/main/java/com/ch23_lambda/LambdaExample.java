package com.ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java");
            }
        };
        runnable.run();     // Hello, Java가 출력

        // 람다식 사용
        Runnable lambdarunnable = () -> System.out.println("Hello, Java");
        lambdarunnable.run();

        Supplier<String> stringSupplier = () -> "Hello, Supplier";
        System.out.println(stringSupplier.get());
        String message = stringSupplier.get();
        System.out.println(message);

        Consumer<String> stringConsumer = (memo) -> System.out.println("메세지 : " + memo);
        stringConsumer.accept("Hello, Consumer");

    }
}

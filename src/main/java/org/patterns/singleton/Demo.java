package org.patterns.singleton;

public class Demo {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();
        System.out.printf("Counter 1: %d%n", counter1.getCount());
        System.out.printf("Counter 2: %d%n", counter2.getCount());
        counter1.increment();
        counter2.increment();
        counter2.increment();
        counter1.decrement();
        System.out.printf("Counter 1: %d%n", counter1.getCount());
        System.out.printf("Counter 2: %d%n", counter2.getCount());
    }
}

package com.devcon.sample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        // create a stream of numbers from 1 to 10
        Stream<Integer> stream
            = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);

        // apply takeWhile to take all the numbers matching the passed predicate
        List<Integer> list = stream.takeWhile(number -> (number + 4 == 8))
            .collect(Collectors.toList());

        // apply dropWhile to drop all the numbers matching the passed predicate
        //List<Integer> list2 = stream.dropWhile(number -> (number + 4 == 8))
        //    .collect(Collectors.toList());

        System.out.println(list);

        StreamsDemo sd = new StreamsDemo();
        sd.predicateNotDemo();
    }

    private void predicateNotDemo() {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = i -> i % 2 == 0;

        List<Integer> evenNumbers = list.stream()
            .filter(isEven)
            .collect(Collectors.toList());

        List<Integer> oddNumbers = list.stream()
            .filter(Predicate.not(isEven))
            .collect(Collectors.toList());

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}

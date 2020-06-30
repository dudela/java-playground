package com.devcon.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsDemo {

    public static void main() {

        final List<Integer> exampleList = List.of(1, 2, 3, 4, 5);


        final Set<String> exampleSet = Set.of("ACTIVE", "INACTIVE", "N/A");


        //final Map<String, Integer> exampleMap =
        //    Map.of("COOL", 10, "HAPPY", 12, "SAD", 8, "ANGRY", 14);

        final Map<String, Integer> exampleMap2 = Map.ofEntries(
            Map.entry("COOL", 10),
            Map.entry("HAPPY", 12),
            Map.entry("SAD", 8),
            Map.entry("ANGRY", 14)
        );
    }
}

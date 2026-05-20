package com.devhabit.java.algorithms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> result = input.chars()           // IntStream of characters
            .mapToObj(c -> (char) c)                         // Stream<Character>
            .collect(Collectors.groupingBy(
                Function.identity(),                         // Map key: the character itself
                LinkedHashMap::new,                          // Map supplier: preserves insertion order
                Collectors.counting()                        // Map value: count occurrences
            ))                                               // Returns LinkedHashMap<Character, Long>
            .entrySet()
            .stream()                                        // Stream of map entries
            .filter(entry -> entry.getValue() == 1)          // Filter out duplicates
            .map(Map.Entry::getKey)                          // Extract the character
            .findFirst();                                    // Get the first one that matches

        // Output the result
        result.ifPresentOrElse(
            c -> System.out.println("First non-duplicate character: " + c),
            () -> System.out.println("No non-duplicate character found.")
        );
    }
}
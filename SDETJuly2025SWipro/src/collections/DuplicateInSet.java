package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInSet {
    public static void main(String[] args) {
        // Input list with some duplicates
        List<Integer> input = Arrays.asList(1, 2, 3, 1, 4,3);

        // Set to track unique elements
        Set<Integer> uniqueSet = new HashSet<Integer>();

        // Set to collect duplicate elements
        Set<Integer> duplicateSet = new HashSet<Integer>();

        // Loop through the input list
        for (Integer num : input) {
            // If the number is already in uniqueSet, it’s a duplicate
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicateSet);
    }
}

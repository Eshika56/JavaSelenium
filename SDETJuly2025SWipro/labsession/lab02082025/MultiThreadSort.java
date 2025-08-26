package multithreading;

import java.util.Arrays;

public class MultiThreadSort {

	    // Thread class to sort a part of the array
	    static class SortThread extends Thread {
	        int[] arr;

	        SortThread(int[] arr) {
	            this.arr = arr;
	        }

	        public void run() {
	            // Sorting the array using Arrays.sort()
	            Arrays.sort(arr);
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        // Original unsorted array
	        int[] array = {10,47,36,56,98,20};

	        // Splitting array into 2 halves
	        int mid = array.length / 2;

	        // First half
	        int[] part1 = Arrays.copyOfRange(array, 0, mid);
	        // Second half
	        int[] part2 = Arrays.copyOfRange(array, mid, array.length);

	        // Creating two threads to sort each half
	        SortThread t1 = new SortThread(part1);
	        SortThread t2 = new SortThread(part2);

	        // Starting both threads
	        t1.start();
	        t2.start();

	        // Wait for both threads to finish
	        t1.join();
	        t2.join();

	        // Merging both sorted halves
	        int[] sortedArray = merge(part1, part2);

	        // Printing the sorted array
	        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
	    }

	    // Method to merge two sorted arrays
	    static int[] merge(int[] a, int[] b) {
	        int[] result = new int[a.length + b.length];
	        int i = 0, j = 0, k = 0;

	        // Compare and merge
	        while (i < a.length && j < b.length) {
	            if (a[i] < b[j]) {
	                result[k++] = a[i++];
	            } else {
	                result[k++] = b[j++];
	            }
	        }

	        // Copy remaining elements
	        while (i < a.length) result[k++] = a[i++];
	        while (j < b.length) result[k++] = b[j++];

	        return result;
	    }
	}


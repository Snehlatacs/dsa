package leetcode;

import java.util.Arrays;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs); // Sorting the array

        String start = strs[0]; // First string in sorted order
        String last = strs[strs.length - 1]; // Last string in sorted order

        int i = 0;
        while (i < start.length() && i < last.length() && start.charAt(i) == last.charAt(i)) {
            i++;
        }

        return start.substring(0, i); // Extract the common prefix
    }

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"dog", "racecar", "car"};
        String[] words3 = {"apple", "ape", "april"};
        String[] words4 = {};

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words1)); // Output: "fl"
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words2)); // Output: ""
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words3)); // Output: "ap"
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words4)); // Output: ""
    }
}

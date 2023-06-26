/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saptarshi
 */
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Build the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First non-repeating character in '" + s1 + "': " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First non-repeating character in '" + s2 + "': " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First non-repeating character in '" + s3 + "': " + firstUniqChar(s3));
    }
}

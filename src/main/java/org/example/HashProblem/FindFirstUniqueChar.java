package org.example.HashProblem;

import java.util.LinkedHashMap;
import java.util.Map;
/*
We use a LinkedHashMap to preserve the order of characters.

Count the occurrences of each character.

Then find the first one that has a count of 1.
 */

public class FindFirstUniqueChar {
    public static void main(String[] args) {
        String input = "aabbcdeff";
        Character result = firstNonRepeatingChar(input);
        System.out.println("First non-repeating character: " + result); // Output: c
    }
    public static Character firstNonRepeatingChar(String str) {
       Map<Character,Integer> charactor=new LinkedHashMap<Character,Integer>();

       // Step 1: Count frequency of each character
        for(int i=0;i<str.length();i++){
            charactor.put(str.charAt(i),charactor.getOrDefault(str.charAt(i),0)+1);
        }

        // Step 2: Return the first character with count 1
        for(Map.Entry<Character,Integer> entry :charactor.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return null; // No non-repeating character
    }
}

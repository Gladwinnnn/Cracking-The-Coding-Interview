/*
    Question 1.1 - Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures? 
*/

import java.util.*;

public class IsUnique{
    public static void main(String[] args){
        System.out.println("Test case 1 (ABCA): " + isUnique("ABCA"));
        System.out.println("Test case 2 (ABC): " + isUnique("ABC"));
        System.out.println("Test case 3 (): " + isUnique(""));
    }

    public static boolean isUnique(String input){
        Hashtable<Character,Integer> list = new Hashtable<>();
        
        for (int i = 0; i < input.length(); i++){
            if(list.containsKey(input.charAt(i))){  // checking if the key already exists. If it already exists, return false
                return false;
            } else{
                list.put(input.charAt(i),1);        // if not, put the character into the hashtable
            }
        }

        return true;
    }
}
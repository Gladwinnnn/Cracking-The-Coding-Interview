/*
    Question 1.2 - Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 
*/

import java.util.*;

public class CheckPermutation{
    public static void main(String[] args){
        System.out.println("Test case 1 (ABCA, CBAA): " + checkPermutation("ABCA", "CBAA"));
        System.out.println("Test case 2 (QWTGHBW, DAPXLQI): " + checkPermutation("QWTGHBW", "DAPXLQI"));
        System.out.println("Test case 3 (QWERT, TREWQ): " + checkPermutation("QWERT", "TREWQ"));
        System.out.println("Test case 4 (god   , dog): " + checkPermutation("god   ", "dog"));
    }

    public static boolean checkPermutation(String input1, String input2){
        Hashtable<Character,Integer> list1 = new Hashtable<>();
        Hashtable<Character,Integer> list2 = new Hashtable<>();
        
        for (int i = 0; i < input1.length(); i++){
            if(list1.containsKey(input1.charAt(i))){        // checking if the key already exists. If it does, increment the value
                int counter = list1.get(input1.charAt(i));
                list1.put(input1.charAt(i),counter+1);
            } else{
                list1.put(input1.charAt(i),1);              // if not, add it to the hashtable with a value of 1
            }
        }

        for (int j = 0; j < input2.length(); j++){
            if(list2.containsKey(input2.charAt(j))){        // checking if the key already exists. If it does, increment the value
                int counter = list2.get(input2.charAt(j));
                list2.put(input2.charAt(j),counter+1);
            } else{
                list2.put(input2.charAt(j),1);              // if not, add it to the hashtable with a value of 1
            }
        }

        for(char character:list1.keySet()){
            if (!list2.containsKey(character)){             // checking if both hashtable contains the same keys
                return false;                               // returns false if there are no similar keys
            } else{
                if (list1.get(character) != list2.get(character)){  // checking if the values of the keys are the same
                    return false;                                   // returns false is the values are not the same
                }
            }
        }
        return true;
    }
}
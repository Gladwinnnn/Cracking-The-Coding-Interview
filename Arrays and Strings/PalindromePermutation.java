import java.util.*;

public class PalindromePermutation{
    public static void main(String[] args){
        String input = "Taco Cat";
        if (input.length() % 2 != 0){
            System.out.print(checkOdd(putIntoHashtable(input))); 
        } else {
            System.out.print(checkEven(putIntoHashtable(input))); 
        }
    }

    public static Hashtable<Character,Integer> putIntoHashtable(String input){      // function to put every character into a hash table
        Hashtable<Character,Integer> result = new Hashtable<>();
        String newInput = input.replace(" ", "").toLowerCase();                     // remove all whitespaces as well as make the whole string lowercase

        for (int i = 0; i < newInput.length(); i++){
            if (result.containsKey(newInput.charAt(i))){                            // if the hash table already contains the character
                result.put(newInput.charAt(i), result.get(newInput.charAt(i)) + 1); // increment the value of the key
            } else {
                result.put(newInput.charAt(i), 1);                                  // else just put the character into the hash value with an initial value of 1
            }
        }
        return result;
    }

    public static boolean checkOdd(Hashtable<Character,Integer> hashTable){
        boolean oneOdd = false;                                                     // initialize this boolean to be false;
        for (char character: hashTable.keySet()){                                   
            if (hashTable.get(character) % 2 != 0){                                 // this is to check there is a key with value that is an odd numvber. There should only be a key value that is odd
                if (oneOdd){                                                        // if this condition has already been fulfilled, return false as there can only be one
                    return false;
                }
                oneOdd = true;                                                      // set this condition to be true to indicate conditon has already been fulfilled
            }
        }
        return true;
    }

    public static boolean checkEven(Hashtable<Character,Integer> hashTable){
        for (char character: hashTable.keySet()){
            if (hashTable.get(character) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
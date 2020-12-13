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

    public static Hashtable<Character,Integer> putIntoHashtable(String input){
        Hashtable<Character,Integer> result = new Hashtable<>();
        String newInput = input.replace(" ", "").toLowerCase();

        for (int i = 0; i < newInput.length(); i++){
            if (result.containsKey(newInput.charAt(i))){
                result.put(newInput.charAt(i), result.get(newInput.charAt(i)) + 1);
            } else {
                result.put(newInput.charAt(i), 1);
            }
        }
        return result;
    }

    public static boolean checkOdd(Hashtable<Character,Integer> hashTable){
        boolean oneOdd = false;
        for (char character: hashTable.keySet()){
            if (hashTable.get(character) % 2 != 0){
                if (oneOdd){
                    return false;
                }
                oneOdd = true;
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
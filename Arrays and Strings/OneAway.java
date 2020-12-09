public class OneAway{
    public static void main(String[] args){
        String input1 = "pale";
        String input2 = "bake";
        if (input1.length() == input2.length()){                            // if same length, execute this function
            System.out.println("Test case: " + replace(input1,input2));
        } else if (input1.length() - 1 == input2.length()){
            System.out.println("Test case: " + oneInsert(input1,input2));   // if input1 longer than input2, execute this function 
        } else if (input1.length() + 1 == input2.length()){
            System.out.println("Test case: " + oneInsert(input2,input1));   // if input2 longer than input1, execute this function and swap the positions
        }
    }

    public static boolean replace(String input1, String input2){
        boolean hasBeenReplaced = false;                                    // sets a condition to see if a replacement has happened. Original state: false
        for (int i = 0; i < input1.length(); i++){
            if (input1.charAt(i) != input2.charAt(i)){                      
                if (hasBeenReplaced){                                       // if the characters dont tally, check if a replacement has already happened
                    return false;                                           // if replacement has already happened, return false as there can only be one edit
                }
                hasBeenReplaced = true;                                     // else set the replacement condition to be true to indicate a replacement has already happened
            }
        }

        return true;
    }

    public static boolean oneInsert(String input1, String input2){
        int index1 = 0;
        int index2 = 0;
        boolean hasBeenInserted = false;                                    // sets a condition to see if an insertion has happened. Original state: false

        while (index1 < input1.length() && index2 < input2.length()){
            if (input1.charAt(index1) == input2.charAt(index2)){            // if the characters tally, move on to the next index
                index1++;
                index2++;
            } else{                                                         // if it doesn't tally, check if the insertion has already happened
                if (hasBeenInserted){                                       // returns false if insertion has already happened as insertion can only happen once
                    return false;                           
                }
                hasBeenInserted = true;                                     // else set the insertion condition to be true to indicate an insertion has already happened
                index1++;                                                   // move on to the next index
            }
        }

        return true;
    }
}
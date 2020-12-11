public class StringCompression{
    public static void main(String[] args){
        System.out.println("Test case 1 (aabcccccaaa): " + compress("aabcccccaaa"));
    }

    public static String compress(String input){
        String compressed = "";                         // set the result to be an empty String
        char placeHolder = input.charAt(0);             // set the 1st character of the String to be the placeHolder to kick start the problem
        int count = 1;                                  // setting the count to be 1 to indicate that the 1st character appears once thus far

        for (int i = 1; i < input.length(); i++){       // looping through the entire String starting from the 2nd character
            if (input.charAt(i) != placeHolder){        // if the next character is different from the placeHolder character
                compressed += "" + placeHolder + count; // add the placeHolder character as well as the count of it to the result String
                placeHolder = input.charAt(i);          // set the new placeHolder to be the current character to continue with the problem
                count = 1;                              // set the count to be 1 as well
            } else {
                count++;                                // otherwise, increment counter to indicate that the character has already appeared multiple times
            }
        }
        compressed += "" + placeHolder + count;         // finally add the last block of the String to the result String as previously it would not be added unless the next character is different

        return compressed;                              // return the result String
    }
}
/*
    Question 1.3 - URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, 
    and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.) 
*/

public class URLify{
    public static void main(String[] args){
        System.out.println(urlify("Mr John Smith "));
    }

    public static String urlify(String input){
        String result = "";
        input = input.trim();
        String[] stringArray = new String[input.length()];

        for(int i = 0; i < input.length(); i++){
            stringArray[i] = "" + input.charAt(i);         // slotting all characters into a String array
        }

        for(int j = 0; j < stringArray.length; j++){       // loops through the string array and replaces the empty spaces with "%20"
            if (stringArray[j].equals(" ")){
                stringArray[j] = "%20";
            }
        }

        for(String x:stringArray){                         // printing out the new String
            result += x;
        }

        return result;
    }
}
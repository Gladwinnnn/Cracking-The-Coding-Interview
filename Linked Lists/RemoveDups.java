import java.util.*;

public class RemoveDups{
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(5);
        System.out.print(removeDups(linkedList));
    }

    public static LinkedList<Integer> removeDups(LinkedList<Integer> input){
        LinkedList<Integer> result = new LinkedList<>();
        ArrayList<Integer> placeHolder = new ArrayList<>();

        for (int temp:input){
            if (!placeHolder.contains(temp)){
                placeHolder.add(temp);
                result.add(temp);
            }
        }
        return result;
    }
}
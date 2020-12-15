import java.util.*;

public class SumLists {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();

        node1.append(new int[]{7,1,6});
        node2.append(new int[]{5,9,2});

        ArrayList<Integer> arrayList1 = arrayList(node1);
        ArrayList<Integer> arrayList2 = arrayList(node2);

        int value1 = getValue(arrayList1);
        int value2 = getValue(arrayList2);
        int total = value1 + value2;

        ArrayList<Integer> arrayList3 = arrayList("" + total);
        int[] array1 = array(arrayList3);
        Node node3 = new Node();
        node3.append(array1);

        while (node3.next != null) {
            System.out.print(node3.next.data);
            node3 = node3.next;
        }
    }

    public static ArrayList<Integer> arrayList(Node node) {     // place the data of the nodes into an arrayList
        ArrayList<Integer> result = new ArrayList<>();

        while (node.next != null) {
            result.add(node.next.data);
            node = node.next;
        }

        return result;
    }

    public static ArrayList<Integer> arrayList(String input) {  // place the characters of the String into an arrayList. reverse the arrayList as well
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            result.add(Integer.parseInt("" + input.charAt(i)));
        }

        Collections.reverse(result);
        return result;
    }

    public static int[] array(ArrayList<Integer> arrayList) {   // place the elements in an arrayList into an array
        int[] array = new int[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

    public static int getValue(ArrayList<Integer> arrayList) {  // getting the integer value from an arrayList
        Collections.reverse(arrayList);
        String placeHolder = "";

        for (int value:arrayList) {
            placeHolder += value;
        }

        return Integer.parseInt(placeHolder);
    }

}
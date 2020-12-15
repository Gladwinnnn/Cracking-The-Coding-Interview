import java.util.*;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node node = new Node();
        int[] array = new int[]{1,2,3,4,5,2,6,1};
        node.append(array);
        int random = (int)(Math.random() * (7 - 1 + 1) + 1);    // generates a random number
        
        ArrayList<Integer> placeHolder = arrayList(node);
        ArrayList<Integer> placeHolder2 = newArrayList(placeHolder, random);
        int[] newArray = array(placeHolder2);

        Node newNode = new Node();
        newNode.append(newArray);

        while (newNode.next != null) {
            System.out.println(newNode.next.data);
            newNode = newNode.next;
        }
    }

    public static ArrayList<Integer> arrayList(Node node) {
        ArrayList<Integer> resultArrayList = new ArrayList<>();

        while (node.next != null) {
            resultArrayList.add(node.next.data);
            node = node.next;
        }

        return resultArrayList;
    }

    public static ArrayList<Integer> newArrayList(ArrayList<Integer> arrayList, int position) {
        ArrayList<Integer> resultArrayList = arrayList;
        arrayList.remove(position);
        return resultArrayList;
    }

    public static int[] array(ArrayList<Integer> arrayList) {
        int[] resultArray = new int[arrayList.size()];
        
        for (int i = 0; i < arrayList.size(); i++) {
            resultArray[i] = arrayList.get(i);
        }

        return resultArray;
    }
}
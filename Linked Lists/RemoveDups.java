import java.util.*;

class Node {
    Node next = null;
    int data;

    public Node(){

    }

    public Node(int d){
        data = d;
    }

    public void append(int[] value) {               // function to append the linkedlist
        Node current = this;
        Node temp = new Node();

        while (current.next != null) {
            current = current.next;
        }
        for (int i = 0; i < value.length; i++){
            temp = new Node(value[i]);
            current.next = temp;
            current = current.next;
        }
    }
}

public class RemoveDups{
    public static void main(String[] args){
        Node node = new Node();
        node.append(new int[]{1,2,3,4,5,2,6,1});

        Set<Integer> newSet = getSet(node);
        int[] newArray = new int[newSet.size()];
        int counter = 0;

        for (int value:newSet) {
            newArray[counter] = value;
            counter++;
        }

        Node newNode = new Node();
        newNode.append(newArray);

        while (newNode.next != null) {
            System.out.println(newNode.next.data);
            newNode = newNode.next;
        }
    }

    public static Set<Integer> getSet(Node node){       // function to return a set to remove the dups in the linkedlist
        Set<Integer> resultSet = new HashSet<>();

        while (node.next != null) {
            resultSet.add(node.next.data);
            node = node.next;
        }
        return resultSet;
    }
}
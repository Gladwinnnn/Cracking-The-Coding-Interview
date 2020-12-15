public class ReturnKthtoLast {
    public static void main(String[] args) {
        Node node = new Node();
        node.append(new int[]{1,2,3,4,5,2,6,1});  
        
        int[] newArray = array(node);
        int[] newArray2 = changedArray(newArray, 5);
        
        Node newNode = new Node();
        newNode.append(newArray2);

        while (newNode.next != null) {
            System.out.println(newNode.next.data);
            newNode = newNode.next;
        }
    }

    public static int[] array(Node node) {          // storing the node's data in an array and return that array
        Node tempNode = node;
        int counter = 0;

        while (node.next != null) {
            counter += 1;
            node = node.next;
        }

        int[] newArray = new int[counter];
        int position = 0;

        while (tempNode.next != null) {
            newArray[position] = tempNode.next.data;
            tempNode = tempNode.next;
            position++;
        }

        return newArray;
    }

    public static int[] changedArray(int[] array, int position) {   // storing the new array by taking in an array and the position to count from and return that new array
        int[] newArray = new int[array.length - position];
        int counter = 0;

        for (int i = position; i < array.length; i++) {
            newArray[counter] = array[i];
            counter++;
        }

        return newArray;
    }
}
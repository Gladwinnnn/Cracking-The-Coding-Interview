import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Node node = new Node();
        node.append(new int[]{1,2,3,4,1,2});
        Hashtable<Integer, Integer> hashTable1 = putIntoHashTable(node);
        if (hashTable1.size() % 2 == 0) {
            System.out.print(checkPalindromeEven(hashTable1));
        } else {
            System.out.print(checkPalindromeEven(hashTable1));
        }
    }

    public static Hashtable<Integer, Integer> putIntoHashTable(Node node) {
        Hashtable<Integer, Integer> result = new Hashtable<>();

        while (node.next != null) {
            int value = node.next.data;
            if (result.contains(value)) {
                int count = result.get(value);
                result.put(value, count + 1);
            } else {
                result.put(value, 1);
            }

            node = node.next;
        }

        return result;
    }

    public static boolean checkPalindromeOdd(Hashtable<Integer, Integer> hashTable) {
        boolean status = false;
        for (int value:hashTable.keySet()) {
            if (hashTable.get(value) == 1) {
                if (status) {
                    return false;
                }
                status = true;
            }
        }
        return true;
    }

    public static boolean checkPalindromeEven(Hashtable<Integer, Integer> hashTable) {
        for (int value:hashTable.keySet()) {
            if (hashTable.get(value) == 1) {
                    return false;
            }
        }
        return true;
    }
}
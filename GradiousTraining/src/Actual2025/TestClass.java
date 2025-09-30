package Actual2025;

public class TestClass {
    private int size;
    private ListNode[] table;

    public TestClass(int size) {
        this.size = size;
        this.table = new ListNode[size];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    public void put(String key, int value) {
        int index = hash(key);
        ListNode newNode = new ListNode(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            ListNode current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newNode;
            }
        }
    }

    public int get(String key) {
        int index = hash(key);
        ListNode current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return -1; // Key not found
    }

    public void remove(String key) {
        int index = hash(key);
        ListNode current = table[index];
        ListNode prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    table[index] = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TestClass hashTable = new TestClass(10);
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);
        System.out.println(hashTable.get("apple"));   // Output: 10
        System.out.println(hashTable.get("banana"));  // Output: 20
        System.out.println(hashTable.get("orange"));  // Output: 30
        hashTable.put("banana", 25);
        System.out.println(hashTable.get("banana"));  // Output: 25
        hashTable.remove("banana");
        System.out.println(hashTable.get("banana"));  // Output: -1 (Key not found)
    }
}

class ListNode {
    String key;
    int value;
    ListNode next;

    ListNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
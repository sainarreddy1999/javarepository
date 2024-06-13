#HashSet


import java.util.HashSet;
import java.util.Scanner;

public class ImprovedPerformanceExample {
    public static void main(String[] args) {
        HashSet<Integer> evenset = new HashSet<>();
        HashSet<Integer> oddset = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Adding elements dynamically
        System.out.println("Enter the number of elements you want to add:");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element%2==0){
                 evenset.add(element);
            }
            else {
                oddset.add(element);
            }
           
        }

        // Display the set
        System.out.println("EvenSet:"+evenset);
        System.out.println("OddSet: " + oddset);

        // Checking for a specific element
        System.out.println("Enter an element to check if it exists in the set:");
        int elementToCheck = scanner.nextInt();

       

        scanner.close();
    }
}


#LinkedList
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Cherry");
        list.addLast("Date");
        
        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        
        // Removing elements
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        
        // Iterating through the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}


import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // Adding elements
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        // Retrieving elements in a thread-safe manner
        System.out.println("Value for Banana: " + map.get("Banana"));



        
    }
}

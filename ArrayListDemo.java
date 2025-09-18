import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    
    System.out.println("Contains Apple: " + fruits.contains("Apple"));
    System.out.println("Size of list: " + fruits.size());
    fruits.remove("Banana");
    System.out.println("Size after removal: " + fruits.size());
    System.out.println("Fruits after removal: "+ fruits);

    System.out.println("Is Empty?: " + fruits.isEmpty());
    Iterator<String> it = fruits.iterator();
    while (it.hasNext()) {
        System.out.print(it.next()+ " ");
    }
    System.out.println();   

    fruits.set(0,"Mango");
    System.out.println(fruits);
    // fruits.clear();
    // System.out.println("Size after clear: " + fruits.size());
    
    Collections.sort(fruits);
    System.out.println("Sorted fruits: " + fruits);
    Collections.reverse(fruits);
    System.out.println("Reversed fruits: " + fruits);


}
}
    

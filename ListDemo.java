import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Rohit");
        students.add("Anjali");
        students.add("Amit");

        for (String student : students) {
            System.out.println(student);
        }
    
    System.out.println("Contains Rohit: " + students.contains("Rohit"));
    System.out.println("Size of list: " + students.size());
    students.remove("Amit");
    System.out.println("Size after removal: " + students.size());
    System.out.println("Students after removal: "+ students);


    System.out.println("Is Empty?: " + students.isEmpty());



    Iterator<String> it = students.iterator();
    while (it.hasNext()) {
        System.out.print(it.next()+ " ");
    }
    System.out.println();   

    students.set(0,"Amit");
    System.out.println(students);
    students.clear();
    System.out.println("Size after clear: " + students.size());

    }

}
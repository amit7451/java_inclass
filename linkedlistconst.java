import java.util.LinkedList;

public class linkedlistconst{

    public static void main(String[] args){

        LinkedList <String>issuedbooks = new LinkedList<>();
        issuedbooks.add("Java");
        issuedbooks.addFirst("Python");
        issuedbooks.addLast("C++");

        System.out.println(issuedbooks);
        issuedbooks.removeFirst();
        System.out.println(issuedbooks);

        System.out.println("Size of list: " + issuedbooks.size());
        System.out.println("Is Empty?: " + issuedbooks.isEmpty());
        System.out.println("Contains Java: " + issuedbooks.contains("Java"));

        System.out.println("At index 1: " + issuedbooks.get(1));

        issuedbooks.set(1,"HTML");
        System.out.println(issuedbooks);

        issuedbooks.clear();
        System.out.println("Size after clear: " + issuedbooks.size());
        System.out.println(issuedbooks);
        
    }
}
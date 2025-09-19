import java.util.LinkedList;

public class linkedlist{
    public static void main(String args[]){
        LinkedList<Integer> l1= new LinkedList<>();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);

        System.out.println(l1);
        l1.addFirst(0);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);

        

    }
}
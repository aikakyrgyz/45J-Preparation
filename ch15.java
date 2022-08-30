import java.util.LinkedList;
import java.util.ListIterator;
/*

A LinkedList class in the java.util package is a generic class, just like the ArrayList class.
You specify the type of the list elements in angle brackets, such as LinkedList<String> or LinkedList<Product>


LinkedList Methods:

*/
public class ch15 {
  public static void main(String[] args) {
    LinkedList<String> staff = new LinkedList<String>();
    staff.addLast("Aika");
    staff.addFirst("Zalkar");
    staff.getFirst();
    staff.getLast();
    String removed = staff.removeFirst();
    System.out.println(removed);
    String removed2 = staff.removeLast();
    System.out.println(removed2);


    // ListIterator
    staff.addLast("Raspberry");
    staff.addLast("Strawberry");
    staff.addLast("Blueberry");

    // [Raspberry, Strawberry, Blueberry]
    ListIterator<String> iterator = staff.listIterator();
    iterator.next();
    String b = iterator.next();
    System.out.println(b);
    iterator.remove();
    // ['Raspberry', Strawberry]
    System.out.println("LOOP ----> ");
    for (String name: staff) {
      System.out.println(name);
    }
  }
}

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
public class ReadFile {
  // final int x;// should be initialized if in a class
  public static void readfile() {
    try {
      File myObj = new File("story.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    readfile();
    double X = 123.321;
    String Y = "Hi!";
    System.out.format("%1.3f%s", X, Y);


    class Shape {
    }
    class Square extends Shape {}

    Shape s = new Shape();
    Square q = new Square();
    System.out.println();
    System.out.println(s.getClass());
    System.out.println(q.getClass());

    ArrayList<Shape> ml = new ArrayList<Shape>();
    ml.add(s);
    ml.add(q);
    System.out.println(ml);
    System.out.println(ml.get(1).getClass());

    String language = "English";
    String country = "Canada";
    String stateOrProvince = "Quebec";
    if (country.equals("Canada"))
        if (stateOrProvince.equals("Quebec"))
        language = "French";
    else if (country.equals("China"))
        language = "Chinese";
    System.out.println(language);

    final int n; // can create without initializing in a method.


    // LinkedList<String> staff = new LinkedList<String>(); ListIterator<String> iterator = staff.listIterator(); iterator.add("Tom");
    // iterator.add("Diana");
    // iterator.add("Harry");
    // iterator = staff.listIterator();
    // if (iterator.next().equals("Tom"))
    //   System.out.println("Yes, Tom");
    //   iterator.remove();
    // while (iterator.hasNext())
    //   System.out.println(iterator.next());
    // System.out.println(iterator.previous());
    // iterator.remove();
    // System.out.println(iterator.previous());
    // iterator.remove();


    // System.out.println(staff);
    // System.out.println(iterator.remove());

    LinkedList<String> staff = new LinkedList<String>(); ListIterator<String> iterator = staff.listIterator(); iterator.add("Tom");
    iterator.add("Diana");
    iterator.add("Harry");
    iterator = staff.listIterator(); iterator.next(); iterator.next(); iterator.add("Romeo"); iterator.next(); iterator.add("Juliet");
    iterator = staff.listIterator(); iterator.next(); iterator.remove();
    while (iterator.hasNext())
    System.out.println(iterator.next());




    }
  }

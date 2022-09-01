
.equals(String s) - Checks if two strings have the same value, not reference.
== Checks if two strings have the same reference

System.out.println(3 + 4 + "Hi"); // 7Hi

Static class variables belong to the class instead of a specific instance of an object.
Can Java pass variables by reference? Nope! Java passes everything by value.


System.out.format("The value of " + "the float variable is " +
     "%f, while the value of the " + "integer variable is %d, " +
     "and the string is %s", floatVar, intVar, stringVar);
%d	 	A decimal integer.
%f	 	A float.
%n	 	A new line character appropriate to the platform running the application. You should always use %n, rather than \n.


Objects that are equal (according to their equals()) must return the same hash code

If two objects are unequal according to the equals(java.lang.Object) method,
calling the hashCode method on each of the two objects doesn't need to produce distinct integer results, they might
return the same result.


 For an integer literal, the JVM matches in the following order: int, long, Integer, int....
 In other words, it first looks for an int type parameter; if it is not provided, then it looks for long type;
 and so on. Here, since the int type parameter is not specified with an overloaded method,
 it matches with foo(long).


You can provide only a LESS restrictive or same-access modifier when overriding a method.


// Two-dimensional array

String[][] board = new String[ROWS][COLUMNS]

//number of rows:
board.length
//number of columns:
board[i].length

//arrays:
int[] values = new int[10]


1. the size is fixed, use the Arrays.copyOf(array_name, length*2) to change the Size
array list:

/////////////////////////////////////////////////////////////////////////////////////

ArrayList<String> names = new ArrayList<String>()
for primitive types have to use the wrapper/auto-boxing to make them objects
           1. Size can change
           2. Stores objects

/////////////////////////////////////////////////////////////////////////////////////

//Interfaces:
public interface InterfaceName
{
  double getMeasure();
}

// all methods in the interface are automatically public

// the constructor of the super class is automatically called with no parameters if the super() with
// some parameters is not specified.

// --- converting between subclass and superclass types

// all references can be converted to the type Object

// casting from superclass type to subclass type is legal but dangerous --> use instanceof method

// casting from subclass to superclass
// anObject instanceof BankAccount

BankAccount anAccount = new CheckingAccount()
anAccount.deposit(100)

// here the deposit method of the CheckingAccount will be called -> CheckingAccount.deposit(100)
// this is determined by the dynamic method lookup

// Rule: the method to be called is always determined by the type of the actual object, not the type of the variable

REMEMBER: All of the interface methods must be supplied in the classes that implement that interface!

// --- Abstract classes ---

// A class that declares an abstract method, or that inherits an abstract methot without overrdiging it, must be declared Abstract
// You can also declare classes with no abstract methods as abstract.
// You cannot consturct an object of abstract class, but you can still have a variable whose type is abstract class, of course
// the actual object to which it refers must be an instance of a concrete subclass

// Abstact classes differ from interfaces in an important way -- they can have instance variables,
// and they can have concrete methods and constructors

// final class -> prevent from creating subclasses or from overriding certain methods
// you can also declare individual methods as final so that they do not get overridden
// cannot make overridden methods private protected keyword
// protected data can ve accessed by the methods of the class and all its subclasses and by all classes in the same package..


// Overriding the Object class's methods:
// need to pass the type Object to the parameter:

public boolean equals(Object otherObject)

public String toString()

public Object clone()

/////////////////////////

------------- INTERFACES-------------

public class DataSet // Modified for BankAccount objects
  {
    private double sum;
    private BankAccount maximum;
    private int count;

    public void add(BankAccount x) {
      sum = sum + x.getBalance();
      if (count == 0 || maximum.getBalance() < x.getBalance())
      maximum = x; count++; }

    public BankAccount getMaximum() {
      return maximum;
    }
  }


// public class DataSet // Modified for Coin objects
// {
//     private double sum;
//     private Coin maximum;
//     private int count;
//
//     public void add(Coin x)
//     {
//     sum = sum + x.getValue();
//     if (count == 0 || maximum.getValue() < x.getValue())
//     maximum = x; count++;
//     }
//     public Coin getMaximum()
//     {
//     return maximum;
//   }
// }

// make in interface instead

// A Java interface type declares methods but does not provide their implementations


// public class DataSet
// {
//     private double sum;
//     private Measurable maximum;
//     private int count;
//
//     public void add(Measurable x)
//     {
//     sum = sum + x.getMeasure();
//     if (count == 0 || maximum.getMeasure() < x.getMeasure())
//     maximum = x; count++;
//     }
//
//     public Measurable getMaximum()
//     {
//     return maximum;
//     }
// }


// public class Coin implements Measurable
// {
//
//   public double getMeasure(){ // don't forget to declare this method public in the implementing class
//       return value;
//   }
// }


// -------- CONVERTING BETWEEN CLASS AND INTERACE TYPES -------------

// You can convert from a class type to an interface type, provided the class implements the interface and vice versa

public class java45jprep {

  public interface Measurable
  {
      double getMeasure();  // method is public by default
  }

  public class BankAccount implements Measurable
  {

    private double balance;

    public BankAccount(){
      balance = 0;
    }
    public BankAccount(double initialBalance) {
      balance = initialBalance;
    }
    public void deposit(double amount)
    {
      balance = balance+amount;
    }
    public double getBalance() {
      return balance;
    }

    public double getMeasure(){
        return balance;
    }
  }

  public static void main(String[] args)
  {

    BankAccount account = new BankAccount(1000);
    System.out.println(account.getBalance());
  }

}



// Inner classes: the methods of inner class have a privilage
// of accessing private data members of outerclass objects.
// We can make the inner class static in order to specify that the inner classes does not need access to the outer class data,
// so it does not store te inner class reference.


/*
public class LinkedList {
  ...
  private static class Node {
    ...
    }
}

So here, the class Node will not have access to the instance varaibale of the outer class Linked List

*/

// Strings
// for comparing two strings compare: string1.equals(string2)
// do not use string1 == string2

// string1.compareTo(string2) </ >/ == 0

// when a comparing floating-point numbers, don't test for equality. Instead, check whether they are close enough.

// ENUMs

/*
public enum FillingStatus { SINGLE, MARRIED };
FillingStatus status;

status = FillingStatus.SINGLE

if (status == FillingStatus.SINGLE) {...}

In Java, enumaration types are classes with special properties. There are exactly two objects of the FillingStatus class:
FillingStatus.SINGLE and FillingStatus.MARRIED

we can use string methods with those objects:

FillingStatus.SINGLE.toString() -> "SINGLE"

The CLONE method returns the given object without making a copy. So, it should not be possible to generate new objects of an enumeration class

*/

/* Classes and inhertaince
The difference between inhertiance and interface: INTERFACE is not a class, so it has NO behavior, wheraht superclass has
behavior that the children inherit.

A chid class has no aaccess to the private instanc variables of the superclass.

Overload == the method name is the same, but the parameters are different, so the two methods are not related to each other at all

Overriding == the method name is the same, but the body is different, this method replaces the overridden methods

Remember: To call the superclass constructor from the child class constructor, use the super() and it must be the first statement
in the body! The first! Like:
public CheckingAccount(double amount){
super(amount);
transactioncount = 0


// BankAccount methods:
1. deposit
2. withdraw
3. getBalance

//SavingsAccount:
1. addInterest

//CheckingAccount:
1. deductFees
2. deposit
3. withdraw

Converting between Child and Parent Types

// child -> parent

SavingsAccount collegeFund = new SavingsAccount(10);
BankAccount anAccount = collegeFund; // however, now the anAccount does not have access to the addInterest, since it is the BankAccount object now

// all can be converted to Object type:

Object anObject = collegeFund; // cannot invoke any methods of the SavingAccount class, since Object does not know about them

// parent -> child

BankAccount anAccount = (BankAccount) anObject; // here, the an anObject must hold the BankAccount reference
// so, do the parent-> child casting only if you are sure that the parent is actually referring to the related child object.
//to make sure about that you can use instanceof method:

if (anObject instanceof BankAccount)  {
BankAccount anAccount = (BankAccount) anObject; }
}

Polymorphism and Inheritance

Which deposit method is called ? of BankAccount of CheckingAccount class?

BankAccount anAccount = new CheckingAccount();
anAccount.deposit(1000);

// Here, the CheckingAccount.deposit(1000) will be called
// it does not matter that the object reference is stored in a variable of type BankAccount
It is called dynamic method lookup.

So, the method to be called is always determined by the type of the actual object, not the type of the variable in which the reference is stored


Abstact Classes
If you want to force the programmer to override the method of the superclass, then make it abstract.
// public abstract void deductFees();

If you want to force the programmer to create subclasses, then declare the parent class abstract.


An abstract method has not implementation, this forces the implementors of subclasses to specify concrete implementation of this method.
You cannot construct objects of classes with abstract methods.
A class that declares an abstract metod, or that inherits an abstract method wihtout overriding it, MUST be declared abstraat.
You can also declare classes with no abstarct methods as abstact.

public abstact class BankAccount{
  public abstact void deductFees();

}

Note: you cannot construct an object of an abstact class, but you can STILL have a variable whose type is abstact class

BankAccount anAccount;
anAccount = new BankAccount(); // ERROR -> BankAccount is abstract
anAccount = new SavingAccount(); // OK
anAccount = null; // OK

Difference between abstarct classes and interfaces:
Abstract class can have instance variables and can have concrete methods and constructors

ANTONYMS: ABSTACT CLASS <-> CONCRETE ClASS

To force the programmers to NOT create subclasses or override methods declare the FINAL!
public final class String {} // class
public final void checkName {} // method

Common ErroR: overiding methods to be less accessible in the child classes, i.e. declaring it private if in
the parent class it is declared public


Protected Access:
Protected can be accessed by all subclass and by all classes in the same package.

Object class, overriding its methods:
Methods:

String toString(); == __str__
boolean equals(Object otherObject); == __eq__ // remember you cannot change the parameter type ! it must be Object
Object clone(); // makes a full copy of an object, returns a new object, the return type of the clone method is of the class Object, after it is returned
// you should cast to the actual type of the class.

equals // checks if the contents are the same , so equals jsut checks the contents
== // checks if the variables refer to the same object
Overriding equals method:
public boolean equals (Object otherObject){
  Coin other = (Coin) otherObject; // need to cast
  return name.equals(other.name) && value == other.value;
}
when you override the equals method, you should also override the hashCode method

Testing if two objects belong to the same class:
if (getClass() != otherObject.getClass()) return False; // this line should be in the equals method

When you implement equals in a subclass, you should first call equals in the superclass

How to use the clone method?
Tip: Clone mutable instance variables in accessor methods:
public BankAccount getAccount(){
return account
}

instead do this:
public BankAccount getAccount() {
return (BankAccount) account.clone(); // need to cast to BankAccount since the clone method returns an Object type.
}
*/




/*

Package access:
A field or method that is not declared as public or private can be accesssed by all classes
in the same package, which is usually not desirable.
*

Interfaces:

Interfaces:
1. All methods are abstract
2. all methods are automatically public
3. Does not have instance variables (but it can have constants speficied)
4. You can have varibales of a the interafece type, but cannot instantiate objects!
  // ex:
  // Measurable m;
  // Measurable m  = new Measurable(); // ERROR!
  // Measurable m = new BankAccount(); // OK
public interface Sides {
  int NORTH = 1;
  int WEST = 2;
}


Converting between class and interface types:
You can convert from a classs type to an interace type provided the class implements the interface
BankAccount account = new BankAccount(1000);
Measurable m = account; // legal since BankAccount implement the Measurable interface

or

Coin dime = new Coin(10);
Measurable m = dime; // legal since Coin implement the Measurable interface
// m can only invoke methods that are declared in Measurable, not the Coin
Measurable m = new Rectangle(10,10); // ERROR since Rectangle does not implement the Measurable

Convert from interface type to class type:

DataSet coinData = new DataSet();
Measurable max = coinData. getMaximum(); // returns a Coin object
String coinName = max.getName(); // ERROR, max cannot access the methods of Coin object, since it is of the Measurable type

Solve by casting: ->
Coin maxCoin = (Coin) max;
String name = maxCoin.getName();



Section 2.1
In Java, the number types are primitive types and numbers are not objects. So numbers are not objects, and the number
types have no methods. So, 13.println(); would produce an error.

Supplying an initial valus is OPTIONAL, but it is usually a good idea.

typeName variableName = value; //OK
typeName variableName; // OK



You cannot access a variable until you initialize it with some value. The below is wrong:
int height;
width = height; // ERROR - uninitialized variable height


In Java, every object belongs to a class, the class declares the methods for the objects.
A parameter is an input to a method.
The implicit parameter of a method class is the object on which the method is invoked.
All other parameters are explicit parameters.

The string method replace replaces ALL occurances of the parameter string.

CONSTRUCTORS:
Constructors are not methods. You can only use a constructor with the new operator, NOT to reinitialize an existing object.

OBJECT REFERENCES:
In Java, a variable whose type is a class does not actually hold an object. It merely holds the memory
location of an object. The object itself is stored elsewhere. However, number variables actually store numbers.
The reason why  numbers store the actual value and not the reference, it is because it is more efficient, since
numbers do not require a lot of memory.

COPYING
When you copy a number, a completely new number is created.
But when you copy an object reference both the original and the copy are references to the same object.


GUI (GRAPHICAL APPLICATION AND FRAME WINDOWS)

import javax.swing.JFrame;
import java.awt.Graphics2D;

To show a frame, construct a JFrame object, set its size, and make it visible:
JFrame frame = new JFrame();
frame.setsize(width, height);
frame.setTitle("some string");
frame.setDefaultCloserOperation(JFrame.EXIT_ON_CLOSE); // program terminates when the close button is pressed.
RectangleComponent component = new RectangleComponent();
frame.add(component);
frame. setVisible(True);



In order to display a drawing in a frame, declare a class that extends the JComponent class, as below:

public class RectangleComponent extends JComponent {
  public void paintComponent(Graphics g)
  {
    //drawing instructions
    Graphics2D g2 = (Graphics2D) g'
  }
}

Ellipse -> Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, w, h)
Lines -> Point2D.Double from = new Point2D.Double(x1, y1); -> same for to
String -> DrawString("Message", 50, 100);
Color -> Color magenta = new Color(255, 0, 255)
      -> Color.RED , ...
// When you set a new color in the graphics context, it is used for sunsequent drawing operations(for all )
// Applets are programs that run inside a web browser


INNER CLASSES: are commonly used for utility classes that should not be visible elsewhere in a program.
Inner classes are convenient for insignificant classes.
Also, their methods can access local and instance variables from the surrounding scope.
The compiler turns an inner class into a regular class file.
Methods of an inner class can access local and instance variables from the surrounding scope.
Local variables that are accessed by an inner class METHOD must be declared as FINAL (since we want that to always refer to the same object)




Recall: a block is a statement group enclosed by braces. If a block is nested inside another,
the inner block has access to all variables form the surrounding block.


In Java, you can also have anonymous classes, that do not have a name, it is useful if
an object of a class is constructed only once.


An EVENT LISTENER - descibe the actions to be taken when an event occurs.
An EVENT SOURCE - let all the event listeners to know that an event happened.

The button object is the event source. The listener object is the event listener.


Use JPanel container to group multiple  user interface components together, otherwise they will be located on top of each other
You specify the actions should be taken when a button is clicked through class that implement the ActionListener interface.

class AddInterestListener implements ActionListener {
  public void actionPerformed(ActionEven event)
  {
    // instuctions on what actions should be taken after the button was clicked.
  }
}

A timer generates times events at fixed intervals.
Why does the timer require a listener object? The timer needs to call some method whenever the time interval expires. It calls the
actionPerformed method of the listener object.

A callback == is a mechanism for specifying code that is executed at a later time. The actionlistener methods are callback methods.


ARRAYS

1. The size is set.
An array is a sequence of values of the same type.
double[] values = new double[10];
BankAccount accounts = new BankAccount[10]

// When an array is first created, all elements are initialized with 0 (for int and double), false(boolean), null (String,objects)

length of an array ---> array_name.length

ARRAY LIST
1. Can grow and shrink as needed
2. ArrayList class supplies useful methods, insert, remove...
3. When you construct it, in the beginning it has the size 0
4. add method appends at the end
5. to access a value use arraylist_name.get(index), not [] as for arrays
6. You can insert an object to ArrayList in the middle of the list. The call names.add(3, 'Aika')
moves all elements with index>3 by one position up and adds the object to the index 3.
7. You can remove an object from the middle. The call names.remove(3) removes the object at index 3,
and moves all object with the index> removed element index to the next lower index and reduces the size of the array.
8. get the size ---> names.size()
9. For primitive types such as int and double, ArrayLists work differently"
        ---> you need to use the wrapper class in order to make objects of numbers
        ---> conversion between primitive types and the corresponding wrapper classe is automatic. It is called auto-boxing.
        ---> Double d = 29.5
        ---> ArrayList<double> numbers = new ArrayList<double>();// ERROR, need to use the wrapper class
        ---> ArrayList<Double> numbers = new ArrayList<Double>();

ArrayList<String> friends = new ArrayList<String>();

The ArrayList class is a generic class (type can change)

ENHANCED FOR LOOP
double[] values = {1, 2, 3};
double sum = 0;
for (double element: values)
{
  sum = sum + element
}

double[] values = {1, 2, 3};
double sum = 0;
for (i=0; i<values.length; i++)
{
  double element = values[i];
  sum = sum + element
}


LINKED LIST
1. Allows efficient addition and removal of elements in the middle of the sequence.
2. Visiting all elements of a linked list in a sequential order is efficient, but random access is not.
3. LinkedList is a generic ClASS
4. A list iterator describes a position anywhere inside the linked list
          LinkedList<String> mylist = ...;
          ListIterator<String> iterator = mylist.listIterator();
          iterator.next(); ---> throws NoSuchElementException
          iterator.hasNext();
5. You cannot .remove() twice, since first need to move the pointer by calling .previous()
6. You cannot call .remove() immediately after .add() since need to move the pointer by calling .next()


Questions:
--- Do linked lists take more storage space than arrays of the same size ? Yes, for two reasons. You need to store
the node references, and each node is a separate object. (There is a fixed overhead to store each object in the virtual machine.)


import java.util.NoSuchElementException;

TWO-DIMENSIONAL ARRAYS:

// Syntax, 4 by 4 array  [ROW][COLUMN]
int[][] array = new int[4][4];


RUNNING THREADS (20.1)
1. A thread is a program unit that is executed concurrently with other pats of the program.

How to create a thread:
1. Implement the Runnable interfaces
2. Create a run method within the class
3. Create an object from the class you created---> Runnable r = new MyRunnableClass();
4. Construct a thread object from the runnable object ---> Thread t = new Thread(r);
5. Call the start method on the thread ---> t.start();

The thread scheduler runs ech thread for a short amount of time, called a time slice.
The thread scheduler gives no guarantee about the order in which threads are executed.
So you should expect the order in which each thread runs is somewhat random.


A thread pool creates a number of threads and keeps them alive. (without the thread pool, the operating system would manage
the threads which can be run-time inefficient).  When you add a runnable object to the thread pool, the next idle thread executes its run method.


--- A thread terminates when the run method finishes.
--- But if you would like to terminate a thread forcefully, then need to interrupt the thread. t.interrupt();
--- You can just immediately stop the thread since its dangerous for the reason that this thread may share
objects with other threads and it could crash everything.
--- When the interrupt is called, the run method checks if the interrupt was called, the thread does the necessary cleanups and exits.
--- But if the thread is sleeping, then it cannot execute code that checks for interruptions.
--- When a sleeping thread is interrupted, an InterruptedException is generated.
--- When threads share access to a common object, they can conflict with each other, it is called race condition.


The in and out variables of the System class are public and static variables

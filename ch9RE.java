R9.1
Suppose C is a class that implements the interfaces I and J.
Which of the following assignments require a cast?
C c = new C();
I i = new C();
J j = new C();

// We need casting when converting from interface type to class type.
a. c = i; // require --> c = (C) i;
d. c = j; // require --> c = (C) i;
// Do not  need casting for class -> interface
b. j = c; // no need
// Need casting from one type of interface to another
c. i = j; // i = (I)j;


R9.2
Suppose C is a class that implements the interfaces I and J, and suppose is declared as
  I i = new C();
Which of the following statements will throw an exception?
a. C c = (C) i; // OK
b. J j = (J) i; // OK
c. i = (I) null; //  OK

None will throw an exception

9.3
Suppose the class Sandwich implements the Edible interface, and you are given the variable declarations
Sandwich sub = new Sandwich();
Rectangle cerealBox = new Rectangle(5, 10, 20, 30);
Edible e = null;

Which of the following assignment statements are legal?
a. e = sub; // OK: class --> interface
b. sub = e; // ERROR: we need to cast first--> sub = (Sandwich) e;
c. sub = (Sandwich) e; // OK
d. sub = (Sandwich) cerealBox; // ERROR, because the cerealBox is of a Rectangle type
e. e = cerealBox; // ERROR
f. e = (Edible) cerealBox; // OK, but throws an exception since the cerealBox is the object of Rectangle
type not the Sandwich type and the Rectable class is not implement by Ediable interface.
g. e = (Rectangle) cerealBox; // ERROR
h. e = (Rectangle) null; // ERROR, since Rectangle does not implement Ediable interface

Rules:
-- We can conver from a class type to an interface type, provided the class implements the interaface.
-- When convertng from an interface type to the class type, we need to type cast --> (ClassName) obj


R9.4
 How does a cast such as (BankAccount) x differ from a cast of number values such as (int) x?
The cast operator is used to indicate the acknowledgment or acceptance of a risk
taken by the statement:
- for numbers its used to accept the risk of a loss of precision.
- for objects it indicates the acceptance of the risk of a thrown exception.

 https://www.chegg.com/homework-help/Big-Java-4th-edition-chapter-9-problem-4RE-solution-9780470509487

 --- Conversion from a super class type to a sub class type requires the cast operator, it is a guarantee that o can be a String object type.
 // Object o = null;
 // String s = (String) o
 ---  Conversion from an interface type to a class type requires cast operator.
 // Integer i = new Integer(3);
 // Comparable c = i; // line 1 OK
// i = c; // line 2 ERROR --> fix with --> i = (Integer) c;

R9.6 Suppose r contains a reference to a new Rectangle(5, 10, 20, 30). Which of the following assignments is legal?
(Look inside the API documentation to check which interfaces the Rectangle class implements.)
a. Rectangle a = r; // OK
b. Shape b = r; // OK, Rectangle implements the Shape method.
c. String c = r;  // ERROR
d. ActionListener d = r; //ERROR
e. Measurable e = r; // ERROR
f. Serializable f = r; // OK, Rectangle implements the serializable interface
g. Object g = r; // OK, Object is the parent class of all classes.

R9.8
In Java, a method call such as x.f() uses dynamic method lookup—the exact method
to be called depends on the type of the object to which x refers.
Give two kinds of method calls that do not look dynamic method lookup in Java.

BankAccount a = newBankAccount();
a.getbalance() // no need to do dynamic lookup

-- the FINAL METHOD will not have to be looked up dynamically (since the final methods cannot be overriden anyways)
-- the STATIC METHOD method is not looked up dynamically, since the static method is the same for all class Objects
-- THE PRIVATE METHODs are not inherited by the subclasses, so they are implciltly final, also no need for the dynamic lookup.

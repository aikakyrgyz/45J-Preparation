R3.
Can you convert a superclass reference into a subclass reference? Yes
A subclass reference into a superclass reference? If so, give examples. If not, explain why not. Yes, it is called specialization.
But use the instanceof, to avoid dangerous casting.
BankAccount account = new BankAccount();
SavingsAccount b = (SavingsAccount) account; // Error, since account held the account reference

but the below would not result in error:
Object anObject = new BankAccount();
BankAccount b = (BankAccount) anObject; // should have checked --> if anObject instanceof BankAccount ---> then cast.


5.
Suppose the class Sub extends the class Sandwich. Which of the following assignments are legal?
Sandwich x = new Sandwich();
Sub y = new Sub();


a. x = y; // legal, parent = child (can convert subclass reference into superclass reference)
b. y = x; // illegal, child != parent ( cannot convert superclass refernce into subclass reference)
c. y = new Sandwich(); // illegal, child != parent (cannot convert superclass refernce into subclass reference)
d. x = new Sub(); // legal, parent = child.

6. shallow copy and deep copy?
Clone method must be overriden. The clone object returns the Object type, so you should first cast it to the desired type and then return it.
The clone method is declared protected in the Object class, so that the overriden method is always called.
The object being cloned should implement Cloneable interface, so you must catch the CloneNotSupportedException when ovverrding the clone method.

7.
What access attribute should instance variables have? private
What access attribute should static variables have? public
How about static final variables? public

8.
What access attribute should instance methods have? p
ublic, because we can only use these methods to access the private variables, something must be public.
Does the same hold for static methods? public, since we can access them with the class name.

9.
The static variables System.in and System.out are public.
 Is it possible to overwrite them? If so, how?
 NO! The System class is a final class, so you cannot instantiate an object from them, nor you can override its methods.

10.
Why are public instance variables dangerous?
It breaks the incapsualtion and allows access from the outsiders.

11.
Are public static variables more dangerous than public instance variables?
Public instance variables are more dangerous since with them we can access the state of the object and change it.
The public static variables do not belong to a particular instantiated object, so they are less dangerous.

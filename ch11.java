import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumberer
{
    public static void main(String[] args) throws FileNotFoundException {
    // Prompt for the input and output file names
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();

      // Construct the Scanner and PrintWriter objects for reading and writing
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile); // the Scanner needs the File object
      PrintWriter out = new PrintWriter(outputFileName);
      int lineNumber = 1;


      // Read the input and write the output
      while (in.hasNextLine()) {
        String line = in.nextLine();
        out.println("/* " + lineNumber + " */ " + line);
        lineNumber++;
      }
      in.close();
      out.close();
    }
// the names of the files need two backlashes

//input methods:
in.hasNext()
in.next() // reads a word at a time

in.hasNextLine()
in.nextLine() // read a line of input together with the newline

in.hasNextInt()
in.nextInt() // read number together with the white space


in.hasNextDouble()
in.nextDouble()


in.useDelimiter("") // read char by char


// Throwing an exception

// throw new IllegalArgumentException('Some message')

// There are 2 types of exceptions:
// 1. Checked   ->  compiler checks that you handle these kind of exception
//                   extend the Exception class
//                  IOException
//                  FileNotFoundException


// 2. Unchecked -> extend the RunTimeException class, these errors are usually the programmer's fault
//                  NumberFormatException
//                  IllegalArgumentException
//                  NullPointerException
//                  InputMismatchException


// To declare that a method should be terminated when a checked exception occurs within it,
// tag the method with a throws clause.


// The NullPointerException is not a checked exception, since it is the programmer's responsibility to check if an
// object is pointing to null.
public void read(String filename) throws FileNotFoundException
{
    File inFile = new File(filename);
    Scanner in = new Scanner(inFile);
}

// So, if a method can throw a checked exception then put the throws clause so that the method is terminated.
// Or put a try catch block for that checked exception in the method that might throw it.
// NOTE !!!!!
// Do not use catch and finally in the same try statement, it should be separate, like below
/*
try {}
finally {}

////////////////

try {
  try {}
  finally {}
}
catch {}
*/

// Your own exception:

public class InsufficientFundsException extends IllegalArgumentException
{
  public InsufficientFundsException() {}

  public InsufficientFundsException(String message) {
      super(message);
    }
}


Note this question: Why was the out variable declared outside the try block?
PrintWriter out = new PrinterWriter(filename);
try {
  writeData(out);
}
finally {
  out.close();
}

If it had been declared inside the try block, its scope would only have extended to
the END of the try block, and the finally clause could not have closed it.

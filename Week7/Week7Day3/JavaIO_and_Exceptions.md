## Java I/O and Exceptions

## Java I/O

* I/O = input and output
* How we perform file handling in Java
* Java uses concept of a stream to the make the I/O operation fast
* Contained in the java.io package

## java.io I/O Features

The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, object, localized characters, etc.

## Stream

A stream can be defined as a sequence of data. There are two kinds of Streams:

* InputStream − The InputStream is used to read data from a source.
* OutputStream − The OutputStream is used for writing data to a destination.

## Byte Streams

Java byte streams are used to perform input and output of 8-bit bytes.

The most frequently used classes are:

* FileInputStream
* FileOutputStream

In the next few examples, you'll notice we're using _try_ blocks. We'll go into more detail on these later in the lesson!

## Example

As an example, let's make a program that reads in an input file, and copies the contents to an output file.

```
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
       
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```

## Example

Let's try out our example program.

Make a file named input.txt and write in some some text.

Make sure input.txt is in the same directory as the Java file.

Run the program and watch the contents be copied into an output file!

## Example

If we know we're reading, text we can use FileReader and FileWriter instead of an input stream.

```
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
       
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```

## Example

If we know we're reading, text we can use FileReader and FileWriter instead of an input stream.

```
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
       
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```

## Standard Streams

* Standard Input
  * Used to feed the data to user's program
  * Usually a keyboard is used as standard input stream and represented as System.in.
* Standard Output
  * Used to output the data produced by the user's program
  * Usually a computer screen is used for standard output stream and represented as System.out.
* Standard Error
  * Used to output the error data produced by the user's program
  * Usually a computer screen is used for standard error stream and represented as System.err.

## Standard Streams Example

```
Live Demo
import java.io.*;
public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}
```

## Reading and Writing Files

As described earlier, a stream can be defined as a sequence of data. The InputStream is used to read data from a source and the OutputStream is used for writing data to a destination.

## File Input Stream

This stream is used for reading data from the files. Objects can be created using the keyword new and there are several types of constructors available.

The following constructor takes a file name as a string to create an input stream object to read the file:

This one a file object to create an input stream object to read the file. First we create a file object using File() method:

```
InputStream f = new FileInputStream("filepath");
```

```
File f = new File("filepath");
InputStream f = new FileInputStream(f);
```

## File Input Stream

Once you have an InputStream object in hand, you can use some helper methods to interact with it.

**public void close() throws IOException{}**

This method closes the file output stream. Releases any system resources associated with the file.

**protected void finalize()throws IOException {}**

This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream.

## File Input Stream

**public int read(int r)throws IOException{}**

This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data or -1 if it's the end of the file.

**public int read(byte\[\] r) throws IOException{}**

This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.

**public int available() throws IOException{}**

Gives the number of bytes that can be read from this file input stream. Returns an int.

## FileOutputStream

FileOutputStream is used to create a file and write data into it. The stream would create a file, if it doesn't already exist, before opening it for output.

The following constructor takes a file name as a string to create an input stream object to write the file:

This constructor takes a file object to create an output stream object to write the file.

```
OutputStream f = new FileOutputStream("filepath") 
```

```
File f = new File("C:/java/hello");
OutputStream f = new FileOutputStream(f);
```

## FileOutputStream

Once you have OutputStream object in hand, there are helper methods which can be used to write to stream or to do other operations on the stream.

**public void close() throws IOException{}**

This method closes the file output stream. Releases any system resources associated with the file.

**protected void finalize()throws IOException {}**

This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream.

## FileOutputStream

**public void write(int w)throws IOException{}**

This methods writes the specified byte to the output stream.

**public void write(byte\[\] w)**

Writes w.length bytes from the mentioned byte array to the OutputStream.

## Buffered Streams

Most of the examples we've seen so far use unbuffered I/O. This means each read or write request is handled directly by the underlying OS.

This can make a program much less efficient, since each such request often triggers disk access, network activity, or some other operation that is relatively expensive.

## Buffered Streams

To reduce this kind of overhead, the Java platform implements buffered I/O streams. Buffered input streams read data from a memory area known as a buffer; the native input API is called only when the buffer is empty.

Similarly, buffered output streams write data to a buffer, and the native output API is called only when the buffer is full.

## Buffered Streams

There are four buffered stream classes used to wrap unbuffered streams:

BufferedInputStream and BufferedOutputStream create buffered byte streams.

BufferedReader and BufferedWriter create buffered character streams.

## Exceptions

You may have noticed in some of the earlier examples, some of the methods threw exceptions.

Let's learn about what they are!

## Exceptions

Exception = an abnormal condition

Exception Handling allows us to handle runtime errors so that normal flow of our applications continues

Example: The third statement in your program throws an error. Without exception handling, everything after that statement would not run. Exception handling allows the subsequent code to continue to run.

## Exceptions vs. Errors

An **Exception** is an abnormal event that happens during the execution of a program that disrupts the normal or expected flow of the program. **Exceptions are NOT Errors**.

**Errors:** Errors in Java are defined as “any departure from the expected behavior of the system or program, which stops the working of the system”. Errors are thrown by the JVM (Java Virtual Machine) and are problems that arise beyond the control of the user or the programmer.

**Exceptions:** Exceptions are defined as “any error or problem which one can handle and continue to work normally”. These are thrown by the application and can be corrected and handled at the time of execution of the program.

## Exceptions

Some exceptions are caused by user errors, while others by programmer error. There are various exception methods that handle different types of exceptions built into the Java standard library. There are two types of exceptions:

**checked** and **runtime(unchecked)**

Checked exceptions occur at the time the program is compiled, while runtime or unchecked exceptions occur during the execution of the program.

## Checked vs. Unchecked

**Unchecked Exceptions**

* Compiler does not enforce that you handle them explicitly.
* Methods do not have to declare that they throw them (in the method signatures).
* It is assumed that the application cannot do anything to recover from these exceptions (at runtime).
* All other Exceptions are _checked_ — that is, the compiler enforces that you handle them explicitly.

**Checked Exceptions**

* Compiler enforces them to be handled explicitly
* Checked exceptions are subject to the Catch or Specify Requirement - means that code that might throw certain exceptions must be addressed programmatically by enclosing either of the following in the method that throws the exception: A **try** statement that **catches** the exception.

## Built-in Exceptions

Java defines several exception classes inside the standard java.lang package. The most general of these exceptions are subclasses of the standard type RuntimeException. Since java.lang is implicitly imported into all Java programs, most exceptions derived from RuntimeException are automatically available.

Object

java.lang

Throwable

Errors

Exceptions

Runtime Exceptions

Other Exceptions

## Built-in Exceptions

You can find a great resource for seeing all Java checked and unchecked built-in exceptions [here](https://www.tutorialspoint.com/java/java_builtin_exceptions.htm). Here are a few common ones:

**Checked**

* **ClassNotFoundException**: Class not found.
* **NoSuchFieldException**: A requested field does not exist.
* **NoSuchMethodException**: A requested method does not exist.

**Unchecked**

* **ArithmeticException**: Arithmetic error, such as divide-by-zero.
* **ArrayIndexOutOfBoundsException**: Array index is out-of-bounds.
* **ArrayStoreException**: Assignment to an array element of an incompatible type.

## Exceptions

* There are two main ideas on how to handle exceptions:

  * LBYL = **L**ook **B**efore **Y**ou **L**eap
  * EAFP = **E**asier to **A**sk **F**orgiveness than **P**ermission
* In Java, its more common to look before you leap

  * ex: when you check to see if an object is null before you use it
* Example of EAFP

  * Write and execute your code, then do something about it if something goes wrong

## Handling Exceptions

A method catches an exception using a combination of the try and catch keywords. A try/catch block is placed around the code that might generate an exception. There is an optional finally block that can be added. The code in this block is always executed.

```
try {
   // Code that might throw an exception
} catch (ExceptionName e1) {
   // Catch block
}
```

Exception handling is done is several ways. One way is to use a **try/catch** block:

```
package com.tts
public class Main {
  public static void main(String[] args) {
    int x = 100;
    int y = 0;
    System.out.println(divide(x, y));
  }

  private static int divide(int x, int y) {
    return x / y;
  } 
  // Throws an ArithmeticException because
  // you can't divide any number by zero
}
```

## Exceptions

```
package com.tts
public class Main {
  public static void main(String[] args) {
    int x = 100;
    int y = 0;
    System.out.println(divideLBYL(x, y));
    System.out.println(divideEAFP(x, y));
  }

  private static int divideLBYL(int x, int y) {
    if(y != 0) {
      return x / y;
    } else {
      return 0;
    }
  }

  private static int divideEAFP(int x, int y) {
    try {
      return x / y;
    } catch(ArithmaticException e) {
      return 0;
    }
  }
}
```

## Exceptions

In the first method, **divideLBYL**, we first test to see if y is equal to zero (since you cannot mathematically divide any number by zero) than perform the arithmetic.

In the second method, **divideEAFP**, we perform the arithmetic then catches the exception if one comes up.

Which one is better?

They're both great, each has their own pros and cons.

## Exceptions

```
package com.tts
public class Main {
  public static void main(String[] args) {
    int x = getInt();
    System.out.println("x is " + x);
  }

  public static int getInt() {
    Scanner s = new Scanner(System.in);
    return s.nextInt();
  }
}
```

If you run this and input a number like 123, it runs fine. However, if you type in a word like Hello, you'll get an **InputMismatchException**.

## Exceptions

```
package com.tts
public class Main {
  public static void main(String[] args) {
    int x = getIntLBYL();
    System.out.println("x is " + x);
  }

  public static int getIntLBYL() {
    Scanner s = new Scanner(System.in);
    boolean isValid = true;
    System.out.println("Please enter a number.");
    String input = s.next();
    for(int i=0, i<input.length(); i++) {
      if(!Character.isDigit(input.charAt(i))) {
        isValid = false;
        break;
      }
    }
    if(isValid) {
      return Integer.parseInt(input);
    }
    return 0;
  }
}
```

## Exceptions

In this new program using the LBYL method, we're going through each actual character input by the user and confirming that its a real numerical digit. If it isn't, we're setting our isValid variable to false and simply returning 0.

Did you remember how that for loop worked?
Make sure you know what .length() and i++ do!

## Exceptions

```
package com.tts
public class Main {
  public static void main(String[] args) {
    int x = getIntEAFP
    System.out.println("x is " + x);
  }

  public static int getIntEAFP() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number.");
    try {
      return s.nextInt();
    } catch(InputMismatchException e) {
      return 0;
    }
  }
}
```

Wow, that's a lot less code!

Each method will be the best solution in different situations.

## Exceptions

## What is an Exception?

From Java Documentation:

An exception is an event that occurs during the execution of a program the disrupts the normal flow of a program's functions.

* Exception and RuntimeException

  * Classes that are defined in java.lang
  * Different types of exceptions are subclasses of these two classes

    * Ex: **InputMismatchException** from earlier.
* "Throwing an exception"

  * when we pass the exception back to the calling method

Lets create a new Java class and take a look.

## What is an Exception?

```
package com.tts;
import java.util.Scanner;

public class ExceptionExample {
  public static void main(String[] args) {
    int result = divide();
    System.out.println(result);
  }
  
  private static int divide() {
    int x = getInt();
    int y = getInt();
    System.out.println("x is " + x + ", y is " + y);
    return x / y;
  }
  
  private static int getInt() {
    Scanner s = new Svanner(System.in);
    System.out.println("Please enter a number ");
    return s.next(Int);
  }
}
```

## Exception Example

There are two possible exceptions in our program.

**ArithemeticException** if the user tries to divide by 0

**InputMismatchException** if the user inputs something besides an integer

When Java prints out an error message, it displays a **stack trace**, showing the **call stack**.

The call stack is a list of all of the method calls at that point in the execution of the program.

The call stack for our InputMismatchException probably looks like this:

```
Exception in thread "main" java.util.InputMismatchException
  at java.util.Scanner.throwFor(Scanner.java:836)
  at java.util.Scanner.next(Scanner.java:1485)
  at java.util.Scanner.nextInt(Scanner.java:2117)
  at java.util.Scanner.nextInt(Scanner.java:2076)
  at com.tts.ExceptionExample.getInt(ExceptionExample.java:21)
  at com.tts.ExceptionExample.divide(ExceptionExample.java:11)
  at com.tts.ExceptionExample.main(ExceptionExample.java:7)
```

```
Exception in thread "main" java.util.InputMismatchException
  at java.util.Scanner.throwFor(Scanner.java:836)
  at java.util.Scanner.next(Scanner.java:1485)
  at java.util.Scanner.nextInt(Scanner.java:2117)
  at java.util.Scanner.nextInt(Scanner.java:2076)
  at com.tts.ExceptionExample.getInt(ExceptionExample.java:21)
  at com.tts.ExceptionExample.divide(ExceptionExample.java:11)
  at com.tts.ExceptionExample.main(ExceptionExample.java:7)
```

The best way to read call stacks is by starting at the bottom - that's usually where the code that we wrote is.

If you're using an IDE that links to each line of code, you can actually explore the guts of the Scanner.java class and trace the methods back through the provided object.

### Catching an Exception

```
...

private static int getInt() {
  Scanner s = new Scanner(System.in);
  System.out.println("Please enter a number");
  while(true) {
    try {
      return s.nextInt();
    } catch(InputMismatchException e) {
      s.nextLine(); // read past end of line, move to next line
      System.out.println("Error - please enter a number");
    }
  }
}

...
```

### Catching an Exception

That seems to keep our program from trying to divide using letters instead of numbers, but the exception we're catching is really limited.

Run your program and instead of typing an integer or letter, put in Cmd+D/Ctrl+D.

You should get a different exception called NoSuchElementException.

## "try and catch" Exceptions

```
mport java.io.Console;
import java.util.*;

public class ArrayAccess {

   public static void main(String args[]) {
      try {
         String[] fruit = new String[2];
         fruit[0] = "apple";
         fruit[1] = "grapes";
         System.out.println("Access element three :" + fruit[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      } finally {
      System.out.println("Finally, out of the block");
    }
  }
}
```

```
$ java ArrayAccess
Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
Finally, out of the block
```

We've declared an array with only 2 elements. The code tries to access the 3rd element of the array which throws the exception in our **catch** block.

## "throw"-ing Exceptions

Before you can catch an exception, code from somewhere must throw one. You can **"throw"** an exception, either a newly instantiated one or an exception that you just caught, by using the **"throw"** keyword.

**"throw"** is used to invoke an exception explicitly.

```
 public ThrowExample {
     if (conditional statement){
         throw new IllegalArgumentException(custom message);
     }
 }

   
```

Any code can throw an exception - your code or Java packaged code.

## Creating Custom Exceptions

When creating custom exceptions, all exceptions must be a child of the **Throwable** class.

```
class MyException extends Exception {

}
```

* To write a checked exception, extend the Exception class.
* To write an unchecked/runtime exception, extend the RuntimeException class.

## Creating Custom Exceptions

```
public class SayProperGreetingException extends Exception {
    String greeting;
   
   public SayProperGreetingException(String greeting) {
      this.greeting = greeting;
      System.out.println(greeting + " is not an appropiate greeting.");
   }
   
   public String sayHello() {
      return greeting;
   }
}   
```

This exception is thrown when the wrong greeting is given

We create the exception and then create a new program to call it and put it to use.

## Creating Custom Exceptions

```
public class GreetNeighbor {
   
   public GreetNeighbor() {
    
   }
   
   public static void sayHelloNeighbor(String greeting) throws SayProperGreetingException {
      if (greeting.equals("Hello")) {
      	System.out.println(greeting + " neighbor!  Welcome!");
      } else {
   	 throw new SayProperGreetingException(greeting);
      } 
   }

   public static void main(String[] args) throws SayProperGreetingException {
       GreetNeighbor welcome = new GreetNeighbor();
       sayHelloNeighbor("Goodbye");
   }
}   
```

In our new program, we call the "throw" keyword to declare our exception within the methods we want to use it.

## Throw vs Throws

Throws is used to declare an exception, which means it works similar to the try-catch block.

On the other hand, the throw keyword is used to throw an exception explicitly.

## Throws Example

```
public class ThrowThrows { 
public static void main(String[] args) 
{ 
// unchecked Exception 
try { 
	// double x=12/0; 
	throw new ArithmeticException(); 
} 
catch (ArithmeticException e) 
{ 
	e.printStackTrace(); 
} 
} 
} 
```

```
import java.io.IOException; 

public class UseOfThrowAndThrows { 

	public static void main(String[] args) 
		throws IOException 
	{ 
	} 
} 
```

#### Java Exceptions, I/O, Interfaces

By Tech Talent South

Private

[](/techtalentsouth/java-exceptions-io-interfaces/fullscreen)

# Java Exceptions, I/O, Interfaces

### [Tech Talent South](/techtalentsouth)

Tech Talent South (TTS) is an approachable and inclusive technical education company which exists to build and connect local tech and entrepreneurial ecosystems. We offer experiences for individuals, corporations, and talent pipeline partners.

* [techtalentsouth](https://twitter.com/techtalentsouth)

[Help](https://help.slides.com) • [Terms](https://techtalentsouth.slides.com/terms?root=true) • [Privacy](https://techtalentsouth.slides.com/privacy?root=true) • © 2022 Slides, Inc.

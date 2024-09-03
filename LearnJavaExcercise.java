//EXERCISE

//Print a stringpublic class LearnJava {
public static void main(String[] args) {
    System.out.println("Hello World");
}


//This is a single comment

/*This 
is
a
multi-line 
comment*/

// == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES == JAVA VARIABLES
    String carName = "Toyota";
    int maxSpeed = 100;
    int x = 5;
    int y = 10;
    int z = x + y;
    System.out.println(x + y);
    System.out.println(z);
    int x = 5, y = 10, z = x + y;
    System.out.println(x + y + z);

// == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES == JAVA DATA TYPES
//A. This are the Java Data Types
//This is all called primitive data types//
    int MyNum = 10;
    float MyFloatNum = 10.23f;
    char MyLetter = 'A';
    boolean MyBooleanNum = false;
    String MyText = "Hello World";

//B. Type Casting - converts the following double type to an int type
    double MyDouble = 9.65f;
    int MyInt = (int) MyDouble;

//  == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS == JAVA OPERATORS
//A. This are examples of Java Operators
    System.out.println(10 + 5); This will add
    System.out.println(10 * 5); This will mulitply
    System.out.println(10 / 5); This will divide
    System.out.println(10 - 5); This will minus

//B. This increases the value of the variable x by 1
    int x = 10;
    ++x;

//C. This "Addition Assignment", it adds the value of 5 to variable X
    int x = 10;
    x += 5;

// == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS == JAVA STRINGS
    String greeting = "Hello World";

//B. prints the length of the txt string
    String txt = "Hello";
    System.out.println(txt.length());

//C. Converts the value of txt to UpperCase
    String txt = "hello";
    System.out.println(txt.toUpperCase());

//D. This concatenate two strings
    String FirstName = "Val ";
    String LastName = "Jayson";
    System.out.println(FirstName + LastName);
    //or//
    System.out.println(FirstName.concat(LastName));

//E. Return the index(position) of the first occurence of "e" in the following string
    String indexPosition = "Hello Wolrd!";
    System.out.println(indexPosition.indexOf('e'));

// == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH == JAVA MATH
//A. This is a method to find the highest value of x and y    
    int x = 5;
    int y = 10;
    Math.max(x, y);

//B. This is the method to find the square root of x
    int x = 81;
    Mat.sqrt(x);

//C. the correct method to return a random number between 0 (inclusive), and 1 (exclusive).
    Math.random();

// JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS == JAVA BOOLEANS ==
//A. print values true and false
    boolean isJavaFun = true;
    boolean isJavaNotFun = false;
    System.out.println(isJavaFun);
    System.out.println(isJavaNotFun);

//B. print the value true:
    int x = 5, y = 4;
    System.out.println(x > y);

// == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE == JAVA IF ELSE
//A. print if x is greater than y
    int x = 50, y = 10;
    if (x > y) {
        System.out.println("x is greater than y");
    }

//B. print if x is equal to y
    int x = 50, y =50;
    if (x == y) {
        System.out.println("x is equal to y");
    }

//C. print if x is equal to y otherwise print x is not equal to y
    int x = 50, y =50;
    if (x == y) {
        System.out.println("x is equal to y");
    } else {
        System.out.println("x is not equal to y");
    }

//D. print if x is equal to y otherwise print x is greater then y, other wise, print x is lesser than y\
    int x = 50, y =50;
    if (x == y) {
        System.out.println("x is equal to y");
    } else if (x > y) {
        System.out.println("x is greater then y");
    } else {
        System.out.println("x is lesser than y");
    }

//E. This is a "short hand if...else statement" (ternary operator:)
    int time 20;
    String result = (time < 18) ? "Goodmorning." : "Goodevening.";
    System.out.println(result);

// == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE == JAVA SWITCH CASE ==
//A. print the day of the week based on the given number
    int day = 2;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day number");
    }

// == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS == JAVA LOOPS
//A. print i as long as i is less than 6
    int i = 1;
    while (i < 6) {
        System.out.println(i);
        i++;
    }
//B. do/while loop to print i as long as i is less than 6.
    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i < 6);
    
//C. Use a for loop to print "Yes" 5 times: 
    for (i = 0; i < 5; i++) {
        System.out.println("Yes");
    }

//D. Loop through the items in the cars array.
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
        System.out.println(i);
    }

//E. Stop the loop if i is 5.
    for (int i = 0 ; i < 10; i++) {
        if (i ==5) {
            break;
        }
        System.out.println(i);
    }
//F. In the loop, when the value is "4", jump directly to the next value.
    for (int i = 0 ; i < 10; i++) {
        if (i == 4) {
            continue;
        } System.out.prinln(i);
    }
 

// == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS == JAVA ARRAYS
//A. This is an array of strings
    String[] names = {"Val", "Jayson", "John", "Mary", "Tom"};
    for (String name : names) {
        System.out.println(name);
    }

//B. Create an array string called cats
    String[] cats = {"Whiskers", "Muffy", "Socks", "Daisy"};

//C. Print the third element of the cats array
    System.out.println(cats[2]);

//D. Change the value from "Volvo" to "Opel", in the cars array.
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars[0] = "Opel";
    System.out.priln(Cars(0));

//E. Find out how many elements the cars array have.
    String[] cars = {"Volvo", "BMW", "Ford"};
    System.out.println(
    cars.length
    );

// F. Loop through the items in the cars array.
    String[] cars = {"Volvo", "BMW", "Ford"};
        (String i : ) {
        System.out.println(i);
    }

//G. a two-dimensional array.
    int[][] numbers = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };


// == JAVA METHODS == JAVA METHODS == JAVA METHODS == JAVA METHODS == JAVA METHODS == JAVA METHODS == JAVA METHODS == JAVA METHODS
//A. Insert the missing part  to call myMethod from main
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args) {
        
    myMethod()
    ;
    }

//B .Insert the missing part to call myMethod from main two times.
    static void myMethod() {
        System.out.println("I just got executed!");       
    }
    public static void main(String[] args) {
        myMethod();
        myMethod();
    }

//C. Add a "fname" parameter of type String to myMethod, and output "John Doe".
    static void myMethod(String fname) {
        System.out.println(fname + " Doe");
    }
    public static void main(String[] args) {
        myMethod("John");
    }

//D. Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod: "RETURN"
    static int myMethod(int x) {
        return 5 + x;
    }
    public static void main(String[] args) {
      System.out.println(myMethod(3));
    }

//E. Follow the comments to insert the missing parts of the code below:
// Create a checkAge() method with an integer variable called age
    static void checkAge
        (int age) {
        // If age is less than 18, print "Access denied"
        if ( age < 18 ) {
            System.out.println("Access denied"); 
        // If age is greater than, or equal to, 18, print "Access granted"
        } else {
            System.out.println("Access granted"); 
        }
    } 
    public static void main(String[] args) { 
        // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }

// == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS == JAVA CLASS/OBJECTS
//A. Create a class called LearnJavaExcercise.
    public class LearnJavaExcercise

//B. Create an object of MyClass called myObj.
    MyClass myObj = new MyClass();

//C. Use myObj to access and print the value of the x attribute of MyClass. "myObj.x"
    public class MyClass {
        int x = 5;
        public static void main(String[] args) {
            MyClass myObj = new MyClass();
            System.out.println(myObj.x);
        }
    }
//D. Call myMethod on the object.
    public class MyClass {
        public void myMethod() {
            System.out.println("Hello World");
        }
        public static void main(String[] args) {
            MyClass myObj = new MyClass();
            myObj.myMethod();
        }
    }

//E. Create and call a class constructor of MyClass AND Follow the comments to insert the missing parts of the code below:
    // Create a MyClass class
    public class MyClass { 
        int x;  // Create a class attribute x public
    // Create a class constructor for the MyClass class
        public MyClass () {
            x = 5;  // Set the initial value for the class attribute x to 5
        }
        public static void main(String[] args) {
            // Create an myObj object of class MyClass (This will call the constructor)
            MyClass myObj = new MyClass();  
            // Print the value of x
            System.out.println(myObj.x);
        }
    }

//F. The class below should not be inherited by other classes. Add the correct modifier:
    final class MyClass

//G. Fill in the missing parts to import the java.util.Scanner class from the Java API:
    import java.util.Scanner;

//H. The Car class should inherit the attributes and methods from the Vehicle class. Add the correct keyword to make this possible. "extends"
    class Car extends Vehicle

// == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS == JAVA EXCEPTIONS
//A. Insert the missing parts to handle the error in the code below.
    try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
    } catch (Exception e) {
        System.out.println("Something went wrong.");
    }

//B. Insert the missing keyword to execute code, after try..catch, regardless of the result.
try {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]);
  } catch (Exception e) {
    System.out.println("Something went wrong.");
  } finally {
    System.out.println("The 'try catch' is finished.");
  }
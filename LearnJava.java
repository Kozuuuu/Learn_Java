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
//C.
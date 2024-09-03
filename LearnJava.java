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
    Boolean MyBooleanNum = false;
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



// 1. Basic Syntax == Basic Syntax == Basic Syntax == Basic Syntax == Basic Syntax == Basic Syntax == Basic Syntax == Basic Syntax == 
// Structure: Java programs start with a class definition, and every Java application must have a main method.
// Example:
    public class LearnJava {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
}
// Semicolons: End each statement with a semicolon (;).
// Case Sensitivity: Java is case-sensitive (HelloWorld is different from helloworld).

// 2. Data Types == Data Types == Data Types == Data Types == Data Types == Data Types == Data Types == Data Types == Data Types ==
// Primitive Types:
    // int (4 bytes): Integer type (e.g., int age = 25;)
    // float (4 bytes): Floating-point type (e.g., float price = 19.99f;)
    // double (8 bytes): Double precision floating-point (e.g., double pi = 3.14159;)
    // char (2 bytes): Single character (e.g., char initial = 'A';)
    // boolean (1 bit): True/false (e.g., boolean isJavaFun = true;)
    // byte (1 byte), short (2 bytes), long (8 bytes)
// Non-Primitive Types:
    // Strings, arrays, classes, etc.

//3. Variables ==Variables == Variables == Variables == Variables == Variables == Variables == Variables ==
// Declaration: Define variables with a data type and a name.
    int x = 10;
    String name = "Java";
//Scope: Variables have block scope. They’re accessible within the block they’re declared.

//4. Conditionals == Conditionals == Conditionals == Conditionals == Conditionals == Conditionals == Conditionals == Conditionals ==
//A. If-Else Statement:
    // java
    // Copy code
    // if (x > 0) {
    //     System.out.println("Positive");
    // } else {
    //     System.out.println("Negative or Zero");
    // }

//B. Switch Statement:
    int day = 3;
    switch(day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Other Day");
    }
    
//5. Functions (Methods) == Functions (Methods) == Functions (Methods) == Functions (Methods) == Functions (Methods) == Functions (Methods) == Functions (Methods) ==
//A. Defining a Method:
    public int add(int a, int b) {
        return a + b;
    }
//B. Calling a Method:
    int result = add(5, 3);

    //c.Main Method: Entry point for Java applications.
    public static void main(String[] args) {
        // code here
    }

//6. Working with Date/Time == Working with Date/Time == Working with Date/Time == Working with Date/Time == Working with Date/Time == Working with Date/Time ==
//A. Using java.time Package:
    import java.time.LocalDate;
    import java.time.LocalTime;
    import java.time.LocalDateTime;

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

//B. Formatting Dates: 
    import java.time.format.DateTimeFormatter;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = date.format(formatter);

// 7. Loops == Loops == Loops == Loops == Loops == Loops == Loops == Loops == Loops == Loops == Loops == Loops
//A. For Loop:
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

//B. While Loop == While Loop == While Loop == While Loop == While Loop == While Loop == While Loop == While Loop == While Loop == While Loop ==
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

//C. Do-While Loop:
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
    
// 8. Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling == Exception Handling ==
//A. Try-Catch Block:
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    } finally {
        System.out.println("This will always run");
    }

//B. Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions == Throwing Exceptions ==
    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
    }

//9. Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures == Data Structures ==
//A. Arrays:
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(numbers[0]);  // Access element
    
//B. ArrayList:
    import java.util.ArrayList;
    
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    System.out.println(list.get(0));
    
//10. OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts == OOP Concepts ==
//A. Classes and Objects:
    class Car {
        String model;
        int year;
    
        void startEngine() {
            System.out.println("Engine started");
        }
    }
    
    Car myCar = new Car();
    myCar.model = "Toyota";
    myCar.startEngine();
    
//B. Inheritance:
    class Vehicle {
        void honk() {
            System.out.println("Honk!");
        }
    }
    
    class Car extends Vehicle {
        // Car inherits honk() method
    }
    
//C. Polymorphism:
    Vehicle myVehicle = new Car();  // A Car is a Vehicle
    myVehicle.honk();  // Calls Car's implementation of honk()
    
//11. Interfaces == Interfaces == Interfaces == Interfaces == Interfaces == Interfaces == Interfaces == Interfaces == Interfaces == Interfaces ==
//Defining an Interface:
    
    interface Animal {
        void sound();
    }
    
    class Dog implements Animal {
        public void sound() {
            System.out.println("Woof");
        }
    }

//12. Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes == Classes ==
//A. Encapsulation: Use private variables and public getters/setters.
    class Person {
        private String name;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    }

//B. Abstract Classes:
    abstract class Animal {
        abstract void makeSound();
    }
    
    class Dog extends Animal {
        void makeSound() {
            System.out.println("Bark");
        }
    }

//13. Packages == Packages == Packages == Packages == Packages == Packages == Packages == Packages == Packages == Packages == Packages == Packages ==
//A. Organize Classes: Group related classes using packages.
    package com.example.myapp;
    
    public class MyClass {
        // class code
    }
//B. Importing Packages:
    import java.util.Scanner;
    
//14. Working with Files
//A. Reading Files:
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;
    
    File file = new File("filename.txt");
    Scanner reader = new Scanner(file);
    while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
    }
    reader.close();
    
//B. Writing Files:
    import java.io.FileWriter;
    import java.io.IOException;
    
    FileWriter writer = new FileWriter("filename.txt");
    writer.write("Hello, World!");
    writer.close();
    
// 15. Working with APIs == Working with APIs == Working with APIs == Working with APIs == Working with APIs == Working with APIs == Working with APIs ==
//HTTP Requests: Use libraries like HttpURLConnection or HttpClient.
    import java.net.HttpURLConnection;
    import java.net.URL;
    
    URL url = new URL("https://api.example.com/data");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    
    int responseCode = conn.getResponseCode();
    System.out.println("Response Code: " + responseCode);
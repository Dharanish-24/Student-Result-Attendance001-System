# Java Learning Journey 

# Overview

This repository documents my Java learning journey and practical understanding of fundamental Java concepts.

The topics covered include:

1. Java Environment and Program Flow
2. Data Types and Memory Basics
3. Variables, Scope, and Control Flow

# 1. Java Environment and Program Flow

## Objective

Understand how Java programs are written, compiled, and executed.

## Java Architecture

```text
Source Code (.java)
        ↓
     javac
   Compiler
        ↓
Bytecode (.class)
        ↓
       JVM
        ↓
     Output
```

## Components

### JDK (Java Development Kit)

* Used to develop Java applications
* Contains JRE, JVM, compiler, and tools

### JRE (Java Runtime Environment)

* Used to run Java applications
* Contains JVM and Java libraries

### JVM (Java Virtual Machine)

* Executes Java bytecode
* Enables platform independence

## Program Execution Flow

```text
Hello.java
     ↓
javac Hello.java
     ↓
Hello.class
     ↓
java Hello
     ↓
Output
```

## Key Learning

* Java source files use `.java`
* Compilation creates `.class` files
* JVM executes bytecode
* Java follows "Write Once, Run Anywhere"


# 2. Data Types and Memory Basics

## Objective

Understand how data is stored and represented in Java.

## Primitive Data Types

| Type    | Example                     |
| ------- | --------------------------- |
| byte    | byte age = 22;              |
| short   | short year = 2026;          |
| int     | int marks = 95;             |
| long    | long population = 1000000L; |
| float   | float price = 99.5f;        |
| double  | double salary = 50000.50;   |
| char    | char grade = 'A';           |
| boolean | boolean passed = true;      |

### Example

```java
int age = 22;
double weight = 89.95;
char gender = 'M';
boolean status = true;
```

## Reference Data Types

Examples:

```java
String name = "Dharanish";
int[] marks = {90, 85, 95};
```

Reference types store references to objects.

## Memory Basics

### Stack Memory

Stores:

* Local variables
* Method execution

Example:

```java
int age = 22;
```

### Heap Memory

Stores:

* Objects
* Arrays
* Strings

Example:

```java
String name = "Dharanish";
```

## Variable Initialization

### Declaration

```java
int age;
```

### Initialization

```java
int age = 22;
```

## Default Values

| Data Type       | Default Value |
| --------------- | ------------- |
| int             | 0             |
| double          | 0.0           |
| boolean         | false         |
| char            | '\u0000'      |
| Reference Types | null          |

## Key Learning

* Primitive types store actual values
* Reference types point to objects
* Variables must be initialized before use
* Memory is managed by JVM


# 3. Variables, Scope, and Control Flow

## Objective

Learn how Java stores data and controls program execution.

## Types of Variables

### Local Variable

Declared inside methods.

```java
public static void main(String[] args) {
    int age = 22;
}
```

### Instance Variable

Belongs to an object.

```java
class Student {
    String name;
}
```

### Static Variable

Belongs to the class.

```java
class Student {
    static String college = "Sri Sairam Engineering College";
}
```

### Final Variable

Cannot be reassigned.

```java
final int MAX_AGE = 100;
```

## Scope

A variable can only be accessed within its valid region.

Example:

```java
public static void main(String[] args) {
    int age = 22;
    System.out.println(age);
}
```

The variable `age` cannot be used outside the `main()` method.

## Conditional Statements

### if

```java
if(age >= 18){
    System.out.println("Adult");
}
```

### if-else

```java
if(age >= 18){
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}
```

### else-if Ladder

```java
if(marks >= 90){
    System.out.println("A");
}
else if(marks >= 80){
    System.out.println("B");
}
else{
    System.out.println("C");
}
```

## Switch Statement

```java
switch(day){
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

## Loops

### for Loop

```java
for(int i=1; i<=5; i++){
    System.out.println(i);
}
```

### while Loop

```java
int i=1;

while(i<=5){
    System.out.println(i);
    i++;
}
```

### do-while Loop

```java
int i=1;

do{
    System.out.println(i);
    i++;
}
while(i<=5);
```


## Break Statement

Terminates a loop immediately.

```java
for(int i=1; i<=10; i++){

    if(i==5){
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```



## Continue Statement

Skips the current iteration.

```java
for(int i=1; i<=5; i++){

    if(i==3){
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```



# Mini Project Developed

## Student Result & Attendance System

### Features

* Student information management
* Subject mark entry
* Total and average calculation
* Grade generation
* Attendance validation
* Pass/Fail determination

### Concepts Applied

* Variables
* Data Types
* Operators
* Scanner Input
* Conditional Statements
* Program Flow

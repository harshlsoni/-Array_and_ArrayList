# Java Array Operations Project

This project demonstrates several Java programming tasks by separating code into multiple files. The project includes functionalities to:

1. **Separate Even and Odd Numbers:**  
   Accepts user input, divides the numbers into even and odd arrays, and prints the results.

2. **Find Neighboring Numbers with the Smallest Distance:**  
   Finds two adjacent numbers in an array with the smallest absolute difference and returns the index of the first number.

3. **Convert Between Arrays and ArrayLists:**  
   Demonstrates converting an array into an `ArrayList` and vice versa.

## Project Structure

- **UserInput.java**  
  Contains the class that handles user input using the `Scanner` class.

- **ArrayOperations.java**  
  Contains static methods for:
  - Separating even and odd numbers.
  - Finding neighboring numbers with the smallest difference.
  - Converting an array to an `ArrayList` and an `ArrayList` back to an array.

- **Main.java**  
  The main entry point of the program that utilizes the classes above to perform the tasks.

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or later).
- Basic knowledge of compiling and running Java programs using the command line.

## How to Compile and Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/harshlsoni/-Array_and_ArrayList.git
   cd your-repo

2. **Compile the Java Files**
   ```bash
   javac UserInput.java ArrayOperations.java Main.java
   
3. **Run the Program**
   ```bash
   java Main

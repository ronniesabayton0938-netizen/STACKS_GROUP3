 2D Stack Visualizer

 Group 3

 Members
- Ronnie Sabayton
- Jhon Christmart Fernandez
- Andrew Lee Lanchita
- Renz Torcuator
- Canete Justin

 1. Project Title

2D Stack Visualizer

 2. Short Description

The 2D Stack Visualizer is a Java GUI program that demonstrates how a stack works using the LIFO (Last In, First Out) principle. It allows users to add, remove, view, clear, check, and randomly generate stack elements through a graphical interface.

 3. Features

- PUSH an integer value into the stack
- POP the top element from the stack
- PEEK at the top element without removing it
- CLEAR all elements from the stack
- CHECK STACK to determine whether the stack is empty
- RANDOM to generate random stack elements
- Displays the current stack visually
- Displays status messages for stack operations
- Handles stack underflow when POP is performed on an empty stack
- Handles stack overflow when PUSH is performed on a full stack
- Uses a maximum stack capacity of 10 elements

 4. Requirements

- Java Development Kit (JDK)
- Java Swing
- Java AWT
- Apache NetBeans or another Java IDE

 5. How to Run

1. Open the project in Apache NetBeans.
2. Open the StackGUI.java file.
3. Make sure Stack.java and StackGUI.java are inside the stackvisualization package.
4. Run StackGUI.java.
5. The 2D Stack Visualizer window will appear.
6. Enter an integer value in the input field and use the available buttons to perform stack operations.

 6. How to Use

PUSH
Enter an integer in the value field and click PUSH. The value will be added to the top of the stack.
POP
Click POP to remove the top element. If the stack is empty, an underflow message will be displayed.

PEEK
Click PEEK to display the current top element without removing it from the stack.

CLEAR
Click CLEAR to remove all elements from the stack.

CHECK STACK
Click CHECK STACK to check whether the stack is empty or not.

RANDOM
Click RANDOM to clear the current stack and generate a random number of elements between 1 and 10. Each generated value is between 1 and 100.

7. Stack Behavior

The program uses the LIFO principle, which means the last element added to the stack is the first element removed.

For example:

Push 10 → Push 20 → Push 30

The stack becomes:

30  
20  
10

When POP is clicked, 30 is removed first.

8. Stack Capacity

The stack is implemented using an array with a maximum capacity of 10 elements.

When the stack already contains 10 elements, attempting to add another element displays:

"STACK OVERFLOW: Cannot push, stack is full."

When POP is clicked while the stack is empty, the program displays:

"STACK UNDERFLOW: Cannot pop, stack is empty."

9. Program Structure

The program consists of two main classes:

Stack.java

The Stack class manages the stack data and performs the stack operations. It contains methods such as push(), pop(), peek(), isEmpty(), size(), and clear().

StackGUI.java

The StackGUI class provides the graphical user interface. It receives user input, responds to button actions, displays the stack, and communicates with the Stack class through its methods.

10. Libraries and Frameworks

The program uses:

- Java Swing for the graphical user interface
- Java AWT for GUI components and layout
- Java Random for generating random stack values

11. Testing

The program was tested using normal stack operations, boundary conditions, underflow, overflow, CLEAR, RANDOM, CHECK STACK, and PEEK. Additional test cases were also performed to verify that the program responds correctly to different inputs and maintains proper LIFO behavior.

12. Authors

Group 3:

- Ronnie Sabayton
- Jhon Christmart Fernandez
- Andrew Lee Lanchita
- Renze Torcuator
- Canete Justin
   

package stackvisualization;

/*
 * Description: This class implements an array-based stack with a maximum
 * capacity of 10 elements. It provides push, pop, peek, isEmpty,
 * size, clear, and get operations.
 *
 * Programmed by: SABAYTON, TORCUATOR, LANCHITA, FERNANDEZ, CANETE
 * Course: BSIT
 * CN: 48143
 * Subject: DATA STRUCTURES & ALGORITHM
 *
 * Last Modified: October 19, 2026
 * Version: 1.4
 */

public class Stack {

private int[] elements;
private int top;
private static final int MAX_CAPACITY = 10;

public Stack() {
elements = new int[MAX_CAPACITY];
top = -1;
}

public boolean push(int value) {
if (top == MAX_CAPACITY - 1) {
return false;
}

top++;
elements[top] = value;
return true;
}

public int pop() {
if (isEmpty()) {
return -1;
}

int value = elements[top];
top--;
return value;
}

public int peek() {
if (isEmpty()) {
return -1;
}

return elements[top];
}

public boolean isEmpty() {
return top == -1;
}

public int size() {
return top + 1;
}

public void clear() {
top = -1;
}

public int get(int index) {
if (index < 0 || index > top) {
return -1;
}

return elements[index];
}

public int getCapacity() {
return MAX_CAPACITY;
}
}

package stackvisualization;

/*
 * Description: This class implements an array-based stack with a maximum
 * capacity of 10 elements. It provides push, pop, peek, isEmpty,
 * size, clear, and get operations.
 *
 * Programmed by: Sabayton, Torcuator, Lanchita, Fernandez, Canete
 * Course: ______________________________
 * CN: ______________________________
 * Subject: ______________________________
 *
 * Last Modified: October 19, 2026
 * Version: 1.1
 */
public class Stack {
  private int [] elements;
  private int top;
  private static final int MAX_CAPACITY = 10;
  elements = new int[MAX_CAPACITY];
  top = -1;
}

public boolean push(int value) {
  if (top == MAX_CAPACITY - 1) {
    return false;
  }
  
  public Stack() {
    
  }
}

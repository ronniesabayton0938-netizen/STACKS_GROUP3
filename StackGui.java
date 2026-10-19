package stackvisualization;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/*
 * Description: This class provides the graphical user interface for the
 * stack visualization program. It allows the user to perform push, pop,
 * peek, clear, check stack, and random operations.
 *
 * Programmed by: TORCUATOR, SABAYTON, FERNANDEZ, LANCHITA, CANETE
 * Course: BSIT
 * CN: 48143
 * Subject:DATA STRUCTURES & ALGORITHM
 *
 * Last Modified: October 19, 2026
 * Version: 1.0
 */

public class StackGUI extends JFrame {

    private Stack stack;

    private JTextField inputField;
    private JPanel stackPanel;
    private JLabel statusLabel;

    private JButton pushButton;
    private JButton popButton;
    private JButton peekButton;
    private JButton clearButton;
    private JButton checkButton;
    private JButton randomButton;

    public StackGUI() {

        stack = new Stack();

        setTitle("2D Stack Visualizer");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createGUI();
        updateStackDisplay();
    }
*/ leave this part empty, proceed to line 49

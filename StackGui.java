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
 * Version: 1.1
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

private void createGUI(){
    setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel();

        inputField = new JTextField(10);

        pushButton = new JButton("PUSH");
        popButton = new JButton("POP");
        peekButton = new JButton("PEEK");
        clearButton = new JButton("CLEAR");
        checkButton = new JButton("CHECK STACK");
        randomButton = new JButton("RANDOM");

        topPanel.add(new JLabel("Value:"));
        topPanel.add(inputField);
        topPanel.add(pushButton);
        topPanel.add(popButton);
        topPanel.add(peekButton);
        topPanel.add(clearButton);
        topPanel.add(checkButton);
        topPanel.add(randomButton);

        add(topPanel, BorderLayout.NORTH);

        stackPanel = new JPanel();
        stackPanel.setLayout(new BoxLayout(stackPanel, BoxLayout.Y_AXIS));
        stackPanel.setBorder(
                BorderFactory.createTitledBorder("STACK")
        );

        add(stackPanel, BorderLayout.CENTER);

        statusLabel = new JLabel(
                "Stack is ready.",
                SwingConstants.CENTER
        );

        add(statusLabel, BorderLayout.SOUTH);

        pushButton.addActionListener(e -> pushValue());
        popButton.addActionListener(e -> popValue());
        peekButton.addActionListener(e -> peekValue());
        clearButton.addActionListener(e -> clearStack());
        checkButton.addActionListener(e -> checkStack());
        randomButton.addActionListener(e -> randomStack());
}


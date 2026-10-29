package stackvisualization;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

/*
 * Description: This class provides the graphical user interface for the
 * stack visualization program. It allows the user to perform push, pop,
 * peek, clear, check stack, and random operations.
 *
 * Programmed by: TORCUATOR, SABAYTON, FERNANDEZ, LANCHITA, CANETE
 * Course: BSIT
 * CN: 48143
 * Subject: DATA STRUCTURES & ALGORITHM
 *
 * Last Modified: October 29, 2026
 * Version: 2.0
 */

public class StackGui extends JFrame {

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

    public StackGui() {

        stack = new Stack();

        setTitle("2D Stack Visualizer");
        setSize(700, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createGUI();
        updateStackDisplay();
    }

    // Create the GUI
    private void createGUI() {

        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new FlowLayout());

        inputField = new JTextField(8);

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

        stackPanel.setLayout(
            new BoxLayout(stackPanel, BoxLayout.Y_AXIS)
        );

        stackPanel.setBorder(
            BorderFactory.createTitledBorder("STACK")
        );

        JScrollPane scrollPane = new JScrollPane(stackPanel);

        add(scrollPane, BorderLayout.CENTER);

        statusLabel = new JLabel(
            "Stack is ready.",
            SwingConstants.CENTER
        );

        add(statusLabel, BorderLayout.SOUTH);

        // Button actions
        pushButton.addActionListener(e -> pushValue());
        popButton.addActionListener(e -> popValue());
        peekButton.addActionListener(e -> peekValue());
        clearButton.addActionListener(e -> clearStack());
        checkButton.addActionListener(e -> checkStack());
        randomButton.addActionListener(e -> randomStack());
    }

    // PUSH operation
    private void pushValue() {

        String input = inputField.getText().trim();

        if (input.isEmpty()) {
            statusLabel.setText("Please enter a value.");
            return;
        }

        try {

            int value = Integer.parseInt(input);

            if (stack.push(value)) {

                statusLabel.setText(
                    "PUSH successful: " + value + " was added."
                );

                inputField.setText("");

            } else {

                statusLabel.setText(
                    "STACK OVERFLOW: Cannot push, stack is full."
                );
            }

            updateStackDisplay();

        } catch (NumberFormatException ex) {

            statusLabel.setText(
                "Invalid input. Please enter an integer."
            );
        }
    }

    // POP operation
    private void popValue() {

        if (stack.isEmpty()) {

            statusLabel.setText(
                "STACK UNDERFLOW: Cannot pop, stack is empty."
            );

            return;
        }

        int value = stack.pop();

        statusLabel.setText(
            "POP successful: " + value + " was removed."
        );

        updateStackDisplay();
    }

    // PEEK operation
    private void peekValue() {

        if (stack.isEmpty()) {

            statusLabel.setText(
                "EMPTY STACK: There is no top element to peek."
            );

            return;
        }

        int value = stack.peek();

        statusLabel.setText(
            "PEEK: Top element is " + value + "."
        );

        updateStackDisplay();
    }

    // CLEAR operation
    private void clearStack() {

        stack.clear();

        statusLabel.setText("Stack cleared.");

        updateStackDisplay();
    }

    // CHECK STACK operation
    private void checkStack() {

        if (stack.isEmpty()) {

            statusLabel.setText(
                "CHECK STACK: Stack is empty."
            );

        } else {

            statusLabel.setText(
                "CHECK STACK: Stack is not empty. Size = "
                + stack.size()
            );
        }
    }

    // RANDOM operation
    private void randomStack() {

        stack.clear();

        Random random = new Random();

        int numberOfElements =
            random.nextInt(stack.getCapacity()) + 1;

        for (int i = 0; i < numberOfElements; i++) {

            int value = random.nextInt(100) + 1;

            stack.push(value);
        }

        statusLabel.setText(
            "RANDOM: Generated "
            + numberOfElements + " elements."
        );

        updateStackDisplay();
    }

    // Update the stack visualization
    private void updateStackDisplay() {

        stackPanel.removeAll();

        if (stack.isEmpty()) {

            JLabel emptyLabel = new JLabel("EMPTY");

            emptyLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
            );

            stackPanel.add(Box.createVerticalGlue());
            stackPanel.add(emptyLabel);
            stackPanel.add(Box.createVerticalGlue());

        } else {

            JLabel topLabel = new JLabel(
                "TOP -> " + stack.peek()
            );

            topLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
            );

            stackPanel.add(topLabel);

            stackPanel.add(
                Box.createVerticalStrut(10)
            );

            // Display elements from top to bottom
            for (int i = stack.size() - 1; i >= 0; i--) {

                JLabel block = new JLabel(
                    String.valueOf(stack.get(i)),
                    SwingConstants.CENTER
                );

                block.setPreferredSize(
                    new Dimension(150, 45)
                );

                block.setMaximumSize(
                    new Dimension(150, 45)
                );

                block.setMinimumSize(
                    new Dimension(150, 45)
                );

                block.setOpaque(true);
                block.setBackground(Color.WHITE);

                block.setBorder(
                    BorderFactory.createLineBorder(
                        Color.BLACK
                    )
                );

                block.setAlignmentX(
                    Component.CENTER_ALIGNMENT
                );

                stackPanel.add(block);

                stackPanel.add(
                    Box.createVerticalStrut(5)
                );
            }
        }

        stackPanel.revalidate();
        stackPanel.repaint();
    }

    // Main method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            StackGui gui = new StackGui();

            gui.setVisible(true);
        });
    }
}
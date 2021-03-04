package com.company.swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {
        super("Grid layout example");

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));
        add(new JButton("Blah"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));
        add(new JButton("Blah"));

        setLayout(new GridLayout(0,4,20,10));

        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package com.company.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    public FlowLayoutExample() {

        super("Flow layout example");

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));

        setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

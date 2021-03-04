package com.company.swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("Border layout example");

        setLayout(new BorderLayout());

        add(new JButton("First"),BorderLayout.CENTER);
        add(new JButton("Second"),BorderLayout.NORTH);
        add(new JButton("Third"),BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        add(new JButton("Fifth"),BorderLayout.EAST);
        add(new JButton("Sixth"),BorderLayout.WEST);

        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

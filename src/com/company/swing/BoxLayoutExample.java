package com.company.swing;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {

    public BoxLayoutExample() {
        super("Box layout example");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));

        panel.add(new JButton("blah"));
        panel.add(new JButton("blah"));
        panel.add(new JButton("blah"));
        panel.add(new JButton("blah"));
        panel.add(new JButton("blah"));

        add(panel);

        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

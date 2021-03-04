package com.company.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {

    public HelloFrame(){

        super("New Frame");

        setLayout(null);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("your name");
        nameLabel.setBounds(40, 20, 100, 30);

        JTextField nameTextField = new JTextField();
        nameTextField.setText("hello world");
        nameTextField.setBounds(160,20, 100,30);

        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100,70,100,30);
        add(acceptButton);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(0,0, 50,0);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        acceptButton.addActionListener((e) -> {
            String helloText = "Hello ";
            String name = nameTextField.getText();
            if (name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
        });

        Font font = new Font("Courier", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(20f));

        greenPanel.add(helloLabel);

        add(greenPanel);

        add(nameLabel);
        add(nameTextField);
        add(acceptButton);

        setSize(300,300);
        setResizable(false);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

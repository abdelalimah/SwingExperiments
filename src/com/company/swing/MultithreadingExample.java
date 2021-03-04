package com.company.swing;

import javax.swing.*;
import java.awt.*;

public class MultithreadingExample extends JFrame {

    public MultithreadingExample() {

        super("Multithreading example");

        JButton dialog = new JButton("Click me!");
        dialog.addActionListener((e) -> showDialog());

        setLayout(new BorderLayout());

        add(dialog,BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    void showDialog() {
        try{
            System.out.println(SwingUtilities.isEventDispatchThread());
            Thread a = new Thread(() -> {
                System.out.println(SwingUtilities.isEventDispatchThread());
                JOptionPane.showMessageDialog(getContentPane(),"hello blah");
            });

            Thread b = new Thread(() -> {
                System.out.println(SwingUtilities.isEventDispatchThread());
                JOptionPane.showMessageDialog(getContentPane(),"Hello world 2");
            });

            a.start();
            b.start();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

package com.company;

import model.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("окно");
        setSize(500, 500);
        setLocation(720, 200);
        setLayout(new FlowLayout());

        JButton addCourse = new JButton("Добавить");
        JTextField title = new JTextField(10);
        JTextField description = new JTextField(10);

        add(title);
        add(description);
        add(addCourse);
        addCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Course(title.getText(),description.getText());
                System.out.println(Course.list);
            }
        });

        setVisible(true);
    }
}



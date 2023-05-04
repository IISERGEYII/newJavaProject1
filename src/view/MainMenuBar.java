package view;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuBar extends JMenuBar {
    public MainMenuBar(){
        add(fileMenu());
        add(listMenu());
        add(helpMenu());

    }

    public JMenu listMenu(){
        JMenu list = new JMenu("Список");

        JMenuItem students = new JMenuItem("Студенты");
        JMenuItem courses = new JMenuItem("Курсы");

        list.add(students);
        list.add(courses);

        courses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Main.mainFrame.remove(MainFrame.studentListPanel);
//                Main.mainFrame.add(MainFrame.courseListPanel);
            }
        });

        students.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Main.mainFrame.remove(MainFrame.courseListPanel);
//                Main.mainFrame.add(MainFrame.studentListPanel);
            }
        });

        return list;
    }

    public JMenu helpMenu(){
        JMenu help = new JMenu("Помощь");
        JMenuItem about = new JMenuItem("О программе");
        JMenuItem reference = new JMenuItem("Справка");

        help.add(about);
        help.add(reference);

        return help;
    }
    public JMenu fileMenu(){
        JMenu file = new JMenu("Файл");
        JMenu newItem = new JMenu("Новый");
        JMenuItem newCourse = new JMenuItem("Курс");
        JMenuItem newStudent = new JMenuItem("Студент");

        file.add(newItem);
        newItem.add(newStudent);
        newItem.add(newCourse);

        newStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               MainFrame.addStudentFrame.setVisible(true);
            }
        });

        newCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.addCourseFrame.setVisible(true);
            }
        });

        return file;
    }

}

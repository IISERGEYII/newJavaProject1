package view.student;

import javax.swing.*;
import java.awt.*;

public class AddStudentFrame extends JFrame {
    public AddStudentFrame(){
        setTitle("Добавление студента");
        setSize(500, 300);
        setLocation(710, 390);
        setLayout(new FlowLayout());
        add(new AddStudentPanel());

        setVisible(false);
    }
}

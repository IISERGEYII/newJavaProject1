package view.course;

import model.Course;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseListPanel extends JPanel {
    static String[] headers = {"ID", "Title", "Description"};
    static DefaultTableModel model = new DefaultTableModel(headers, 0);

    public CourseListPanel() {
        JTable table = new JTable();

        for (Course course : Course.list) {
            addRow(course);
        }
        table.setModel(model);
        JScrollPane scroll = new JScrollPane();
        this.add(scroll);


    }

    public static void addRow(Course course) {
        model.addRow(
                new Object[]{
                        course.getId(),
                        course.getTitle(),
                        course.getDescription()
                }
        );
    }
}

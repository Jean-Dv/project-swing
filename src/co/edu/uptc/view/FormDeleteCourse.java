package co.edu.uptc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.uptc.controller.CourseController;

public class FormDeleteCourse extends JFrame implements ActionListener {
    private JLabel labelIdCourseDelete;
    private JTextField idCourseDelete;

    private JButton button;
    private JButton cancelButton;

    public FormDeleteCourse() {
        this.initComponents();
    }

    public void initComponents() {
        setSize(350, 250);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        labelIdCourseDelete = new JLabel("Id course to delete:");
        idCourseDelete = new JTextField();
        button = new JButton("Delete");
        cancelButton = new JButton("Cancel");

        labelIdCourseDelete.setBounds(10, 10, 130, 30);
        idCourseDelete.setBounds(120, 10, 200, 30);

        button.setBounds(55, 170, 100, 30);
        cancelButton.setBounds(155, 170, 100, 30);

        setLayout(null);

        this.add(this.labelIdCourseDelete);
        this.add(this.idCourseDelete);
        this.add(this.button);
        this.add(this.cancelButton);

        this.button.addActionListener(this);
        this.cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            CourseController cc = CourseController.getInstance();
            cc.deleteCourse();
            this.setVisible(false);
        }

        if (e.getSource() == cancelButton) {
            this.dispose();
        }
    }
}

package co.edu.uptc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.uptc.controller.StudentController;

public class FormViewStudent extends JFrame implements ActionListener {
    private JLabel labelFirstName;// Etiqueta para el nombre del estudiante
    private JLabel labelLastName;// Etiqueta para el apellido del estudiante
    private JLabel labelEmail;// Etiqueta para el correo del estudiante
    private JLabel labelId;// Etiqueta para el id del estudiante

    private JTextField textFieldFirstName;// Campo de texto para el nombre del estudiante
    private JTextField textFieldLastName;// Campo de texto para el apellido del estudiante
    private JTextField textFieldEmail;// Campo de texto para el correo del estudiante
    private JTextField textFieldId;// Campo de texto para el id del estudiante

    private JButton buttonReturn;// Botón para cancelar la operación

    public FormViewStudent() {
        this.initComponents();
    }

    private void initComponents() {
        labelFirstName = new JLabel("FirstName:");
        labelLastName = new JLabel("LastName:");
        labelEmail = new JLabel("Email:");
        labelId = new JLabel("Id:");

        textFieldFirstName = new JTextField();
        textFieldLastName = new JTextField();
        textFieldEmail = new JTextField();
        textFieldId = new JTextField();

        StudentController sc = StudentController.getInstance();
        textFieldFirstName.setText(sc.getStudent().getFirstName());
        textFieldLastName.setText(sc.getStudent().getLastName());
        textFieldEmail.setText(sc.getStudent().getEmail());
        textFieldId.setText(String.valueOf(sc.getStudent().getId()));

        textFieldFirstName.setEditable(false);
        textFieldLastName.setEditable(false);
        textFieldEmail.setEditable(false);
        textFieldId.setEditable(false);

        buttonReturn = new JButton("Cancel");

        this.setLayout(null);

        labelFirstName.setBounds(10, 10, 100, 30);
        labelLastName.setBounds(10, 50, 100, 30);
        labelEmail.setBounds(10, 90, 100, 30);
        labelId.setBounds(10, 130, 100, 30);

        textFieldFirstName.setBounds(120, 10, 200, 30);
        textFieldLastName.setBounds(120, 50, 200, 30);
        textFieldEmail.setBounds(120, 90, 200, 30);
        textFieldId.setBounds(120, 130, 200, 30);

        buttonReturn.setBounds(120, 170, 100, 30);

        this.add(labelFirstName);
        this.add(labelLastName);
        this.add(labelEmail);
        this.add(labelId);

        this.add(textFieldFirstName);
        this.add(textFieldLastName);
        this.add(textFieldEmail);
        this.add(textFieldId);

        this.add(buttonReturn);

        buttonReturn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonReturn) {
            this.setVisible(false);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2pdc;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Husse
 */
public class NewUserFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton createUserButton;

    public NewUserFrame(DBManager db) {
        setTitle("Create New User");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        createUserButton = new JButton("Create User");
        createUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                Random rand = new Random();
                
                // Perform actions to create user with provided username and password
                // ...
                String insertQuery = "INSERT INTO users (id, name, password) VALUES ('" + rand.nextInt(1000) + "'," + username + "', '" + password + "')";
                db.updateDB(insertQuery);
                // Clear the fields after creating user
                usernameField.setText("");
                passwordField.setText("");
                
                dispose();
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(createUserButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }
}

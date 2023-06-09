/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2pdc;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Husse
 */
public class MainFrame extends JFrame {

    public MainFrame(UserList users, DBManager db) {
        // Calculate the size based on a 4:3 aspect ratio
        int width = 800;
        int height = (int) (width * 0.75); // 4:3 aspect ratio

        setTitle("Login");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton createUser = new JButton("New User");
        
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(createUser);
        
        add(panel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                String currentPassword = "";
                boolean correct = false;
                for(int i = 0; i < users.size(); i++){
                    if(users.get(i).name.equalsIgnoreCase(username)){
                        correct = users.get(i).isPassword(password);
                    }
                }
                
                // Perform login logic here
                if (correct) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Login successful!");
                    // Open the main application window or perform other actions
                } else {
                    JOptionPane.showMessageDialog(MainFrame.this, "Invalid username or password. Please try again.");
                }
            }
        });
        
        createUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NewUserFrame nur = new NewUserFrame(db);
                nur.setVisible(true);
            }
        });
    }
}

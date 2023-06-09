package assignment2pdc;

import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Husse
 */
public class Main {

    static String password = "admin";

    public static void main(String[] args) throws SQLException {

        DBManager manager = new DBManager();

        UserList users = new UserList();
        users.getUsers(manager);

        MainFrame main = new MainFrame(users, manager);
        
        main.setVisible(true);
    }
}

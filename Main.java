package com.pdc.assignment2;


import java.awt.Font;
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

    String password = "admin";

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ticket Booking System");
        JButton admin = new JButton("Admin Button");
        admin.setText("ADMIN");
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);
        admin.setFont(buttonFont);

        frame.setSize(1920 / 2, 1080 / 2);
        admin.setSize(150, 50);
        admin.setFocusPainted(false);
        frame.add(admin);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

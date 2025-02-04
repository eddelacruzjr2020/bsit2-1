/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Switching2Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class WelcomePage extends JFrame implements ActionListener{
    
    private JButton btnLogin = new JButton("Login");
    
    WelcomePage(){
        setTitle("Welcome Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnLogin.setBounds(50, 100, 120, 30);
        add(btnLogin);
        btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        LoginPage lp = new LoginPage();
        lp.setVisible(true);  
    }
    
}

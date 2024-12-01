/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

/**
 *
 * @author Owner
 */
import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class SetupAccountArtist extends SetupAccountClient implements ActionListener {

    public SetupAccountArtist() 
    {
        setupLabel.setText("Setup your account as an Artist");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == goBack) {
            new FirstFrame(); // Return to the previous frame
            setVisible(false);
        } else if (source == signin) {
            new SigninArtist();
            setVisible(false);
        } else if (source == register) {
            new RegisterArtist();
            setVisible(false);
        }
    }
        
  
    
        
}
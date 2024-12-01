package com.mycompany.artstreamfinal;

import javax.swing.*;
import java.awt.*;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.event.*;

public class SetupAccountClient extends JFrame implements ActionListener {
    
    protected Container con = getContentPane();
    protected JPanel main = new JPanel();
    protected ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\OneDrive\\Documents\\NetBeansProjects\\ArtStreamFinal\\src\\main\\java\\com\\mycompany\\artstreamfinal\\ArtSTREAM-removebg-preview.png");
    protected JLabel image = new JLabel(icon);
    protected JLabel setupLabel = new JLabel("Setup your account as a Client");
    protected JButton signin = new JButton("Sign in");
    protected JButton register = new JButton("Create an account");
    protected JPanel back = new JPanel();
    protected JButton goBack = new JButton("Return");

    public SetupAccountClient() {
        super("ArtStream");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set container layout and background
        con.setLayout(new BorderLayout());
        con.setBackground(Color.WHITE);

        // Adjust icon size
        Image iconSize = icon.getImage();
        Image iconNewSize = iconSize.getScaledInstance(600, 500, Image.SCALE_SMOOTH);
        icon = new ImageIcon(iconNewSize);
        image.setIcon(icon);

        // Main panel setup
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBackground(Color.WHITE);
        

        // Styling the components
        setupLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
        setupLabel.setForeground(Color.BLACK);

        signin.setFont(new Font("Monospaced", Font.PLAIN, 15));
        register.setFont(new Font("Monospaced", Font.PLAIN, 15));
        goBack.setFont(new Font("Monospaced", Font.PLAIN, 15));

        signin.setBackground(Color.decode("#89CFF0"));
        register.setBackground(Color.decode("#89CFF0"));
        goBack.setBackground(Color.decode("#89CFF0"));

        signin.setForeground(Color.BLACK);
        register.setForeground(Color.BLACK);
        goBack.setForeground(Color.BLACK);

        // Adding components to the main panel
      
        main.add(image);
        image.setAlignmentX(CENTER_ALIGNMENT);

        main.add(Box.createRigidArea(new Dimension(0, 0)));
        main.add(setupLabel);
        setupLabel.setAlignmentX(CENTER_ALIGNMENT);

        main.add(Box.createRigidArea(new Dimension(0, 30)));
        main.add(signin);
        signin.setAlignmentX(CENTER_ALIGNMENT);
        signin.setMaximumSize(new Dimension(400,100));

        main.add(Box.createRigidArea(new Dimension(0, 20)));
        main.add(register);
        register.setAlignmentX(CENTER_ALIGNMENT);
        register.setMaximumSize(new Dimension(400,100));
        main.add(Box.createRigidArea(new Dimension(0, 20)));

        // Adding components to the container
        con.add(main, BorderLayout.CENTER);
        
        // Back button panel
        back.setLayout(new FlowLayout(FlowLayout.LEADING));
        back.setBackground(Color.WHITE);
        back.add(goBack);

        con.add(back, BorderLayout.SOUTH);

        // Add action listeners
        signin.addActionListener(this);
        register.addActionListener(this);
        goBack.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == goBack) {
            new FirstFrame(); // Return to the previous frame
            setVisible(false);
        } else if (source == signin) {
            new SigninClient();
            setVisible(false);
        } else if (source == register) {
           new RegisterClient();
            setVisible(false);
        }
    }
    
    
    
}

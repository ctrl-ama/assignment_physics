package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PotentialenergyUI {
    JFrame frame = new JFrame("PHYSICS ASSIGNMENT");
    JButton potentialEnergy = new JButton("POTENTIAL ENERGY");
    JLabel text = new JLabel("I am a text");
    JTextField textField = new JTextField();

    public void mainUI() {
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);

        frame.add(potentialEnergy);
        frame.add(text);
        frame.add(textField);

        potentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI2();
            }
        });
    }

    public void mainUI2() {
        JFrame frame2 = new JFrame("Calculate Potential Energy");
        JLabel text2 = new JLabel("Enter mass (in kg)");
        JLabel text3 = new JLabel("Enter mass (in kg)");
        JLabel text4 = new JLabel("Enter height (in m)");
        JTextField massField = new JTextField();
        JTextField gravityField = new JTextField();
        JTextField heightField = new JTextField();
        JButton calculateButton = new JButton("Calculate");

        frame2.setLayout(new GridLayout(3, 2));
        frame2.add(text2);
        frame2.add(massField);
        frame2.add(text3);
        frame2.add(heightField);
        frame2.add(text4);
        frame2.add(gravityField);
        frame2.add(calculateButton);


        frame2.setSize(300, 150);
        frame2.setVisible(true);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Parse mass and height values from text fields
                double mass = Double.parseDouble(massField.getText());
                double height = Double.parseDouble(heightField.getText());
                double gravity = Double.parseDouble(gravityField.getText());

                // Calculate potential energy using constant gravity
                double potentialEnergy = mass * gravity * height;
                // Display the result
                JOptionPane.showMessageDialog(null, "The potential energy is " + potentialEnergy + " Joules");
            }
    });
};
}
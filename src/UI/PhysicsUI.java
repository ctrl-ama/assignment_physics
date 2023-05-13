package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class PhysicsUI {
    JFrame frame = new JFrame("Assignment");


    JButton energy = new JButton("FORCE");

    JButton energy2= new JButton("POTENTIAL ENERGY");

    JLabel text = new JLabel("GET READY TO CALCULATE");

    JTextField textField = new JTextField();



    public void MainUI(){
        frame.setSize(250,400);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

        frame.add(energy);
        frame.add(energy2);

        frame.add(text);
        frame.add(textField);


        energy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainUI2();
            }
        });

        energy2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainUI3();
            }
        });

    }

    public void MainUI2() {
        JFrame frame2 = new JFrame("window ");
        JLabel text2 = new JLabel("Enter mass:");
        JLabel text3 = new JLabel("Enter gravity:");
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();


        JButton calculate = new JButton("Calculate");

        frame2.setSize(400, 400);
        frame2.setLayout(new GridLayout(3, 1));
        frame2.setVisible(true);


        frame2.add(text2);
        frame2.add(textField2);
        frame2.add(text3);
        frame2.add(textField3);
        frame2.add(calculate);


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Gforce myObj = new Gforce();
                float answer = (float) myObj.calculateForce(Float.parseFloat(textField2.getText()), Float.parseFloat(textField3.getText()));
                JOptionPane.showMessageDialog(null, answer);

            }
        });
    }

        public void MainUI3() {


            JFrame frame3 = new JFrame("Calculate Potential Energy");
            JLabel text4 = new JLabel("Enter mass (in kg)");
            JLabel text5 = new JLabel("Enter mass (in kg)");
            JLabel text6 = new JLabel("Enter height (in m)");
            JTextField massField4 = new JTextField();
            JTextField gravityField5 = new JTextField();
            JTextField heightField6 = new JTextField();
            JButton calculateButton = new JButton("Calculate");

            frame3.setLayout(new GridLayout(3, 2));
            frame3.add(text4);
            frame3.add(massField4);
            frame3.add(text5);
            frame3.add(heightField6);
            frame3.add(text6);
            frame3.add(gravityField5);
            frame3.add(calculateButton);


            frame3.setSize(300, 150);
            frame3.setVisible(true);
            // Existing code...




            calculateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Parse mass and height values from text fields
                    double mass = Double.parseDouble(massField4.getText());
                    double height = Double.parseDouble(heightField6.getText());
                    double gravity = Double.parseDouble(gravityField5.getText());

                    // Calculate potential energy using constant gravity
                    double potentialEnergy = mass * gravity * height;
                    // Display the result
                    JOptionPane.showMessageDialog(null, "The potential energy is " + potentialEnergy + " Joules");
                }
        });

    }


}


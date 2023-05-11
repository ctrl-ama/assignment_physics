import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedUI{

        JFrame frame=new JFrame("Window");
        JFrame speedFrame=new JFrame("Frame");
        JButton speedBtn = new JButton();
        JButton speedCalculator = new JButton("Speed Calculator");
        JTextField textField = new JTextField();
        JTextField distance = new JTextField();
        JTextField time = new JTextField();

        public void mainUI(){
            frame.setSize(150, 200);
            frame.setLayout(new GridLayout(3,1));
            frame.setVisible(true);

            frame.add(speedCalculator);

            speedCalculator.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Calcspeed();
                }
            });

        }
     //   public void Speed_.ActionListener(new ActionListener){






    public void Calcspeed(){
            SpeedCalculator geo = new SpeedCalculator();
            speedFrame.add(distance);
            speedFrame.add(time);
            speedFrame.add(speedCalculator);
            speedFrame.setSize(200,200);
            speedFrame.setLayout(new GridLayout(3,1));
            speedFrame.setVisible(true);
            try{
                float  dub = geo.calculateSpeed(Float.parseFloat(distance.getText()),Float.parseFloat(time.getText()));
                JOptionPane.showMessageDialog(null, dub);
            }catch (Exception e){
                System.out.println("speed");
                //JOptionPane.showMessageDialog(new,d);
            }
        }


        }




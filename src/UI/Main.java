package UI;

import java.util.Scanner;
import UI.Gforce;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Gforce calculator = new Gforce();
        PhysicsUI myObj = new PhysicsUI();
        myObj.MainUI();
        //prompt for the user
 //      System.out.print("Enter your mass in kg:");
  //     double m = input.nextDouble();

   //    System.out.print("The force is" + calculator.calculateForce(Float.parseFloat(textField2.getText()), m));



        //calculate force using field.java


  //      double Force = UI.Gforce.calculateForce(float mass,double gravity){
   //    float calculateForce(float mass,double gravity)

        // output result

 //       System.out.print("The force is" + Force+"N");

        System.out.print("Enter the mass of the object in kg: ");
        double m = input.nextDouble();

        System.out.print("Enter the height of the object in meters: ");
        double h = input.nextDouble();





    }

}
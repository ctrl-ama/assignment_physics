import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Gforce calculator = new Gforce();
        //prompt for the user
        System.out.print("Enter your mass in kg:");
        double m = input.nextDouble();
        System.out.print("The force is" + calculator.calculateForce(m));

        //calculate force using field.java


//        double Force = Gforce.calculateForce(float mass,double gravity){
//        float calculateForce(float mass,double gravity)

        // output result

//        System.out.print("The force is" + Force+"N");








    }

}
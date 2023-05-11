package UI;

public class Gforce {

        public static double calculateForce(float v, float mass){
            double g = 9.81;
            return mass *g;
        }

        public static double calculateEscapeVelocity (float gravity,float mass, float radius){

            return (float) Math.sqrt(2*gravity* mass *radius);
        }
        
      // Code to cALc Potential Energy by bola
        
    // Define the calculatePotentialEnergy method.
    public static double calculatePotentialEnergy(double m, double h) {
        double g = 9.81;
        return m * g * h;
    }
}



    }




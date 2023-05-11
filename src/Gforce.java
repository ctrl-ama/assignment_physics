public class Gforce {

        public static double calculateForce( double mass){
            double g = 9.81;
            return mass *g;
        }

        public static double calculateEscapeVelocity (float gravity,float mass, float radius){

            return (float) Math.sqrt(2*gravity* mass *radius);
        }
        
      // Code to cALc Potential Energy
        
    // Define the calculatePotentialEnergy method
    public static double calculatePotentialEnergy(double m, double h) {
        double g = 9.81;
        return m * g * h;
    }
}



    }




package G;

public class field extends physics {

        public static float force( float mass, float gravity){

            return mass *gravity;
        }

        public static float escapeVelocity (float gravity,float mass, float radius){

            return (float) Math.sqrt(2*gravity* mass *radius);
        }
    }





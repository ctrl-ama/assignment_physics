package UI;

public class Gforce {

    public static double calculateForce(double m, double v) {
        double g = 9.81;
        return (float) (m * g);
    }

    // Code to cALc Potential Energy by bola

    // Define the calculatePotentialEnergy method.
    public static double calculatePotentialEnergy(double m, double h) {
        double g = 9.81;
        return m * g * h;
    }

    static float calculateKineticEnergy(float m, float v) {
        float k = 0.5f;
        return m * v*k;
    }
}








// Gavin Perry, 2024-3-13, the purpose of this program is to define a catapult class to calculate a distance given a speed and angle.
public class Catapult {
    public Catapult() {}

    public double calcDistance(double speed, double angle) {
        return Math.pow(speed, 2) * Math.sin(2 * Math.toRadians(angle)) / 9.81;
    }
}
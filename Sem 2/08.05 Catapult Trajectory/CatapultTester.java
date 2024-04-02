// Gavin Perry, 2024-3-13, The purpose of this class is to create a 2d array of distances using the catapult class.
public class CatapultTester {
    public static void main(String[] args) {
        double speeds[] = {20, 40, 60, 80, 100};
        double angles[] = {25, 30, 90, 40, 45, 10};
        double distances[][] = new double[speeds.length][angles.length];
        Catapult c = new Catapult();
        for (int i = 0; i < speeds.length; i++) {
            for (int j = 0; j < angles.length; j++) {
                distances[i][j] = c.calcDistance(speeds[i], angles[j]);
            }
        }

        printDistances(distances, speeds, angles);
    }

    public static void printDistances(double[][] distances, double[] speeds, double[] angles) {
        System.out.println("Projectile Distances (feet)");
        System.out.printf("%4s\t\t", "MPH");
        for (double angle : angles) {
            System.out.printf("%3.0f deg\t\t", angle);
        }
        System.out.println("\n========================================================================================================");

        for (int i = 0; i < distances.length; i++) {
            System.out.printf("%3.0f\t\t", speeds[i]);
            for (int j = 0; j < distances[i].length; j++) {
                System.out.printf("%5.1f\t\t", distances[i][j]);
            }
            System.out.println();
        }
    }
}

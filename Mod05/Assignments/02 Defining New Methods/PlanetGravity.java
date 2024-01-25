// Gavin Perry, 12/8/23, The purpose of this program is to use static methods to calculate and display information about a planet.
public class PlanetGravity {
    public static void main(String[] args) {
        String planet = "Uranus";
        int diameter_km = 51_118;
        double mass_kg = 8.683e25; 
        double gravity = calcSurfaceGravity(diameter_km, mass_kg);
        printHeader();
        printPlanet(planet, diameter_km, mass_kg, gravity);
    }

    public static double calcSurfaceGravity(int diameter_km, double mass_kg) {
        double universal_grav_constant = 6.673e-11;
        double radius = (diameter_km / 2) * 1000;
        double gravity = (universal_grav_constant * mass_kg) / Math.pow(radius, 2);
        return gravity;
    }

    public static void printHeader() {
        System.out.println("\t\t\tPlanetary Data");
        System.out.println("  Planet\tDiameter (km)\t\tMass (kg)\tg (m/s^2)");
        System.out.println("-------------------------------------------------------------------");
    }

    public static void printPlanet(String planet, int diameter_km, double mass_kg, double g) {
        String roundedG = String.format("%.2f", g);
        System.out.println("  " + planet + "\t" + diameter_km + "\t\t\t" + mass_kg + "\t" + roundedG);
    }
}

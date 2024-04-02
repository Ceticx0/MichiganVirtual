// Gavin Perry, 2024-3-22, test all classes stemming from Terrain.
public class GameTerrainTester {

    public static void main(String args[]) {
        Terrain land = new Terrain(100, 100);
        Forest fLand = new Forest(100, 200, 100);
        Mountain mLand = new Mountain(300, 400, 25);
        WinterMountain wmLand = new WinterMountain(500, 600, 15, 10.0);
        Desert dLand = new Desert(700, 800, 50);
        Oasis oLand = new Oasis(900, 1000, 100);
        System.out.println("Land " + land.getTerrainSize());
        System.out.println("Forest " + fLand.getTerrainSize() + " and has " + fLand.getTrees() + " trees.");
        System.out.println("Mountain " + mLand.getTerrainSize() + " and has " + mLand.getMountains() + " mountains.");
        System.out.println("Winter Mountain " + wmLand.getTerrainSize() + " and has temperature " + wmLand.getTemperature()
                + " and " + wmLand.getMountains() + " mountains.");
        System.out.println("Desert " + dLand.getTerrainSize() + " and has " + dLand.getCacti() + " cacti.");
        System.out.println("Oasis " + oLand.getTerrainSize() + " and has " + oLand.getWaterVolume() + " water volume.");
    }
}
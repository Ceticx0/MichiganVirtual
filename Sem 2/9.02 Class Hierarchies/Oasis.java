// Gavin Perry 2024-3-22, extend Dessert class to create Oasis class
public class Oasis extends Terrain {

    private int waterVolume;

    /**
     * Constructor for the Desert Class
     */
    public Oasis(int l, int w, int waterVolume) {
        super(l, w);
        this.waterVolume = waterVolume;
    }

    /**
     * @return the cacti
     */
    public int getWaterVolume() {
        return waterVolume;
    }
}
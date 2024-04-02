// Gavin Perry 2024-3-22, extend Terrain class to create Grassland class
public class Desert extends Terrain {

    private int cacti;

    /**
     * Constructor for the Desert Class
     */
    public Desert(int l, int w, int cacti) {
        super(l, w);
        this.cacti = cacti;
    }

    /**
     * @return the cacti
     */
    public int getCacti() {
        return cacti;
    }
}
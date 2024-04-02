// Gavin Perry 2024-3-22, extend Terrain class to create Forest class
public class Forest extends Terrain {

    private int trees;

    /**
     * Constructor for the Forest Class
     */
    public Forest(int l, int w, int trees) {
        super(l, w);
        this.trees = trees;
    }

    /**
     * @return the trees
     */
    public int getTrees() {
        return trees;
    }
}
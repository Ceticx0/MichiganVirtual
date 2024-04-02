
 /**
 * This class defines a Mountain Terrain class which extends terrain.
 *
 * @author Gavin Perry
 * @version 2024-3-22
 */

public class Mountain extends Terrain
{
    private int mountains;

    public Mountain(int l, int w, int mountains) {
        super(l, w);
        this.mountains = mountains;
    }

    /**
     * @return the mountains.
     */
    public int getMountains() {
        return mountains;
    }
}
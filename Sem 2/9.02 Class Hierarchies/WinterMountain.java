// Gavin Perry, 2024-3-22, extend Mountain class to create WinterMountain class
public class WinterMountain extends Mountain {

    private double temperature;

    /**
     * Constructor for WinterMountain Class.
     */
    public WinterMountain(int l, int w, int mountains, double temperature) {
        super(l, w, mountains);
        this.temperature = temperature;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }
}
// Gavin Perry, 2024-3-22, Extend cube 4 class and add another dimension.
public class Tesseract4 extends Cube4 {
    private int hyperspace;

    public Tesseract4(int width) {
        super(width);
        this.hyperspace = width;
    }

    public int gethyperspace() {
        return hyperspace;
    }

    public String toString() {
        return "Tesseract: " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + this.hyperspace;
    }

}

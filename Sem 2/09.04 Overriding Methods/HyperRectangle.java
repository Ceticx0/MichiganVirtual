// Gavin Perry, 2024-3-22, Extend box 4 class and add another dimension.
public class HyperRectangle extends Box4 {
    private int hyperSpace;

    public HyperRectangle(int length, int width, int height, int hyperSpace) {
        super(length, width, height);
        this.hyperSpace = hyperSpace;
    }

    public int getHyperSpace() {
        return hyperSpace;
    }

    public String toString() {
        return "RectangularPrism: " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + getHyperSpace();
    }

    public Boolean equals(HyperRectangle hypRect) {
        return getLength() == hypRect.getLength() && getWidth() == hypRect.getWidth() && getHeight() == hypRect.getHeight() && getHyperSpace() == hypRect.getHyperSpace();
    }
}

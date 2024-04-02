// Gavin Perry, 2024-3-22, Extend box 4 class and make the height and width the same.
public class Cube4 extends Box4 {

    public Cube4(int width) {
        super(width, width, width);
    }

    public String toString() {
        return "Cube: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}

// Gavin Perry, 2024-3-22, Tests all shape classes.
public class ShapeTester {
    public static void main(String[] args) {
        Rectangle4 rect = new Rectangle4(5, 10);
        Box4 box = new Box4(5, 10, 5);
        Cube4 cube = new Cube4(5);
        HyperRectangle rectPrism = new HyperRectangle(5, 10, 5, 10);
        Tesseract4 tesseract = new Tesseract4(5);
    
        System.out.println("My Shapes:");
        showEffectBoth(rect);
        showEffectBoth(box);
        showEffectBoth(cube);
        showEffectBoth(rectPrism);
        showEffectBoth(tesseract);

        System.out.println("Equality Test:");
        System.out.println("5 x 10 x 5 == 5 x 10 x 5: " + box.equals(box));
        System.out.println("5 x 10 == 7 x 10: " + rect.equals(new Rectangle4(7, 10)));

    }

    public static void showEffectBoth(Rectangle4 rect){
        System.out.println(rect);
    }
}

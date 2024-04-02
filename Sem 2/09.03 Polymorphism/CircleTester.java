// Gavin Perry, 2024-3-22, test all circle classes
import java.util.ArrayList;

public class CircleTester {
    public static void main(String[] args) {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(1, 2, 3));
        circles.add(new Cylinder2(4, 5, 6, 7));
        circles.add(new Oval2(8, 9, 10, 11));
        circles.add(new OvalCylinder2(12, 13, 14, 15, 16));
        for (Circle2 circle : circles) {
            showCenter(circle);
        }
    }

    public static void showCenter(Circle2 circle) {
        System.out.println("For this " + circle.getName() + " the center is at " + circle.getCenter());
    }
}

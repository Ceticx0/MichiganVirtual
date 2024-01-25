// Gavin Perry, 10/5/23, The purpose of this program is to display the hypotenuse of two right triangles with randomly generated sidelengths 
public class PyTheorem {
    public static void main(String[] args) {
        // 5 (inclusive) to 23 (exclusive)
        int a1 = (int) (Math.random() * 18 + 5);
        int b1 = (int) (Math.random() * 18 + 5);
        double c1 = Math.sqrt((Math.pow(a1, 2) + Math.pow(b1, 2)));

        System.out.printf("Triangle 1\ta: %d, b: %d, hypotenuse: %s\n", a1, b1, c1);

        int a2 = (int) (Math.random() * 18 + 5);
        int b2 = (int) (Math.random() * 18 + 5);
        double c2 = Math.sqrt((Math.pow(a2, 2) + Math.pow(b2, 2)));

        System.out.printf("Triangle 2\ta: %d, b: %d, hypotenuse: %s\n", a2, b2, c2);
    }
}

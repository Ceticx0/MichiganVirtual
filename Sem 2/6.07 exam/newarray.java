public class newarray {

    public static void main(String[] args) {
        System.out.println(evenNumArray());
    }
    public int evenNumArray() {
        int[] fiveEven = {2, 4 , 6, 8, 10};
        int product = 1;
        for (int num : fiveEven) {
          product *= num;
        }
        return product;
      }
}

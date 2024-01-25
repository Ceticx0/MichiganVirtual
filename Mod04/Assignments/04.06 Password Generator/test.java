public class test {
    public static void main(String[] args) {
        String greet1 = "Good Morning!";

    String greet2 = "Good Afternoon!";
    int result;

    if (greet1.compareTo(greet2) > 0){
    result = 1;
    }else if (greet1.compareTo(greet2) < 0){
    result = -1;
    }else{
    result = 0;}
    }
    System.out.println(result);
}
// Gavin Perry, 9/7/23, The purpose of this program is to determine the total points and average score for a set number of test grades using doubles and integers.
public class GradesV2 {
    public static void main(String[] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        testGrade = 95;
        numTests++;
        totalPoints += testGrade;
        average = (double)testGrade;
        System.out.printf("Test # %d\tTest Grade: %d\tTotal Points: %d\tAverage Score %f\n", numTests, testGrade, totalPoints, average);

        testGrade = 73;
        numTests++;
        totalPoints += testGrade;
        // accumulative average
        average = ((average * (numTests-1)) + testGrade) / numTests;
        System.out.printf("Test # %d\tTest Grade: %d\tTotal Points: %d\tAverage Score %f\n", numTests, testGrade, totalPoints, average);

        testGrade = 91;
        numTests++;
        totalPoints += testGrade;
        // accumulative average
        average = ((average * (numTests-1)) + testGrade) / numTests;
        System.out.printf("Test # %d\tTest Grade: %d\tTotal Points: %d\tAverage Score %f\n", numTests, testGrade, totalPoints, average);

        testGrade = 82;
        numTests++;
        totalPoints += testGrade;
        // accumulative average
        average = ((average * (numTests-1)) + testGrade) / numTests;
        System.out.printf("Test # %d\tTest Grade: %d\tTotal Points: %d\tAverage Score %f\n", numTests, testGrade, totalPoints, average);
        
        //testing
    }
}

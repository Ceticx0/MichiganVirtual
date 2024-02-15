// Gavin Perry, 2/2/2024, Test Gradebook class and format output
public class GradeBookTester {

  public static void main(String[] args) {
    Double sem1Grade1 = 90.9;
    Double sem2Grade1 = 85.8;

    Double sem1Grade2 = 80.1;
    Double sem2Grade2 = 75.3;
    
    Double sem1Grade3 = 27.2;
    Double sem2Grade3 = 100.5;

    Double gradeAverage;
    GradeBook[] gradeBooks = {new GradeBook(sem1Grade1, sem2Grade2), new GradeBook(sem1Grade2, sem2Grade2), new GradeBook(sem1Grade3, sem2Grade3)};
    System.out.println("Semester Grades");
    System.out.println(String.format("%15s\t%15s\t%15s\t%15s", "Sem 1 Grade", "Sem 2 Grade", "Difference", "Average"));
    System.out.println("===============================================================");
    for (GradeBook gb : gradeBooks) {
      gradeAverage = gb.calcAverage(gb.getSem1Grade(), gb.getSem2Grade());
      System.out.println(gb + "\t" + String.format("%15.2f", gradeAverage));
    }
    System.out.println("===============================================================");

  }

}

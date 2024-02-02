public class GradeBookTester {

  public static void main(String[] args) {
    Double sem1Grade1 = 90.9;
    Double sem2Grade1 = 85.8;

    Double sem1Grade2 = 80.1;
    Double sem2Grade2 = 75.3;
    
    Double sem1Grade3 = 27.2;
    Double sem2Grade3 = 100.5;

    Double finalGrade;
    GradeBook[] gradeBooks = {new GradeBook(sem1Grade1, sem2Grade2), new GradeBook(sem1Grade2, sem2Grade2), new GradeBook(sem1Grade3, sem2Grade3)};

    System.out.println("=======================================");
    for (GradeBook gb : gradeBooks) {
      finalGrade = gb.calcGrade();
      System.out.println(gb);
    }
    System.out.println("=======================================");

  }

}

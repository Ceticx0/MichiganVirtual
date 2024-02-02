public class GradeBook
{
   private double sem1Grade;
   private double sem2Grade;

   //one parameter constructor, all private instance variables initialized
   public GradeBook() {
      sem1Grade = 0.0;
      sem2Grade = 0.0; 
   }

   //two parameter constructor
   public GradeBook(Double sem1Grade, Double sem2Grade){
      this.sem1Grade = sem1Grade;
      this.sem2Grade = sem2Grade;
   }
   
   public double getSem1Grade() {
      return sem1Grade;
   }

   public void setSem1Grade(double sem1Grade) {
      this.sem1Grade = sem1Grade;
   }

   public double getSem2Grade() {
      return sem2Grade;
   }

   public void setSem2Grade(double sem2Grade) {
      this.sem2Grade = sem2Grade;
   }

   public double calcGrade()
   {
       double finalGrade = (sem1Grade + sem2Grade) / 2;
       return finalGrade;
   }
   
   //overloaded method
   public double calcDifference(double grade1, double grade2)
   {
      double difference = grade2 - grade1;
      return difference;
   }

   public String toString() {
      return String.format("Semester 1 Grade: %.2f\nSemester 2 Grade: %.2f\nFinal Grade %.2f\n", getSem1Grade(), getSem2Grade(), calcDifference());
   }
    
}

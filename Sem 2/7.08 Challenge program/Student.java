// Gavin Perry, 2024-2-16, Create class to represent student with 5 test scores.
public class Student {
    private String name;
    private double[] quizScores = new double[5];
    
    public Student(String name, double[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }

    public double getQuizScore(int number) {
        return quizScores[number - 1];
    }

    public void setQuizScore(int number, double score) {
        quizScores[number - 1] = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return String.format("%s: %.2f, %.2f, %.2f, %.2f, %.2f", name, quizScores[0], quizScores[1], quizScores[2], quizScores[3], quizScores[4]);
    }

}

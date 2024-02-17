// Gavin Perry, 2024-2-16, Test student class with arraylist of students and various methods.
import java.util.ArrayList;

public interface StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John Student", new double[] {100, 100, 100, 100, 100.0}));
        students.add(new Student("Grace Grace", new double[] {90.2, 80.8, 70.4, 60, 50}));
        students.add(new Student("ROB ROBBER", new double[] {80.4, 70.2, 60.7, 50.5, 40.9}));
        students.add(new Student("Obma Heussin", new double[] {70.5, 60.10, 50.47, 40.1, 30.99}));
        students.add(new Student("Hannah montague", new double[] {60.87, 50.7, 40.6, 30.5, 20.01}));

        // Test all methods and display scores before and after.
        printScores(students);
        System.out.println();
        System.out.println("Replace John Student's name with John Doe");
        replaceStudentName(students, "John Student", "John Doe");
        printScores(students);
        System.out.println();
        System.out.println("Replace Grace Grace's quiz 1 score with 100");
        replaceQuizScore(students, "Grace Grace", 1, 100);
        printScores(students);
        System.out.println();
        System.out.println("Replace ROB ROBBER's name with Rob Giver and quiz scores with 100, 100, 100, 100, 100");
        replaceStudent(students, "ROB ROBBER", "Rob Giver", new double[] {100, 100, 100, 100, 100});
        printScores(students);
        System.out.println();
        System.out.println("Add a student named John Class with quiz scores 100, 100, 100, 100, 100 before Obma Heussin");
        addStudentBefore(students, "Obma Heussin", "John Class", new double[] {100, 100, 100, 100, 100});
        printScores(students);
        System.out.println();
        System.out.println("Delete Hannah montague");
        deleteStudent(students, "Hannah montague");
        printScores(students);

    }

    public static void printScores(ArrayList<Student> students) {
        System.out.printf("%20s\t%6s\t%6s\t%6s\t%6s\t%6s%n", "Name", "Quiz 1", "Quiz 2", "Quiz 3", "Quiz 4", "Quiz 5");
        System.out.println("=======================================================================");
        for (Student student : students) {
            if (student != null) {
                System.out.printf("%20.20s\t%6.2f\t%6.2f\t%6.2f\t%6.2f\t%6.2f%n", student.getName(), student.getQuizScore(1), student.getQuizScore(2), student.getQuizScore(3), student.getQuizScore(4), student.getQuizScore(5));
            }
        }
    }

    public static void replaceStudentName(ArrayList<Student> students, String oldName, String newName) {
        for (Student student : students) {
            if (student != null && student.getName().equals(oldName)) {
                student.setName(newName);
            }
        }
    }

    public static void replaceQuizScore(ArrayList<Student> students, String findName, int quizNumber, double newScore) {
        for (Student student : students) {
            if (student != null && student.getName().equals(findName)) {
                student.setQuizScore(quizNumber, newScore);
            }
        }
    }

    public static void replaceStudent(ArrayList<Student> students, String findName, String newName, double[] newScores) {
        for (Student student : students) {
            if (student != null && student.getName().equals(findName)) {
                student.setName(newName);
                for (int i = 0; i < newScores.length; i++) {
                    student.setQuizScore(i + 1, newScores[i]);
                }
            }
        }
    }

    public static void addStudentBefore(ArrayList<Student> students, String findName, String newName, double[] newScores) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName().equals(findName)) {
                students.add(i, new Student(newName, newScores));
                break;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> students, String findName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName().equals(findName)) {
                students.remove(i);
                break;
            }
        }
    }
}

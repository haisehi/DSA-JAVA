package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

//Exercise 7: List of students
// Write a program to:
//
// Enter a list of students (including name and score, save as ArrayList).
// Find the student with the highest score.
// Find the student with a score lower than 5 and print that list.
// Example:
//
// Input: ["Lan 8.5", "Minh 6.0", "Huy 4.0", "Nga 9.0"]
// Output:
// Student with the highest score: Nga 9.0
// Student with a score lower than 5: Huy 4.0
public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input list of students
        System.out.println("Enter student names and scores (e.g., 'Lan 8.5'), separated by commas:");
        String input = scanner.nextLine();
        String[] studentEntries = input.split(",\\s*");

        // Parse input into an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();
        for (String entry : studentEntries) {
            String[] parts = entry.split(" ");
            String name = parts[0];
            double score = Double.parseDouble(parts[1]);
            students.add(new Student(name, score));
        }

        // Find the student with the highest score
        Student highestScorer = students.get(0);
        for (Student student : students) {
            if (student.getScore() > highestScorer.getScore()) {
                highestScorer = student;
            }
        }

        // Find students with scores lower than 5
        ArrayList<Student> lowScorers = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() < 5) {
                lowScorers.add(student);
            }
        }

        // Print results
        System.out.println("Student with the highest score: " + highestScorer);
        System.out.println("Students with scores lower than 5:");
        for (Student lowScorer : lowScorers) {
            System.out.println(lowScorer);
        }
    }
}

// Student class
class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

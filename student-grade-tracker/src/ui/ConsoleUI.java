import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    private GradeTracker gradeTracker;

    public ConsoleUI(GradeTracker gradeTracker) {
        this.scanner = new Scanner(System.in);
        this.gradeTracker = gradeTracker;
    }

    public void displayMenu() {
        System.out.println("Welcome to the Student Grade Tracker");
        System.out.println("1. Add Student");
        System.out.println("2. Show Summary Report");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    public void getUserInput() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                showSummaryReport();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grades (comma separated): ");
        String[] gradesInput = scanner.nextLine().split(",");
        ArrayList<Integer> grades = new ArrayList<>();

        for (String grade : gradesInput) {
            grades.add(Integer.parseInt(grade.trim()));
        }

        Student student = new Student(name, grades);
        gradeTracker.addStudent(student);
        System.out.println("Student added successfully!");
    }

    public void showSummaryReport() {
        ArrayList<Student> students = gradeTracker.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Summary Report:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Average: " + student.getAverage());
            System.out.println("Highest Grade: " + student.getHighestGrade());
            System.out.println("Lowest Grade: " + student.getLowestGrade());
            System.out.println("---------------------------");
        }
    }
}
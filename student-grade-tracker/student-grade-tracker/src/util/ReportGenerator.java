import java.util.List;

public class ReportGenerator {

    public String generateReport(List<Student> students) {
        StringBuilder report = new StringBuilder();
        report.append("Student Grade Summary Report\n");
        report.append("=================================\n");

        for (Student student : students) {
            report.append("Name: ").append(student.getName()).append("\n");
            report.append("Grades: ").append(student.getGrades()).append("\n");
            report.append("Average: ").append(student.getAverage()).append("\n");
            report.append("Highest Grade: ").append(student.getHighestGrade()).append("\n");
            report.append("Lowest Grade: ").append(student.getLowestGrade()).append("\n");
            report.append("---------------------------------\n");
        }

        return report.toString();
    }
}
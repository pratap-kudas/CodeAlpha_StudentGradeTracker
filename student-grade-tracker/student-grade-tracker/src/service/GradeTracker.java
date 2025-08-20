package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private List<Student> students;

    public GradeTracker() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Student student : students) {
            total += student.getAverage();
        }
        return total / students.size();
    }
}
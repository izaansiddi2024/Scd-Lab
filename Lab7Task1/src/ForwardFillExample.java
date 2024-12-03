import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ForwardFillExample {

    public static void main(String[] args) {
        // Step 1: Define a list of student data (mimicking a DataFrame)
        List<Map<String, Object>> students = new ArrayList<>();

        // Step 2: Add student data with missing values (null)
        students.add(createStudent("Alice", 85.0, 90.0, null));
        students.add(createStudent("Bob", null, 85.0, 82.0));
        students.add(createStudent("Charlie", 78.0, null, 80.0));
        students.add(createStudent("David", null, 88.0, 75.0));
        students.add(createStudent("Eve", 92.0, 95.0, null));

        // Step 3: Perform forward fill
        Map<String, Object> lastValidRow = new LinkedHashMap<>();
        for (Map<String, Object> student : students) {
            for (String key : student.keySet()) {
                if (student.get(key) == null) {
                    student.put(key, lastValidRow.get(key)); // Fill missing value
                } else {
                    lastValidRow.put(key, student.get(key)); // Update last valid value
                }
            }
        }

        // Step 4: Print the updated data
        System.out.println("Student Data after Forward Fill:");
        for (Map<String, Object> student : students) {
            System.out.println(student);
        }
    }

    // Helper method to create a student's data
    private static Map<String, Object> createStudent(String name, Double math, Double science, Double english) {
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("Student", name);
        student.put("Math", math);
        student.put("Science", science);
        student.put("English", english);
        return student;
    }
}

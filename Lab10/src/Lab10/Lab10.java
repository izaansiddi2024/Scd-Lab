package Lab10;

public class Lab10 {
 public static void main(String[] args) {
     // Creating a Failed Student (Immutable)
     FailedStudent failedStudent = new FailedStudent(101, "CS101", "Computer Science");
     System.out.println("Failed Student: ");
     System.out.println("Roll Number: " + failedStudent.getRollNumber());
     System.out.println("Subject Code: " + failedStudent.getSubjectCode());
     System.out.println("Subject Name: " + failedStudent.getSubjectName());

     // Creating a Promoted Student (Mutable)
     PromotedStudent promotedStudent = new PromotedStudent(102, "CS102", "Mathematics");
     System.out.println("\nPromoted Student: ");
     System.out.println("Roll Number: " + promotedStudent.getRollNumber());
     System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
     System.out.println("Subject Name: " + promotedStudent.getSubjectName());

     // Modifying the Promoted Student's details
     promotedStudent.setRollNumber(103);
     promotedStudent.setSubjectCode("CS103");
     promotedStudent.setSubjectName("Physics");

     System.out.println("\nUpdated Promoted Student: ");
     System.out.println("Roll Number: " + promotedStudent.getRollNumber());
     System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
     System.out.println("Subject Name: " + promotedStudent.getSubjectName());
 }
}
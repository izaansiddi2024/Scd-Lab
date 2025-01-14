package Lab10;

//Immutable Class for Failed Students
final class FailedStudent {
private final int rollNumber;
private final String subjectCode;
private final String subjectName;

// Constructor to initialize the fields
public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
   this.rollNumber = rollNumber;
   this.subjectCode = subjectCode;
   this.subjectName = subjectName;
}

// Getter methods to access the fields
public int getRollNumber() {
   return rollNumber;
}

public String getSubjectCode() {
   return subjectCode;
}

public String getSubjectName() {
   return subjectName;
}
}

//Mutable Class for Promoted Students
class PromotedStudent {
private int rollNumber;
private String subjectCode;
private String subjectName;

// Constructor to initialize the fields
public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
   this.rollNumber = rollNumber;
   this.subjectCode = subjectCode;
   this.subjectName = subjectName;
}

// Getter methods to access the fields
public int getRollNumber() {
   return rollNumber;
}

public String getSubjectCode() {
   return subjectCode;
}

public String getSubjectName() {
   return subjectName;
}

// Setter methods to modify the fields (Mutable behavior)
public void setRollNumber(int rollNumber) {
   this.rollNumber = rollNumber;
}

public void setSubjectCode(String subjectCode) {
   this.subjectCode = subjectCode;
}

public void setSubjectName(String subjectName) {
   this.subjectName = subjectName;
}
}

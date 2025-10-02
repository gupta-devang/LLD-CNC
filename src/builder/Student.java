package builder;

public class Student {
  int rollNumber;
  String name;
  String fatherName;
  String motherName;

  public Student(StudentBuilder builder) {
    this.rollNumber = builder.rollNumber;
    this.name = builder.name;
    this.fatherName = builder.fatherName;
    this.motherName = builder.motherName;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public String getName() {
    return name;
  }

  public String getFatherName() {
    return fatherName;
  }

  public String getMotherName() {
    return motherName;
  }
}

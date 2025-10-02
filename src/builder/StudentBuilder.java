package builder;

public class StudentBuilder {
  int rollNumber;
  String name;
  String fatherName;
  String motherName;

  public StudentBuilder setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
    return this;
  }

  public StudentBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public StudentBuilder setFatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;
  }

  public StudentBuilder setMotherName(String motherName) {
    this.motherName = motherName;
    return this;
  }
  public Student build() {
    return new Student(this);
  }
}

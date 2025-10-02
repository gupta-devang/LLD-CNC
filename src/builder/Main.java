package builder;

public class Main {
  public static void main(String[] args) {
    StudentBuilder sb = new StudentBuilder();
    Student build = sb.setRollNumber(123).setFatherName("Avinash").setName("Devang").build();

  }
}

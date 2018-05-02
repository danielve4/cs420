package assignment5;

public class DanielStudentPersonType extends DanielAbstractPerson {

  String[] classesTaken;
  String major;
  
  public DanielStudentPersonType() {
    super();
    this.classesTaken = null;
    this.major = "major";
  }
  
  public DanielStudentPersonType(String firstName, String lastName) {
    super(firstName, lastName);
  }

  public DanielStudentPersonType(String firstName, String lastName, String[] classes, String address, String major, int age) {
    super(firstName, lastName, address, age);
    this.classesTaken = classes;
    this.major = major;
  }

  @Override
  public int compareTo(String fullName) {
    String thisFullName = this.getFullName();
    return thisFullName.compareTo(fullName);
  }
  
  public String toString() {
    return "Full Name: " + firstName + " " + lastName + " - Age: " + age;
  }
}

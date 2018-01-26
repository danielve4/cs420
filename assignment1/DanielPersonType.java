package assignment1;

class DanielPersonType implements Comparable<DanielPersonType> {

  private String firstName;
  private String lastName;

  public DanielPersonType() {
    this.firstName = "FirstName";
    this.lastName = "LastName";
  }

  public DanielPersonType(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DanielPersonType getCopy() {
    return new DanielPersonType(this.firstName, this.lastName);
  }

  @Override
  public int compareTo(DanielPersonType other) {
    String thisFullName = this.lastName+this.firstName;
    String otherFullName = other.getLastName()+other.getFirstName();
    return thisFullName.compareTo(otherFullName);    
  }

  public String toString() {
    return "First Name: " + firstName + " - Last Name: " + lastName;
  }
}

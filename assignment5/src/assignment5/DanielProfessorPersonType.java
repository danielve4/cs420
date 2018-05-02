package assignment5;

public class DanielProfessorPersonType extends DanielAbstractPerson {

  
  private String[] classesTeaching;
  private int numberClassesTeaching;
  private final int MAX_NUM_CLASSES=10;
  
  public DanielProfessorPersonType() {
    super();
    this.numberClassesTeaching = 0;
    this.classesTeaching = new String[MAX_NUM_CLASSES];
  }
  
  public DanielProfessorPersonType(String firstName, String lastName) {
    super(firstName, lastName);
    this.numberClassesTeaching = 0;
    this.classesTeaching = new String[MAX_NUM_CLASSES];
  }
  
  public DanielProfessorPersonType(String firstName, String lastName, String[] classes, String address, int age, int numClasses) {
    super(firstName, lastName, address, age);
    this.numberClassesTeaching = numClasses;
    this.classesTeaching = classes;
  }
  
  public String[] getClassesTeaching() {
    return this.classesTeaching;
  }
  
  public int getNumClassesTeaching() {
    return this.numberClassesTeaching;
  }
  
  public void setClassesTeaching(String[] classes) {
    this.classesTeaching = classes;
  }
  
  public void setNumClassesTeaching(int numClasses) {
    this.numberClassesTeaching = numClasses;
  }
  
  public boolean addClassTeaching(String aClass) {
    if(this.numberClassesTeaching < this.MAX_NUM_CLASSES) {
      this.classesTeaching[this.numberClassesTeaching] = aClass;
    this.numberClassesTeaching++;
    return true;
    }
    return false;
  }

  @Override
  public int compareTo(String fullName) {
    String thisFullName = this.getFullName();
    return thisFullName.compareTo(fullName);
  }
  
  public String toString() {
    String str = "Full Name: " + firstName + " " + lastName + " - Age: " + age + "\n" + "Teaching: ";
    for(int i=0;i<this.numberClassesTeaching;i++) {
      str+= this.classesTeaching[i] + ", "; 
    }
    return str;
  }
}

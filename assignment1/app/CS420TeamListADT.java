package assignment1.app;
import java.util.Scanner;
import java.util.Arrays;

class CS420TeamListADT {
  
  private final int DEFAULT_TEAM_SIZE = 100;
  private int maxTeamSize;
  private DanielPersonType[] team;
  private int teamSize;

  public CS420TeamListADT() {
    this.maxTeamSize = DEFAULT_TEAM_SIZE;
    this.team = new DanielPersonType[maxTeamSize];
    this.teamSize = 0;
  }

  public CS420TeamListADT(int maxTeamSize) {
    this.maxTeamSize = maxTeamSize;
    this.team = new DanielPersonType[maxTeamSize];
    this.teamSize = 0;
  }

  public CS420TeamListADT(int maxTeamSize, DanielPersonType[] team, int teamSize) {
    this.maxTeamSize = maxTeamSize;
    this.team = team;
    this.teamSize = teamSize;
  }

  public DanielPersonType[] getTeam() {
    DanielPersonType[] teamCopy = new DanielPersonType[teamSize];
    for(int i=0; i < this.teamSize; i++)
      teamCopy[i] = this.team[i].getCopy();
    return teamCopy;
  }

  public DanielPersonType getTeamMember(int index) {
    return team[index].getCopy();
  }

  public void addPerson(DanielPersonType aPerson) {
    this.team[teamSize] = aPerson;
    this.teamSize++;
  }

  public void addPersonFromInput(Scanner scanner) {
    scanner.nextLine();
    String fName;
    String lName;
    System.out.print("Enter person's first name\n> ");
    fName = scanner.next();
    System.out.print("Enter person's last name\n> ");
    lName = scanner.next();
    addPerson(new DanielPersonType(fName.trim(), lName.trim()));
    System.out.print("\nPerson Added!");
  }

  public void deleteLastPerson() {
    this.teamSize -= 1;
  }

  public void searchByKeyword(Scanner scanner) {
    scanner.nextLine();
    System.out.print("Enter keyword to search by\n> ");
    String key = scanner.nextLine();
    System.out.print("\n\n");
    int numberFound=0;
    for(int i=0; i < this.teamSize; i++) {
      if(this.team[i].getFirstName().toLowerCase().contains(key.toLowerCase())
      || this.team[i].getLastName().toLowerCase().contains(key.toLowerCase())) {
        System.out.println(this.team[i].toString());
        numberFound++;
      }
    }
    if(numberFound == 0)
    System.out.println("No person found!");
  }

  public void sort() {
    Arrays.sort(team, 0, teamSize);
  }

  public String toString() {
    if(teamSize == 0) 
      return "The team is empty!";
    String str = "";
    for(int i=0; i < this.teamSize; i++)
      str += "Num: " + i + " - " + this.team[i].toString() + "\n";
    return str;
  }
}

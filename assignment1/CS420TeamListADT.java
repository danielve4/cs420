package assignment1;
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

  public void deleteLastPerson() {
    this.teamSize -= 1;
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

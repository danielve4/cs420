package assignment2;
import java.util.Arrays;

public class CS420TeamListADT implements BoundedStackInterface<DanielPersonType> {
  
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
  
  public int getTeamSize() {
    return this.teamSize;
  }

  public DanielPersonType getTeamMember(int index) {
    return team[index].getCopy();
  }

  @Override
  public void push(DanielPersonType aPerson) throws DanielStackOverFlowException {
    if(this.isFull())
       throw new DanielStackOverFlowException("The stack is full");
    this.team[teamSize] = aPerson;
    this.teamSize++;
  }

  @Override
  public void pop() {
    this.teamSize -= 1;
  }
  
  @Override
  public DanielPersonType top() {
    return this.team[this.teamSize-1];
  }
  
  @Override
  public boolean isEmpty() {
    return this.teamSize == 0 ? true : false;
  }
  
  @Override
  public boolean isFull() {
    return teamSize == maxTeamSize ? true :  false;
  }

  public void sort() {
    Arrays.sort(team, 0, teamSize);
  }

  @Override
  public String toString() {
    if(teamSize == 0) 
      return "The team is empty!";
    String str = "";
    for(int i=0; i < this.teamSize; i++)
      str += "Num: " + i + " - " + this.team[i].toString() + "\n";
    return str;
  }
}

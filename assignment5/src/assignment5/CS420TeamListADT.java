package assignment5;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class CS420TeamListADT<T> implements BoundedStackInterface<T> {
  
  private final int DEFAULT_TEAM_SIZE = 100;
  private int maxTeamSize;
  private ArrayList<T> team;
  private int teamSize;

  public CS420TeamListADT() {
    this.maxTeamSize = DEFAULT_TEAM_SIZE;
    this.team = new ArrayList<T>(DEFAULT_TEAM_SIZE);
    this.teamSize = 0;
  }

  public CS420TeamListADT(int maxTeamSize) {
    this.maxTeamSize = maxTeamSize;
    this.team = new ArrayList<T>(maxTeamSize);
    this.teamSize = 0;
  }

  public CS420TeamListADT(int maxTeamSize, ArrayList<T> team, int teamSize) {
    this.maxTeamSize = maxTeamSize;
    this.team = team;
    this.teamSize = teamSize;
  }

  public ArrayList<T> getTeam() {
    return this.team;
  }
  
  public int getTeamSize() {
    return this.teamSize;
  }

  public T getTeamMember(int index) {
    return team.get(index);//.getCopy();
  }

  @Override
  public void push(T aPerson) throws DanielStackOverFlowException {
    if(this.isFull())
       throw new DanielStackOverFlowException("The stack is full");
    this.team.add(aPerson);//[teamSize] = aPerson;
    this.teamSize++;
  }

  @Override
  public void pop() {
    this.team.remove(teamSize-1);
    this.teamSize -= 1;
  }
  
  @Override
  public T top() {
    return this.team.get(this.teamSize-1);//[this.teamSize-1];
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
    // Arrays.sort(team, 0, teamSize);
    //Collections.sort(this.team);
  }

  @Override
  public String toString() {
    if(teamSize == 0) 
      return "The team is empty!";
    String str = "";
    for(int i=0; i < this.teamSize; i++)
      str += "Num: " + i + " - " + this.team.get(i).toString() + "\n";
    return str;
  }
}

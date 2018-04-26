package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import assignment4.*;

class DanielAssignment2Test {
  
  @Test
  void teamIsEmptyTest() {
    CS420TeamListADT team = new CS420TeamListADT(1);
    assertTrue(team.isEmpty());
    try {
      team.push(new DanielPersonType());
    } catch (DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    assertFalse(team.isEmpty());
  }

  @Test
  void teamIsFullTest() {
    CS420TeamListADT team = new CS420TeamListADT(1);
    assertFalse(team.isFull());
    try {
      team.push(new DanielPersonType());
    } catch (DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    assertTrue(team.isFull());
  }
  
  @Test 
  void teamPopTest() {
    CS420TeamListADT team = new CS420TeamListADT(2);
    try {
      team.push(new DanielPersonType());
      team.push(new DanielPersonType());
    } catch (DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    team.pop();
    assertEquals(1, team.getTeamSize());
  }
  
  @Test 
  void teamTopTest() {
    DanielPersonType person = new DanielPersonType("Daniel", "Vega");
    CS420TeamListADT team = new CS420TeamListADT(2);
    try {
      team.push(new DanielPersonType());
      team.push(person);
    } catch (DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    assertTrue(team.top().equals(person));
  }
  
  @Test 
  void teamPushTest() {
    DanielPersonType person = new DanielPersonType("Daniel", "Vega");
    CS420TeamListADT team = new CS420TeamListADT(1);
    try {
      team.push(person);
    } catch (DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    assertTrue(team.top().equals(person));
    assertEquals(1, team.getTeamSize());
  }
   
}

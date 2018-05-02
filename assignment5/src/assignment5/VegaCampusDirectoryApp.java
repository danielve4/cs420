package assignment5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class VegaCampusDirectoryApp {
  public static void main(String[] args) throws DanielStackUnderFlowException {
    CS420TeamListADT<DanielAbstractPerson> teamList = new CS420TeamListADT<>();
    //DanielBinaryTreeADT<DanielAbstractPerson> teamList = new DanielBinaryTreeADT<>(); 
    try {
      teamList.push(new DanielPersonType("Daniel", "Vega"));
      teamList.push(new DanielPersonType("Mario", "Vega"));
      teamList.push(new DanielPersonType("Tony", "Stark"));
      teamList.push(new DanielPersonType("Peter", "Parker"));
      teamList.push(new DanielPersonType("Steve", "Rogers"));
      teamList.push(new DanielStudentPersonType("Student", "Person"));
      teamList.push(new DanielProfessorPersonType("Professor", "TypePerson"));
    } catch(DanielStackOverFlowException e) {
      e.printStackTrace();
    }
    int input; // Variable to store input from user
    Scanner scanner = new Scanner(System.in);
    do {
      printInstructions();
      while(!scanner.hasNextInt()) { // If a number is not entered, ask again
        System.out.print("Please enter a number\n> ");
        scanner.next();
      }
      input = scanner.nextInt();
      handleInput(input, teamList, scanner); // Call method to handle input from user
    } while(input != 0);
    scanner.close();
  }
  
  public static void printInstructions() {
    String instructions = "Enter an option\n" +
      "1 - Add Person\n" + 
      "2 - List Directory\n" + 
      "3 - Delete Last Team Member\n" +
      "4 - Search by keyword\n" +
      "5 - Sort by last name\n" +
      "6 - Write Team Members to File\n" + 
      "0 - Exit\n" + 
      "> ";
    System.out.print("\n\n" + instructions);
  }
  
  public static void handleInput(int input, BoundedStackInterface<DanielAbstractPerson> teamList, Scanner scanner) throws DanielStackUnderFlowException {
    switch(input) {
      case 0:
        System.out.println("Goodbye!"); 
      break;
      case 1:
        addPersonFromInput(teamList, scanner);
      break;
      case 2: 
        System.out.println("\n\n" + teamList.toString());
      break;
      case 3: 
        teamList.pop();
      break;
      case 4:
        searchByKeyword(teamList, scanner);
      break;
      case 5:
        teamList.sort();
      break;
      case 6:
        writeToFile(teamList);
      break;
      default:
        System.out.println("Please enter a valid option");
      break;
    }
  }
  
  public static void addPersonFromInput(BoundedStackInterface<DanielAbstractPerson> teamList, Scanner scanner) {
    scanner.nextLine();
    String fName;
    String lName;
    System.out.print("Enter person's first name\n> ");
    fName = scanner.next();
    System.out.print("Enter person's last name\n> ");
    lName = scanner.next();
    try {
      teamList.push(new DanielPersonType(fName.trim(), lName.trim()));
      System.out.print("\nPerson Added!");
    } catch (DanielStackOverFlowException e) {
      System.out.println(e);
    }
  }
  
  public static void writeToFile(BoundedStackInterface<DanielAbstractPerson> teamList) {
    try {  
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("The following are the names in the team:\n\n");
      writer.write(teamList.toString());
      writer.close();
      System.out.println("\n-------The team has been written to 'output.txt'");
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void searchByKeyword(BoundedStackInterface<DanielAbstractPerson> teamList, Scanner scanner) {
    scanner.nextLine();
    System.out.print("Enter keyword to search by\n> ");
    String key = scanner.nextLine();
    System.out.print("\n\n");
    int numberFound=0;
    try {
      ArrayList<DanielAbstractPerson> team = teamList.getTeam();
    
      DanielPersonType aDan;
      for(int i=0; i < team.size(); i++) {
        aDan = (DanielPersonType)team.get(i);
        if(aDan.getFirstName().toLowerCase().contains(key.toLowerCase())
        || aDan.getLastName().toLowerCase().contains(key.toLowerCase())) {
          System.out.println(aDan.toString());
          numberFound++;
        }
      }
      if(numberFound == 0)
        System.out.println("No person found!");
    } catch (DanielStackOverFlowException e) {
      System.out.println(e);
    }
  }
}

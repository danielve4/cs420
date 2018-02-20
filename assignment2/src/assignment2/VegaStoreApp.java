package assignment2;
import java.util.Scanner;

class VegaStoreApp {
  public static void main(String[] args) {
    CS420TeamListADT teamList = new CS420TeamListADT(); // Creates a TeamList object
    teamList.addPerson(new DanielPersonType("Daniel", "Vega"));
    teamList.addPerson(new DanielPersonType("Mario", "Vega"));
    teamList.addPerson(new DanielPersonType("Tony", "Stark"));
    teamList.addPerson(new DanielPersonType("Peter", "Parker"));
    teamList.addPerson(new DanielPersonType("Steve", "Rogers"));
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
      "1 - Add Team Member\n" + 
      "2 - List Team Members\n" + 
      "3 - Delete Last Team Member\n" +
      "4 - Search by keyword\n" +
      "5 - Sort by last name\n" +
      "0 - Exit\n" + 
      "> ";
    System.out.print("\n\n" + instructions);
  }

  public static void handleInput(int input, CS420TeamListADT teamList, Scanner scanner) {
    switch(input) {
      case 0:
        System.out.println("Goodbye!"); 
      break;
      case 1:
        teamList.addPersonFromInput(scanner);
      break;
      case 2: 
        System.out.println("\n\n" + teamList.toString());
      break;
      case 3: 
        teamList.deleteLastPerson();
      break;
      case 4:
        teamList.searchByKeyword(scanner);
      break;
      case 5:
        teamList.sort();
      break;
      default:
        System.out.println("Please enter a valid option");
      break;
    }
  }
}

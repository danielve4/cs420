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
        addPersonFromInput(teamList, scanner);
      break;
      case 2: 
        System.out.println("\n\n" + teamList.toString());
      break;
      case 3: 
        teamList.deleteLastPerson();
      break;
      case 4:
        searchByKeyword(teamList, scanner);
      break;
      case 5:
        teamList.sort();
      break;
      default:
        System.out.println("Please enter a valid option");
      break;
    }
  }

  public static void addPersonFromInput(CS420TeamListADT teamList, Scanner scanner) {
    scanner.nextLine();
    String fName;
    String lName;
    System.out.print("Enter person's first name\n> ");
    fName = scanner.next();
    System.out.print("Enter person's last name\n> ");
    lName = scanner.next();
    teamList.addPerson(new DanielPersonType(fName.trim(), lName.trim()));
    System.out.print("\nPerson Added!");
  }

  public static void searchByKeyword(CS420TeamListADT teamList, Scanner scanner) {
    scanner.nextLine();
    System.out.print("Enter keyword to search by\n> ");
    String key = scanner.nextLine();
    System.out.print("\n\n");
    int numberFound=0;
    DanielPersonType[] team = teamList.getTeam();
    for(int i=0; i < team.length; i++) {
      if(team[i].getFirstName().toLowerCase().contains(key.toLowerCase())
      || team[i].getLastName().toLowerCase().contains(key.toLowerCase())) {
        System.out.println(team[i].toString());
        numberFound++;
      }
    }
    if(numberFound == 0)
      System.out.println("No person found!");
  }
}

Author: Daniel Vega
Assignment 3

To compile the files, run the following command:

  javac *.javac

To run the application, run the following command:

  java VegaStoreApp

The application stores the first and last name of a person in a team.
You can add another person, view existing team members, delete, sort, and search.
By default, I have initialized the app with 5 members but this can be changed in the
VegaStoreApp.java file. The DanielTeamListADT now implements the 
BoundedStackInterface along with all of its methods. The VegaStoreApp uses a try catch
when attempting to push any new team members. 

I have also included five basic jUnit tests that deal with pushing/popping and checking
the stack to see if it is full, empty, and the top of the stack. 

This Assignment now uses Generics in place of using a single Class Name.
In the Application class, when you want to change the type of class used,
change DanielPersonType to the class of your choosing.

Here is some sample output:

  Enter an option
  1 - Add Team Member
  2 - List Team Members
  3 - Delete Last Team Member
  4 - Search by keyword
  5 - Sort by last name
  0 - Exit
  > 2

  Num: 0 - First Name: Daniel - Last Name: Vega
  Num: 1 - First Name: Mario - Last Name: Vega
  Num: 2 - First Name: Tony - Last Name: Stark
  Num: 3 - First Name: Peter - Last Name: Parker
  Num: 4 - First Name: Steve - Last Name: Rogers

  ---------------------------------------------------------------------

  Enter an option
  1 - Add Team Member
  2 - List Team Members
  3 - Delete Last Team Member
  4 - Search by keyword
  5 - Sort by last name
  0 - Exit
  > 1
  Enter person's first name
  > John
  Enter person's last name
  > Smith

  Person Added!

  Enter an option
  1 - Add Team Member
  2 - List Team Members
  3 - Delete Last Team Member
  4 - Search by keyword
  5 - Sort by last name
  0 - Exit
  > 2

  Num: 0 - First Name: Daniel - Last Name: Vega
  Num: 1 - First Name: Mario - Last Name: Vega
  Num: 2 - First Name: Tony - Last Name: Stark
  Num: 3 - First Name: Peter - Last Name: Parker
  Num: 4 - First Name: Steve - Last Name: Rogers
  Num: 5 - First Name: John - Last Name: Smith

  ---------------------------------------------------------------------

  Enter an option
  1 - Add Team Member
  2 - List Team Members
  3 - Delete Last Team Member
  4 - Search by keyword
  5 - Sort by last name
  0 - Exit
  > 4
  Enter keyword to search by
  > vega

  First Name: Daniel - Last Name: Vega
  First Name: Mario - Last Name: Vega

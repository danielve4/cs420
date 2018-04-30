Author: Daniel Vega
Assignment4

To compile the files, run the following command:

  javac assignment4/*.javac

To run the application, run the following command:

  java assignment4.VegaStoreApp

The application stores the first and last name of a person in a team.
You can add another person, view existing team members, delete, sort, and search.
The application class reads from an input file called "input.txt".
The format of the input file is as follows:

  First Name
  Last Name
  .
  First Name
  Last Name
  .

Each name is separated by a period and the file terminates in a period
By default, the input file contains 6 members but this can be changed in the
input.txt file. 

The VegaStoreApp now uses DanielBinaryTree class as the ADT. The DanielBinaryTree has the same API
as the CS420TeamListADT class.
The CS420TeamListADT can be used instead of the DanielBinaryTree class with minimal changes
to the application class.
The DanielBinaryTree class uses CS420TeamListADT as a stack when traversing the tree.

I have also included five basic jUnit tests that deal with pushing/popping and checking
the stack to see if it is full, empty, and the top of the stack. 

Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 2


Num: 1 - First Name: Frida - Last Name: Kahlo
Num: 2 - First Name: Ada - Last Name: Lovelace
Num: 3 - First Name: Jackie - Last Name: Luna
Num: 4 - First Name: Peter - Last Name: Parker
Num: 5 - First Name: Tony - Last Name: Stark
Num: 6 - First Name: Daniel - Last Name: Vega



Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 1
Enter person's first name
> Richard
Enter person's last name
> Appleseed

Person Added!

Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 2


Num: 1 - First Name: Richard - Last Name: Appleseed
Num: 2 - First Name: Frida - Last Name: Kahlo
Num: 3 - First Name: Ada - Last Name: Lovelace
Num: 4 - First Name: Jackie - Last Name: Luna
Num: 5 - First Name: Peter - Last Name: Parker
Num: 6 - First Name: Tony - Last Name: Stark
Num: 7 - First Name: Daniel - Last Name: Vega



Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 4
Enter keyword to search by
> Vega


First Name: Daniel - Last Name: Vega


Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 6

-------The team has been written to 'output.txt'


Enter an option
1 - Add Team Member
2 - List Team Members
3 - Delete Last Team Member
4 - Search by keyword
5 - Sort by last name
6 - Write Team Members to File
0 - Exit
> 0
Goodbye!
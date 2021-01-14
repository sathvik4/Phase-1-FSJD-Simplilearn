package features;

import java.util.InputMismatchException;
import java.util.Scanner;

import lockedme.Menu;

//Class contains menu to perform add, delete, search operations and function calls to the respective operations
public class DisplayDetails {
	Scanner sc = new Scanner(System.in);	
	
	int choice;
		
	public void displayDets() {
		//Sub menu - Option 2
		do {			
			System.out.println("\n1. Add file to the existing directory");
			System.out.println("2. Delete a file from the list");
			System.out.println("3. Search for a file");
			System.out.println("4. Go to main Menu");
			
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				DisplayDetails d = new DisplayDetails();
				d.displayDets();
			}
			
			//Performing User Functions
			switch(choice) {
				case 1:
					AddFile a = new AddFile();
					a.addingFile();					
					break;
				case 2:
					Deletefile d = new Deletefile();
					d.deletingFile();
					break;
				case 3:
					SearchFile s = new SearchFile();
					s.searchingFile();
					break;
				case 4:
					Menu l = new Menu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=4);		
	}
	
}

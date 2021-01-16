package lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import lockedme.Menu;
import features.DisplayDetails;

//Class contains menu to display the contents of the file in ascending order 
public class AscendingOrder {
	Scanner sc = new Scanner(System.in); 
	
	int choice;
	File dir = new File ("C:\\Users\\Sathvik\\eclipse-workspace\\Phase-1 Locked me\\files");
	ArrayList<String> fileList = new ArrayList<>();	
	
	public void display() { 
		do {
			System.out.println("\n1. Display file names in Ascending Order");
			System.out.println("2. Go to main Menu");
			
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				AscendingOrder d = new AscendingOrder();
				d.display();
			}
						
			//Performing User Functions
			switch(choice) {
				case 1:
					AscendingOrder ao = new AscendingOrder();
					ao.ascendingOrder();
					break;
				case 2:
					Menu l = new Menu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=2);		
	}
	
	//Arranging the contents of the directory in ascending order
	public void ascendingOrder() {					
      String[] children = dir.list();
      
      //Gets filenames from the directory and adds it to an arraylist, that is used to arrange the contents in ascending order
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            fileList.add(filename);
         }
      }  
      
      Collections.sort(fileList);
      System.out.println("Files in Ascending Order : " + fileList);
			
	}
	
}


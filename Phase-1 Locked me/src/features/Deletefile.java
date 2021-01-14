package features;

import java.io.File;
import java.util.Scanner;

//Delete file from the directory
public class Deletefile {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	File dir = new File ("C:\\Users\\Sathvik\\eclipse-workspace\\Phase-1 Locked me");
	
	//Accepts filename of the file to be deleted and calls the function that will delete the file
	public void deletingFile() {
		Deletefile d = new Deletefile();		
		
		//Printing Files Present in the system
		System.out.println("\nFiles Present : ");
		d.displayFile();
		
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file		
		d.deleteFile(fileName);
	} 
	
	//Deleting file from the Directory
	public void deleteFile(String fileName) {				
		File file = new File(dir, fileName); 
		
		if (file.delete())
			System.out.println("File Deleted : " + file.getName());      
	    else
	    	System.out.println("File not found.");
	}
	
	//Displaying Contents of the file 
	public void displayFile() {		
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            System.out.println(filename);
         }
      }
	}
	
}


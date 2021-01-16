package features;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Adding File to the directory
public class AddFile {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	
	//Function accepts name of the file to be added from the user and calls the function that will add the file
	public void addingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file 
		AddFile a = new AddFile();
		a.createFile(fileName);
	}
	
	//Adding file to the directory 
	public void createFile(String fileName) {
		File dir = new File ("C:\\Users\\Sathvik\\eclipse-workspace\\Phase-1 Locked me\\files");
	    try {
	      File file = new File(dir, fileName);
	      
	      if (file.createNewFile()) {    	      	 
	    	  System.out.println("File Created : " + file.getName());
	      } else {
	    	  System.out.println("File already exists. Please enter another name");
	    	  AddFile a = new AddFile();
	    	  a.addingFile();
	      }
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	  }
	
}

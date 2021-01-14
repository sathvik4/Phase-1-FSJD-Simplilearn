package features;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//Search for a file from the directory
public class SearchFile {
	Scanner sc = new Scanner(System.in);
	
	File dir = new File ("C:\\Users\\Sathvik\\eclipse-workspace\\Phase-1 Locked me");
	ArrayList<String> fileList = new ArrayList<>();
	String fileName;
	
	//Accepts name of the  file to be searched, calls function that will search the file 
	public void searchingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		SearchFile sf = new SearchFile();
		sf.searchList();
		sf.search(fileName);
	}
	
	//Gets the filenames from the directory and adds it to an arraylist, that is used to search the file 
	public void searchList() {				
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            fileList.add(filename);
         }
      }  
      
	}
	
	//Searching the arraylist to check if the file is present
	public void search(String fileName) {
		boolean present = fileList.contains(fileName); 
		
		if (present) 
            System.out.println("File is Present in the directory"); 
        else
        	System.out.println("File is not present in the directory."); 
	}
	
}
	


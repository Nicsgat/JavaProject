package Project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusinessLevelOperation {

	public static void displaySub() {
		int optionSub;
	
		
		while(true) {
		try {
		System.out.println(" Option 1: Add a File\n" +
				" Option 2: Delete a File\n" + 
				" Option 3: Search a File\n" +
				" Option 4: Return to Main Menu\n" +
				" ______________Please Select Appropriate Option______________");
		Scanner inputSub=new Scanner(System.in);		    
		optionSub=inputSub.nextInt();
				    
				    switch(optionSub) {
						case 1:
							System.out.println(" Adding a File");
							AddFile();
							break;
						case 2:
							System.out.println(" Please Enter a File Name to Delete it Permanently");
							DeleteFile();
							break;
						case 3:
							System.out.println(" Enter a File Name to Search");
							SearchFile();
							break;						
						case 4:
							System.out.println(" *************************Main Menu**************************");
							MainMenu.display();
							break;
				    }
		}
		catch(Exception e){				
	    	optionSub = 4;
	    }
		}
		
		
	}
	public static void AddFile() {
		
		//Exception handling in case of error
		try  
		{  
			Scanner sc=new Scanner(System.in);         
			System.out.print(" Enter the file name: ");  
			
			//Taking input from user to create file name
			String fileName=sc.nextLine();
			
			//File path to store new file
			FileOutputStream create=new FileOutputStream("C:\\Users\\Kakaji\\eclipse-workspace\\FSD Java Project\\files\\"+fileName, true);  
					
			//Writing content in file
			System.out.print(" Enter file content: ");         
			String fileContains=sc.nextLine()+"\n";        
			
			//Converting string into bytes
			byte[] b= fileContains.getBytes();         
			//writing bytes into file
			create.write(b);             
			//closing file
			create.close();              
			System.out.println(" ____________________File " +fileName+ " is saved.____________________");  	
		}  
		catch(Exception e){  
			e.printStackTrace();          
		}  
	}
	public static void DeleteFile() {
		
		Scanner del= new Scanner(System.in);
		
		//Initialising Directory path 
		File Directory= new File("C:\\Users\\Kakaji\\eclipse-workspace\\FSD Java Project\\files\\");
		
		String fileList[]= Directory.list();
		for(int i=0;i<fileList.length;i++) {
			System.out.println(" "+fileList[i]);		
		}
		
		//Taking input from user to delete file by filename
		String delFile=del.nextLine();
		File deleteFile= new File("C:\\Users\\Kakaji\\eclipse-workspace\\FSD Java Project\\files\\"+delFile);

		//Files gets deleted if user input is same as file name
		if(deleteFile.delete()) {
			System.out.println(" _______________File " + delFile +" Deleted Sucessfully_______________");
		}
		else {
			System.out.println(" ________File Not Found Please Select Appropriate File________");
			DeleteFile();
		}
		
	}
	public static void SearchFile() {
		
		try {
		Scanner search= new Scanner(System.in);
		String searchFile=search.nextLine();
		File findFile= new File("C:\\Users\\Kakaji\\eclipse-workspace\\FSD Java Project\\files\\"+searchFile);
		
		//If file exist then condition will be true
		if(findFile.exists()) {
			System.out.println(" __________________File " + searchFile +" Found Sucessfully__________________");
		}
		else {
			System.out.println("_________File Not Found Please Select Appropriate File________");
			SearchFile();
		}
		}
		catch(Exception e){  
		e.printStackTrace();          
		} 
	}
}


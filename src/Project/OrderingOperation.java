package Project;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class OrderingOperation {
	
	//Declaring static file so that same file name can be used in multiple methods
	static File directory= new File("C:\\Users\\Kakaji\\eclipse-workspace\\FSD Phase 2 Project\\files\\");
	public static void Asending() {
		int option=1;
		Scanner input=new Scanner(System.in);
		System.out.println(	" Arranging Files in Asending Order press \n"+  " Option 1: Name \n"+
				" Option 2: Return to Main Menu ");
		
		while(true) {
			option=input.nextInt();
			switch(option) {
				case 1:
					Name();
				case 2:
					System.out.println(" *************************Main Menu**************************");
					MainMenu.display();		
			}
		}		
	}
	
	public static void Name() {
		System.out.println(" Arranging File according to Name: ");
		
		//Declaring string variable to store file list in Array
		String files[] = directory.list();
		
		//Sorting file by name in Ascending order
		Arrays.sort(files);
		for(int i=0;i<files.length;i++) {
			String name= files[i];
			System.out.println(" "+name);
		}
		OrderingOperation.Asending();
	}
}

package Project;
import java.util.Date;
import java.util.Scanner;

public class MainMenu{
	public static void ApplicationDetails() {
		//Date is a in build function which we have used here
		Date date = new Date();  
	    
		//Printing Application and Developer Details
		System.out.println( " ******************Welcome to LockedMe.com******************\n" + 
				" Application Name: Crud Operation Demo \n" + 
				" *********************Developer Details*********************\n" +
				" Name: Nikhil Gat\n" +
				" Designation: Java Developer\n" + " Date: " + date.toLocaleString() +"\n" + 
				" **************************Main Menu************************");
	}
	
	public static void display(){
		
		//Declaring data type integer 
	    int option = 1;
		
		//Declaring while loop to check condition 
	    while(true) {	
	    	try {
	    System.out.println(" Option 1: Arrange Files in Ascending Order\n" +
	    		" Option 2: Perform Business Level Operations\n" + 
	    		" Option 3: Stop this Application\n" + 
	    		" ______________Please Select Appropriate Option______________");
	  
	    //Scanner class is used to define input from user
	  		Scanner input=new Scanner(System.in);
	  		
	    //Excepting input from user in integer form
	    option=input.nextInt();
	    
	    	//Switch loop is used to select various options for user
	    	switch(option) {
	    		case 1:
	    			//Calling Ascending method from class OrderingOperation to perform Ascending operations  
	    			OrderingOperation.Asending();
	    			break;
	    		case 2:

	    			System.out.println(" Business Level Operations");
			
	    			//Calling displaySub method from class BusinessLevelOperation to perform Business Level Operations
	    			BusinessLevelOperation.displaySub();
	    			break;
	    		case 3:
	    			System.out.println(" ***************************Thankyou for Your Valuable Time***************************");
			
	    			//Exit from Application
	    			System.exit(0);
	    			break;
	    		default:
	    			break;
	    	}
			}
		    catch(Exception e){				
		    	option = 4;			    
	    	}
	    } 
	}
}

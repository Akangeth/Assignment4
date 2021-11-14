/**
 * Class: CMSC203 CRN 24307
 Program: Assignment #5
 Instructor: Prof. Tsai
 Summary of Description: Write an application that lets the user create a management company and 
 add the properties managed by the company to its list. Assume the maximum number of properties 
 handled by the company is 5.  
 Due Date: 11/14/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 * @author Allan Kangethe
 *
 */

public class PropertyMgmDriverNoGui {
	
	public static void main(String[] args) {

		//Create property objects
		Property p1 = new Property ("Belmar", "Silver Spring", 1200, "John Smith",0,0,1,1);
		Property p2 = new Property ("Camden Lakeway", "Rockville", 5000, "Ann Taylor",1,1,1,1);
		Property p3 = new Property ("Hamptons", "Rockville", 1250, "Rick Steves",2,2,1,1);
		Property p4 = new Property ("Mallory Square", "Wheaton", 1000, "Abbey McDonald",3,3,1,1);
		Property p5 = new Property ("Lakewood", "Rockville", 3000, "Alex Tan",4,4,11,11);
		
		//Create management company object
		ManagementCompany m = new ManagementCompany("Alliance", "1235",6);  //,0,0,10,10);
		
		//Add the properties to the list of properties of the management company
		System.out.println(m.addProperty(p1));   //Should add the property and display the index where the property is added to the array
		System.out.println(m.addProperty(p2));
		System.out.println(m.addProperty(p3));
	 	System.out.println(m.addProperty(p4));
		System.out.println(m.addProperty(p5));   //should display -3 to indicate property plot is not contained in the MgmtCo plot
		p5 = new Property ("Lakewood", "Rockville", 3000, "Alex Tan",4,4,1,1);
		System.out.println(m.addProperty(p5));
		System.out.println(m.addProperty(p5));   //it should display -4 to indicate the property is not added to the array due to size
		
		//Display the information of the property that has the maximum rent amount
		System.out.println("The property with the highest rent:\n" + m.maxRentProp()); //displayPropertyAtIndex(m.maxPropertyRentIndex())); 
	 		
		//Display the total rent of the properties within the management company
		System.out.println("\nTotal Rent of the properties: "+m.totalRent()+ "\n");  
		
		System.out.println(m); //List the information of all the properties and the total management fee 
	}

}
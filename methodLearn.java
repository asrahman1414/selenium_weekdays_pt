package lesson3;

public class learningJavamathod {

	public static void main(String[] args) { 
		
		
		
		System.out.println("  The program starts. \n");
		printFirstName();
		PrintLastName();
		addName();
		bangladeshGrowingFast();
		myBool();
		System.out.println("The program end");
		
		
		}
	
	public static void printFirstName() {
		System.out.println("My first name is golam");
		
	}
	public static void PrintLastName() {
		
		System.out.println("My last name is Rahman");
	}
	public static void addName() {
		int golam = 5;
		int Rahman = 5;
		int sum;
		sum = golam + Rahman;
		System.out.println("The number of letters in my full name is:  " +  sum);
	}
	
	public static void bangladeshGrowingFast()  {
	    System.out.println("The yearl GDP of Bangladesh is 8 percent");
		
	}
	
    public static void myBool() {
    	
    	int time = 22; // this code didn't worked the way I've needed
		if (time <= 10);
			System.out.println("good morning");
		
		 if(time <= 20); 
		  System.out.println ("Good day");
		  System.out.println("Good evening");	
	
}


}




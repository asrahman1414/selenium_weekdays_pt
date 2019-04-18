

//This program is created to find the largest number and smallest number from th//e Array.This is also an example of compare number 


public class lesson7array {
public static void main(String[]args) {

int largeArray[ ] = {12, 16, 9, 56, 93, 99, 86, 34, 49};//List of numbers

int largest = largeArray[0];//assigning integer into Array
int smallest = largeArray[0];

   for (int i=0; i<=8; i++){   //

   if (largeArray[i] < smallest) smallest = largeArray[i];
   if (largeArray[i] > largest) largest = largeArray[i];
}
 System.out.println("print the smallest value:"   +  smallest);
 System.out.println("print the largest value:"     +  largest);

}
}

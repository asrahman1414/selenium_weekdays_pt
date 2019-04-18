import java.util.Scanner;
public class javaExcersize1  {

public static void main(String[]args){
       Scanner input =new Scanner(System.in);
       int number = 1;
System.out.println("Please presss( 1=Spring, 2=Summer, 3=Fall, 4=Winter)");

       number = input.nextInt();
                
                if ( number == 1)
                 printSpring();

                if (number == 2)
                printSummer();

                if (number == 3)
                 printFall();

                if (number == 4)
                  printWinter();
}

     public static void printSpring() {
       System.out.println("This is spring season flowers are blooming");
}
    public static void printSummer() {
       System.out.println("This is summer weather is getting hot");
}
    public static void printFall() {
       System.out.println("Fall is here leafs are falling");
}
    public static void printWinter() {
       System.out.println("winter is here snow are falling");
}
}
       

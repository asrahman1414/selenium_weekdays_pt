public class lesson4 {
public static void main(String[]args) {

     aircraft cessna = new aircraft();
     aircraft saratoga172 = new aircraft();

      cessna.passenger = 4;
      cessna.millage = 150;
      cessna.fuelconsumption = 500;
      cessna.fuelcapacity = 1000;

System.out.println("the number of passenger hold in cessna" +   cessna.passenger);


}
}
 class aircraft {
 int passenger;
 int  millage;
 double fuelconsumption;
 double fuelcapacity;
}

package App;

import java.util.Scanner;

import service.CarRentalservice;
import serviceimpln.CarRentalServiceImpln;

public class CarRentalApp {
 public static void main(String[] args) {
	System.out.println("====welcome to car Retal System===");
	CarRentalservice c1=new CarRentalServiceImpln();//upcasting
	Scanner ip = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("=====menu======");
		System.out.println("1 Add car\n2.All Datails\n3.findcarwithid\n4.sortcarbyid\n5.Exit");
		int op = ip.nextInt();
		switch(op) {
		case 1:  c1.addCar();break;
		case 2: c1.allDetails();break;
		case 3: c1.findCarByid();break;
		case 4: c1.sortCarbyCid();break;
		case 5: System.out.println("==========Thank You Visit Again=======");
		System.exit(0);break;
		default:System.out.println("Invalid Option");
		}
	}
}
}

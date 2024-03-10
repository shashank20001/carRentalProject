package serviceimpln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entity.car;
import entity.sortbyfualtype;
import entity.sortbypricetype;
import service.CarRentalservice;

public  class CarRentalServiceImpln implements CarRentalservice {
	
   ArrayList<car> li = new ArrayList<car>();
   Scanner ip = new Scanner(System.in);
	@Override
	public void addCar() {
	System.out.println("===place enter the below car details=====");
	System.out.println("enter the car id");
	int cid = ip.nextInt();
	System.out.println("enter the brand name:-");
	String bname =ip.next();
	System.out.println("enter the colour:-");
	String colour=ip.next();
	System.out.println("enter the price:-");
	double price=ip.nextDouble();
	System.out.println("enter the Fuel type:-");
	String ft=ip.next();
	System.out.println("enter the model:-");
	int model=ip.nextInt();
	System.out.println("enter the milage:-");
	int milage=ip.nextInt();
	li.add(new car(cid,bname, colour, price, ft, model, milage));
	System.out.println("=========== Details Had been saved=================");
		
	}

	@Override
	public void allDetails() {
		System.out.println("=========Car details================");
		int c=0;
		for(car ele : li)
		{
			System.out.println(ele);
			c++;
		}
		if(c==0)
		{
			System.out.println("no data found...!!!!");
		}
		
	}

	@Override
	public void findCarByid() {
		System.out.println("please enter the car id:-");
		int id=ip.nextInt();
		int c=0;
      for(car c1 :li)
      {
    	  if(c1.getCid()==id)
    	  {
    		  System.out.println("car found with id"+c1);
    		  c++;
    		  break;
    	  }
      }
      if(c==0)
      {
    	  System.out.println("id not found...!!!");
      }
		
	}

	@Override
	public void sortCarbyCid() {
      Collections.sort(li);
      System.out.println("==========car details========");
      int c=0;
      for(car ele : li)
      {
    	  System.out.println(ele);
    	  c++;
      }
      if(c==0)
      {
    	  System.out.println("no data found..!!!");
      }
	}

	@Override
	public void sortcarbyprice() {
		Collections.sort(li, new sortbypricetype());
		 System.out.println("==========car details========");
	      int c=0;
	      for(car ele : li)
	      {
	    	  System.out.println(ele);
	    	  c++;
	      }
	      if(c==0)
	      {
	    	  System.out.println("no data found..!!!");
	      }
		
	}

	@Override
	public void sortcarbyfueltype() {
		Collections.sort(li, new sortbyfualtype());
		 System.out.println("==========car details========");
	      int c=0;
	      for(car ele : li)
	      {
	    	  System.out.println(ele);
	    	  c++;
	      }
	      if(c==0)
	      {
	    	  System.out.println("no data found..!!!");
	      }
		
	}	
	


}
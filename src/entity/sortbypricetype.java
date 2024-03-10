package entity;

import java.util.Comparator;

public class sortbypricetype implements Comparator<car> {
	
	 

	@Override
	public int compare(car o1, car o2) {
		if(o1.getPrice()>o2.getPrice())
 		{
 			return 1;
 		}else if (o1.getPrice()<o2.getPrice())
 		{
 			return -1;
 		}else {
 			return 0;
 		}
	
	}
}

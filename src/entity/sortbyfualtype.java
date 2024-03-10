package entity;

import java.util.Comparator;

public class sortbyfualtype implements Comparator<car> {
	
	@Override
	public int compare(car o1, car o2) {
		
		return o1.getFueltype().compareTo(o2.getFueltype());
	}
}

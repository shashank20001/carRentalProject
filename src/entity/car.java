package entity;

import java.util.Comparator;

public class car implements Comparable<car> {
 private int cid;	
 private String brand;
 private String color;
 private double price;
 private String fueltype;
 private int model;
 private int milage;

public car(int cid, String brand, String color, double price, String fueltype, int model, int milage) {
	super();
	this.cid = cid;
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.fueltype = fueltype;
	this.model = model;
	this.milage = milage;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}
@Override
public String toString() {
	return "car [cid=" + cid + ", brand=" + brand + ", color=" + color + ", price=" + price + ", fueltype=" + fueltype
			+ ", model=" + model + ", milage=" + milage + "]";
}
@Override
public int compareTo(car o) {
	if(this.cid>o.cid)
	{
		return 1;
	}else if (this.cid<o.cid) {
		return -1;
	}else {
		return 0;
	}
	
}

 public class sortbyprice implements Comparator<car>
{

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







}

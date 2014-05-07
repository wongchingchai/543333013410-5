package com.worksheet2;


public class Car  implements Comparable<Car> {

	 private String name; 
	 private int type; 
	 private int price;
	 
	 public Car (String n ,int t ,int p ){
	 name = n;
	 type = t;
	 price = p;
	 }
	 public String getName() {return name;}
	 public int getType() {return type;}
	 public int getPrice() {return price;}
	 
	 public boolean equals(Car Other){
		 return this.getName().equals(Other.getName());
	 }
	 
	 public int compareTo(Car Other){
//return this.getName().compareTo(getName());
		 if(this.equals(Other))
			return 0;
		
		 else if(getPrice() < Other.getPrice())
			return 1;
		
		else 
			return -1;
	 }
	 
	 public String toString(){
		 return "{Name :"+ getName() +"\tType :"+ getType() +"\tPrice :"+ getPrice() + "}";
	 }
	
	 
	 }
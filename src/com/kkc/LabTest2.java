package com.kkc;



public class LabTest2 {

	String m2;
	public LabTest2(String m){
		m2 = m;
	}
	public static void main (String[] args){
		LabTest2 t = new LabTest2("Saha");
		LabTest2 t2 = new LabTest2("SF");
		LabTest2 t3 = new LabTest2("Owen!!Ronaldo!!Pepe!!Khan");
		t.names();
		t2.posit();
		t3.Friendss();
	}
	void names(){
		System.out.println("name :"+m2);
	}
	void posit(){
		System.out.println("position :"+m2);
	}
	void Friendss(){
		System.out.println("Friend :"+m2);
	}
	}
			
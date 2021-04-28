package OverloadOverriding;

public class GreenApple extends Apple{
	private boolean makepie;
	
	public GreenApple() { // constructor for sub class of Apple
		super(); // inherit data from super class with no parameter
		makepie = true;
	}
	
	public GreenApple(String n, int q, double p, String clr, String t, boolean pie) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		makepie = true;
		
		setInfo(n,q,p,clr,t,pie);//method for overloading
	}
	 
	public void setInfo(String n, int q, double p, String clr, String t, boolean pie) { //overriding method with parameter
		if (pie == true)
	        makepie = pie;
	    else 
	    	makepie = false;
			
	}
	
	public boolean getpie() {
		return makepie;
    }
	
	public String toString() { //overriding method
		  return super.toString() +
				 "\nIs it suitable for making pie? " + makepie;
	}
	 
	
	 
}

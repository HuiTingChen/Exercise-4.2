package OverloadOverriding;

public class RedApple extends Apple  { 
private boolean sugar;
	
	public RedApple() { // constructor for sub class of Apple
		super(); // inherit data from super class with no parameter
		sugar = true;
	}
	
	public RedApple(String n, int q, double p, String clr, String t, boolean s) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		sugar = true;
		
		setInfo(n,q,p,clr,t,s);//method for overloading
	}
	 
	public void setInfo(String n, int q, double p, String clr, String t, boolean s) { //overriding method with parameter
		if (s == true)
	        sugar = s;
	    else 
	    	sugar = false;
			
	}
	
	public boolean getsugar() {
		return sugar;
    }
	
	public String toString() { //overriding method
		  return super.toString() +
				 "\nIs red apple has higher sugar level compare to green apple? " + sugar;
	}
	  
}
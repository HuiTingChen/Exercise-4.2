package OverloadOverriding;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	protected String colour;
	protected String taste;
	
	public Apple() { //constructor for sub class of Fruit
		super(); // inherit data from super class with no parameter
		quantity = 0;
		price = 0;
		colour = " ";
		taste = " ";
	}
	  
	public Apple(String n, int q, double p, String clr, String t) { //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		quantity = q;
		price = p;
	    colour = clr;
		taste = t;
		
		setInfo(n,q,p,clr,t); //method for overloading
	}
	  
	public void setInfo(String n, int q, double p, String clr, String t) { //overriding method with parameter
		if (q >= 0)
	        quantity = q;
	    else 
	    	quantity = 0;
		
		if (p >= 0)
	        price = p;
	    else 
	    	price = 0.00;
		
	}
	
	public int getQuantity() {
		return quantity;
    }
	
	public double getPrice() {
		return price;
    }
	  
	public String getColour() {
		return colour;
    }
	
	public String getTaste() {
		return taste;
    }
	  
	public double total() {
		  return quantity* price;
	} 
	  
	  
	public String toString() { //overriding method
	    return  super.toString() + 
	    		"\nPrice per piece    : RM" + price + "\n" +
	    		"Purchase quantity  : " + quantity + "\n" + 
	    		"Total price        : RM" + total() + "\n" + 
	    		"Colour             : " + colour + "\n" + 
	    		"Taste              : " + taste;
	  }
}

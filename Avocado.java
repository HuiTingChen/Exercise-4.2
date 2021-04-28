package OverloadOverriding;

public class Avocado extends Fruit {
	private double fats;
	private double weight;
	private boolean heart_healthy;
	
	public Avocado() { //constructor for sub class of Fruit
		super();
		fats = 0;
		weight = 0;
		heart_healthy = true;
	}
	
	public Avocado(String n, double f, double w, boolean h){ //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		fats = f;
		weight = w;
		heart_healthy = h;
		
		setInfo(n,f,w,h); //method for overloading
    }
	  
	  public void setInfo(String n, double f, double w, boolean h) { //overriding method with parameter
		  if (f >= 0)
		        fats = f;
		    else 
			      fats = 0.00;
			
		  if (w >= 0)
		        weight = w;
		    else 
		    	  weight = 0.00;
		  
		  if (h == true)
			    heart_healthy = h;
		    else 
		    	  heart_healthy = false;
		}
		
	  public double getFats() {
		  return fats;
	  }
	  
	  public double getWeight() {
			return weight;
	    }
	
	  public boolean getCompare() {
			return heart_healthy;
	    }
	  public double totalFats() {
		  return fats * weight;
	  }
	  
	  public String toString() { //overriding method
		  return super.toString() + 
				 "\nIs avocado contain heart healthy fatty acid? " + heart_healthy +
		  		 "\nFat Amount (" + fats + ")  : " + totalFats() + "g";
	  }
	 
}
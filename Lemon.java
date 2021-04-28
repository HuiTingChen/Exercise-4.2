package OverloadOverriding;

public class Lemon extends Fruit {
	private double vitaminC;
	private double weight;
	private boolean compare;
	
	  public Lemon() { //constructor for sub class of Fruit
		super();
		vitaminC = 0;
		weight = 0;
		compare = true;
	  }
	
	  public Lemon(String n, double vitC, double w, boolean c) { //constructor with  argument	
		super(n);// inherit data from super class with 1 parameter
		vitaminC = vitC;
		weight = w;
		compare = c;
		
		setInfo(n,vitC,w,c); //call method
	  }
	  
	  public void setInfo(String n, double vitC, double w, boolean c) { //overriding method with parameter
		  if (vitC >= 0)
		        vitaminC = vitC;
		    else 
			      vitaminC = 0.00;
			
		  if (w >= 0)
		        weight = w;
		    else 
		    	  weight = 0.00;
		  
		  if (c == true)
		        compare = c;
		    else 
		    	  compare = false;
		}
	  
	  public double getvitaminC() {
			return vitaminC;
	    }
	  
	  public double getWeight() {
			return weight;
	    }
		
	  public double totalvitC() {
		  return vitaminC * weight;
	  }
	  
	  public boolean getCompare() {
			return compare;
	    }
	  
	  public String toString() { //overriding method
		  return super.toString() + 
				 "\n\"Is lemon has higher vitamin C? " + compare +
		  		 "\nVitamin C (" + vitaminC + ")   : " + totalvitC() + "mg";
	  }
	  
}

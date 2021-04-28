package OverloadOverriding;

public class Fruit {
	public String name;
	
	public Fruit() { //constructor without argument
		name = " ";		
	}
	
	public Fruit(String n) { //constructor with 1 argument	
		name = n;
		setInfo(n); //call method
	}
	
	public void setInfo(String n) { //overriding method with parameter
		if (name.equals(null))
			name = "";
		else
			name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return (name + " contructor is invoked" +
			   "\nFruit Name         : " + name ); 
	}
}

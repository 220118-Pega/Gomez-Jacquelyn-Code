package com.revature.stacklite.models;

/**
 * This is a class used to model coding issues
 * @author jacki
 *
 */
public class Issue {
//The class: the blueprint, template, guideline
//expected structure if you instantiate an object of this class
//members :fields (attributes), methods, constructors
	
//fields
	//used to define characteristics of a class
	//used to define dependencies of the class
	//dependencies: class that needs other class to function well
	
	private String title;
	private String description;
	private int id;
	
//constructors
	//special methods that are used to initialize properties of a class
	//if don't put an instructor, that's ok, there is a default created for you
	//make public so that other instances of this class can be instantiated 
	//outside of this class
	public Issue() { //no args constructor
		//calls the constructor of the base class
		//we are inherently inheriting from Object class
		//super(); //calling the object constructor
		//do not need to have this - it is implicitly called
		this("No title", "No description", 0);
	}
	
	public Issue (String title, String description) { //parameterized constructor
		//this keyword pertains to the particular instanc's title and
		//description properties
		//the title attribute of the object I'm constructing will have the value
		//of the title parameter I am passing
		this.title = title;
		this.description = description;
	}
	
	public Issue (String title, String description, int id) {
		//calls constructor of the same class
		this(title, description);
		this.id = id;
		//this is constructor chaining (having another constructor inside a constructor)
	}
	//having multiple constructors is a form of polymorphism, 
	//called method overloading
	
//methods
	//describe the behavior of your class

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		//can introduce validation logic here
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//format of Object when converting to string
	@Override
	public String toString() {
		return "Issue [title=" + title + ", description=" + description + ", id=" + id + "]";
	}
	
	
}

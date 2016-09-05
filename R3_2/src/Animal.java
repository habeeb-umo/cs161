
public class Animal {
	
	private String name;
	private int topSpeed;		
	//create the getters and setters for the instance variables
        //there is a shortcut by hovering over the variable names
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTopSpeed() throws Exception {
		if(topSpeed > 70 || topSpeed < 0){
			throw new Exception("Error!");
		}
		else
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public Animal(String name, int topSpeed){
		this.name = name;
		this.topSpeed = topSpeed;
	}
	
	public String toString(){
		String nameInfo = "Name: " + this.name;
		String speedInfo = "Top Speed: " + this.topSpeed;
		
		return nameInfo + speedInfo;
	}
	
	public boolean equals(Object other){
	if(!(other instanceof Animal)){
		return false;
	}
	Animal otherAnimal = (Animal) other;
	if(Math.abs((this.topSpeed - otherAnimal.topSpeed)) <= 2){
		return true;
	}
	else
	return false;
}
		
	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Raise an exception if it is not within these values.
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables


        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
}

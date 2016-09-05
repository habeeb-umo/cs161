public class Species {	

    // Put the instance variable here.
	public String name;
	public int pop;
	public double rate;
    // ....

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.
	public Species(String name, int pop, double rate){
		this.name = name;
		this.pop = pop;
		this.rate = rate;
		if(pop<1){
			this.pop = 1;
		}
		if(pop>1500){
			this.pop = 1500;
		}
		if(rate<1){
			this.rate = 1;
		}
		if(rate>20){
			this.rate = 20;
		}
		
		
		
		
	}
    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        // ....
        this.name = other.name + this.name;
        this.pop = other.pop + this.pop;
        this.rate = other.rate + this.rate;
    }

    public String toString(){
        // ....
        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Population: " + this.pop + "\n";
        output += "Growth rate: " + this.rate + "\n";
        return output;

    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
       
    	double percent = this.rate / 100;
    	this.pop += percent * this.pop;
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        // ....
        int result = (int) (this.pop + (this.rate * x));
        return result;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
        
        
    }
}

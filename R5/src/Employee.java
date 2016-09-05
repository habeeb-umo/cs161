public abstract class Employee{

    private String name;
    private int id;

    public abstract int work();

    public String toString() {
	return name + " ID: " + id;
    } 

    public boolean equals(Object other) {
	if (other instanceof Employee && other != null) {
	    return (name.equals(((Employee)other).name) && id == ((Employee)other).id);
	}
	return false;
    }
    
   public Employee(int id, String name){
	   this.id = id;
	   this.name = name;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
   
}
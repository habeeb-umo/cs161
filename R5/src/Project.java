import java.util.ArrayList;
public class Project{
	protected int linesOfCode = 0;
	
	ArrayList<Employee> employees = new ArrayList<>();
	
	public Project(int codeLines, int duration){
		
	}
	
	public void addEmployee(){
		employees.add(null);
		
	}
	
	public int doProject(){
		for(Employee e : employees){
			e.work();
			if(e.getClass() == e.){
				
			}
		}
		
	}
	
}

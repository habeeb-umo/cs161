import java.util.Random;

public class Programmer extends Employee{
	int linesOfCodePerDay = 0;
	public Programmer(int id, String name){
		super(id, name);
		
	}
	
	@Override
	public int work() {
		Random r = new Random();
		int min = 50;
		int max = 150;
		int rand = (r.nextInt(max - min)) + min;
		rand = rand / 100;
		linesOfCodePerDay = linesOfCodePerDay * rand;
		return linesOfCodePerDay;
		
	}
	
}

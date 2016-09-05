import java.util.Random;

public class Tester extends Employee {
	int linesOfCodeTestedPerDay = 0;
	public Tester(int id, String name) {
		super(id, name);

	}

	@Override
	public int work() {
		Random r = new Random();
		int min = 75;
		int max = 125;
		int rand = (r.nextInt(max - min) + min);
		rand = rand / 100;
		linesOfCodeTestedPerDay = linesOfCodeTestedPerDay * rand;
		return linesOfCodeTestedPerDay;
		
	}

}

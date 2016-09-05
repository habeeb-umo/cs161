import java.util.Random;

public class RandomSearch implements Searching{

	@Override
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		Random ran = new Random();
		int ranInt = ran.nextInt(numbersToSearch.length);
			for(int i = 0; i < numbersToSearch.length; i++){
				if(numbersToSearch[ranInt] == numberToSearchFor){
					return i;
				}
			}
				return -1;
	}

}

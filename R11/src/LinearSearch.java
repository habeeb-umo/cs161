
public class LinearSearch implements Searching {

	@Override
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		for(int i = 0; i < numbersToSearch.length; i++){
			if(numbersToSearch[i] == numberToSearchFor){
				return i;
			}
		}
		return -1;
	}

}

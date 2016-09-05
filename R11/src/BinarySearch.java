
public class BinarySearch implements Searching{

	@Override
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		
		return binarySearch(numbersToSearch,numberToSearchFor, 0, numbersToSearch.length - 1);
		
	}
	
	public static int binarySearch(int[] numbersToSearch, int numberToSearchFor, int start, int end){
		int median = (start + end) / 2;
	    if (start > end) { // element not found
	        return -1;
	    }
	    if (numberToSearchFor == numbersToSearch[median]){
	        return median;
	    } else if(numberToSearchFor < numbersToSearch[median]){
	        return binarySearch(numbersToSearch,numberToSearchFor, start, median-1);
	    } else{
	        return binarySearch(numbersToSearch,numberToSearchFor,median+1, end);
	    }
	}

}

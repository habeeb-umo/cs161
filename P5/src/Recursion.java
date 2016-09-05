import java.util.Arrays;

public class Recursion {

	public String encrypt(String s){
		String aString = "";
		char cBefore;
		char cAfter;
		int ascii = 0;
		if(s == null){
			return null;
		}
		if(s.length() == 0){
		return "";
		}
		else
			if(s.length() > 0){
				ascii = (int) s.charAt(s.length()-1);
				cAfter = (char) (ascii + 1);
				cBefore = (char) (ascii - 1);
				aString = "" + cBefore + cAfter;
				s = s.substring(0, s.length()-1);
				encrypt(s);
				return encrypt(s) + aString;
			}
		return "ERROR";	
	}
	
	public int[] reverseCumulative(int[] numbers){
		int[] tArray = new int[numbers.length];
		int i = 0;
		if(numbers.length > 0){
		tArray[0] = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5];
		tArray[1] = numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5];
		tArray[2] = numbers[2] + numbers[3] + numbers[4] + numbers[5];
		tArray[3] = numbers[3] + numbers[4] + numbers[5];
		tArray[4] = numbers[4] + numbers[5];
		tArray[5] = numbers[5];
		reverseCumulative(numbers = new int[numbers.length-1]);
		}
		
		return tArray;
	}
	
//	public int index(int[] numbers){
//		int i = numbers.length;
//		if(numbers.length > 0){
//			i--;
//		}
//	}
	public int[] reverseArray(int[] numbers){
		if(numbers.length == 1){
			return numbers;
		}
		else{
			int temp = numbers[0];
			int tempNumbers[] = new int[numbers.length-1];
			System.arraycopy(numbers, 1, tempNumbers, 0, tempNumbers.length);
			tempNumbers = reverseArray(tempNumbers);
			System.arraycopy(tempNumbers, 0, numbers, 0, tempNumbers.length);
			numbers[numbers.length-1] = temp;
			return numbers;
		}
		
	}
	
	public static void main(String[] args){
		Recursion r = new Recursion();
		//System.out.println(r.encrypt("Hello"));
		int[] numbers = {5,6,7,2,3,1};
		System.out.println(Arrays.toString(r.reverseCumulative(numbers)));
	}
}

import java.util.ArrayList;

public class Recursion {
	
	/* Precondition: n >= 1
           Postcondition:  returns the nth number in a sequence where each element is twice its predecessor, and starts with 1.
	*/

	public int sequence1(int n){
		int seq = (int) (Math.pow(2,n) / 2);
		if(n > 0){
			sequence1(n-1);
			//System.out.print(seq + " ");
		}
		return seq;
	}
	
	/* Precondition: n >= 1
           Postcondition:  returns the nth number in a sequence where each element is the sum of the previous 3, and starts with 1,2,3
	*/
	//FIBONACCI NUMBER
	public int sequence2(int n){
		int i = 0;
		if(n == 1 || n == 2 || n == 3){
			return n;
		}
		if(n > 3){
			return sequence2(n-1) + sequence2(n-2) + sequence2(n-3);
		}
		return n;
	}
		
		
        /* Precondition:  word is an instance of String
           Postcondition:  returns true if word is a palindrome, and false otherwise
        */
	public boolean palindrome(String word){
		if(word.isEmpty() || (word.length() == 1)){
		return true;
		}
		else{
			String first = "" + word.charAt(0);
			String last = "" + word.charAt(word.length()-1);
			if(first.equals(last)){
				
				return palindrome(word.substring(1, word.length()-1));
			}
			else
				return false;
		}
		}
		
	

    /*Precondition:  list is an array of size at least 1
      Postcondition:  return value is the largest element in the array
     */
    public int maximum(int [] list) {
    	int i = list.length-1;
        return maxHelper(list, i);
    }
    
    private int maxHelper(int[] list, int i){
    		if(i > 0){
    			return Math.max(list[i], maxHelper(list,i-1));
    		}
    		else
    		return list[0];
    		
    	}
    	
    
	/* Precondition: x >= 1
           Postcondition: returns the appropriate star pattern for the value of x
	 */
	public String starPattern(int x){
		if(x > 0){
		return starHelper(x);
		
		}
		else
			return "";
	}
	private String starHelper(int x){
		if(x == 1){
			return "*";
		}
		else{
			return "*" + starHelper(x-1);//my base case
			
		}
		
	}
	
	public static void main(String args[]){

            Recursion rec = new Recursion();
            int[] list = {1,2,7,3,4};
            System.out.println("sequence1(int x):");
            System.out.println("Answer: " + rec.sequence1(5) + "   Expecting: 16");
            System.out.println("Answer: " + rec.sequence1(7) + "   Expecting: 64\n");
            
            System.out.println("sequence2(int x):");
            System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 11");
            System.out.println("Answer: " + rec.sequence2(6) + "   Expecting: 20\n");
            
            System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
            System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
            System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
            System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana") + "\n");
            
            System.out.println(rec.maximum(list));
            System.out.println(rec.starPattern(5));
	}
}


import java.util.Arrays;

public class rec {
	
public int[] cumHelper(int[] numbers, int i){
	if(i == numbers.length-1){
		i = i-1;
	}
	if(i>0){
		numbers[i] = numbers[i-1] + numbers[i];
	}
	if((i<numbers.length-1) && (i<-1)){
		cumHelper(numbers,i-1);
	}
	return numbers;
}

public static void main(String[] args){
	rec r = new rec();
	int[] numbers = {5,6,7,2,3,1};
	System.out.println(Arrays.toString(r.cumHelper(numbers,numbers.length-1)));
}
}

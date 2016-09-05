import java.util.Arrays;
public class MergeSort {
	//DIVIDES THE ARRAY UP INTO PIECES, SORTS EACH PIECE, THEN MERGES THEM TOGETHER 
	public static Student[] sort(Student[] list){
		//todo: you should implement this method
		Student[] original = list;
		Student[] left = new Student[original.length / 2];
		Student[] right = new Student[original.length - left.length];
		//base case
		if(original.length <= 1){
			return original;
		}
		//find the size of these two arrays
		else{
			for(int i = 0; i < left.length; i++){
			left[i] = original[i];
			}		
			for(int i = left.length; i < original.length; i++){
			right[i - left.length] = original[i];
			}
		}
			left = sort(left);
			right = sort(right);
			return	merge(left,right);
			
		//allocate left and right
		
		//fill in the arrays using original list data

		//recursive call and return
		//
		}
	
	//MERGES TWO SORTED ARRAYS INTO A SINGLE SORTED ARRAY
	public static Student[] merge(Student[] list1, Student[] list2){
		int i = 0, j = 0, k = 0;
		Student[] merged = new Student[list1.length + list2.length];

		while(k < list1.length + list2.length){
			if(i == list1.length || j == list2.length){
				if(i == list1.length){
					for(; j < list2.length; j++, k++){
						merged[k] = list2[j];
					}
				}
				else if(j == list2.length){
					for(; i < list1.length; i++, k++){
						merged[k] = list1[i];
					}
				}
			}
			else{
				if(list1[i].compareTo(list2[j]) <= 0){
					merged[k] = list1[i];
					i++;
					k++;
				}
				else{
					merged[k] = list2[j];
					j++;
					k++;
				}
			}
		}
		return merged;
	}
}

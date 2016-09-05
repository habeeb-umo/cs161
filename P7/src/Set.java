import java.util.Arrays;

public class Set extends LinkedList implements ISet {

  /*This method adds an item to the set. A duplicate item is not added.
	Hint: Override the add method defined in the LinkedList class but use 
	its functionality using super.*/
	@Override
	public void add(Object item) {
		if(!(this.in(item))){
		super.add(item);
		}
		
	}

	//This method returns true if the item is in the set, false otherwise.
	@Override
	public boolean in(Object item) {
		Node current = super.head;
		while(current != null){
		if(item.equals(current.getItem())){
			return true;
		}
			current = current.getNext();
		}
		
		return false;
	}
	
	/*This method returns a new array that contains all the items in the set.
	If the size of the set is 0, return an empty array. The objects in the 
	set are unique (i.e., no duplicates), so the returned array cannot contain
	duplicates.*/
	@Override
	public Object[] toArray() {
		Object[] object = new Object[this.size];
		Node current = this.head;
		if(this.size == 0 || this.equals(null)){
			object = new Object[0];
		}
		for(int i = 0; i < this.size; i++){
			object[i] = current.getItem();
			current = current.getNext();
		}
		return object;
	}

	/*This method creates and returns a new set from the items contained in the 
	elements array. The array may contain duplicates, but the Set implementation 
	should not contain duplicates. If the array is empty or null, return a set of 
	size 0 with head referring to null. If duplicates of an item are present in the
	array, then ignore all the occurrences of this item after the first one.*/
	@Override
	public ISet fromArray(Object[] elements) {
		ISet inArray = new Set();
		Object[] o = {};
		if(elements == null || elements.equals(0)){
			return inArray;
		}
		else{
		for(int i = 0; i < elements.length; i++){
			inArray.add(elements[i]);
		}
		}
		return inArray;
	}
	
	/*This method returns a new set that contains only those items that are present in 
	both "this" set and the other set. The order of items in the returned set does not
	matter. The other set and "this" set remain unchanged.*/
	@Override
	public ISet intersection(ISet other) {
		ISet orSet = new Set();
		Object[] o = other.toArray();
		Object[] t = this.toArray();
		
		for(int i = 0; i < o.length; i++){
			for(int j = 0; j < t.length; j++){
			if(o[i].equals(t[j])){
				orSet.add(o[i]);
			}
			}
		}
		return orSet;
	}

	/*This method returns a new set that contains the union of the items that are present 
	in "this" set and the other set. Obviously common elements should appear only once in
	the result. The order of items in the returned set does not matter. The other set and
	"this" set remain unchanged.*/
	@Override
	public ISet union(ISet other) {
		ISet andSet = new Set();
		Object[] o = other.toArray();
		Object[] t = this.toArray();
		
		
		for(int i = 0; i < o.length; i++){
			for(int j = 0; j < t.length; j++){
				andSet.add(o[i]);
				andSet.add(t[j]);
			}
		}
		return andSet;
	}
	
    public static void main(String[] args) {
        ISet tester = new Set();
        String[] names = {"Alex", "Hajar", "Asa", "Sudipto", "Koen", "Asa"};
        ISet s1 = tester.fromArray(names);
        System.out.println("After creating set s1 from array:\n" + s1);
        System.out.println("Printing array from s1:\n"+ Arrays.toString(s1.toArray()));    
        String[] otherNames = {"Gareth", "Alex", "Swapnil", "Chris", "Asa"};
        ISet s2 = tester.fromArray(otherNames);
        System.out.println("After creating set s2 from array:\n" + s2);
        ISet s3 = s1.intersection(s2);
        System.out.println("Intersection of s2 and s3:\n" + s3);
        ISet s4 = s1.union(s2);
        System.out.println("Union of s2 and s3:\n" + s4);
    }

}


	public class Recit11 {
		
		@SuppressWarnings("unchecked")
		public static void main(String[] args){
			int[] array = {233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
			
			LinearSearch ls = new LinearSearch();
//		Search for a number here and print out the index...
			System.out.println("Linear Search");
			System.out.println(ls.search(array, 0));
			System.out.println(ls.search(array, 233));
			System.out.println(ls.search(array, 2584));
			System.out.println(ls.search(array, 46368));
			System.out.println(ls.search(array, 99999));
			System.out.println();

			System.out.println("Binary Search");
			BinarySearch bs = new BinarySearch();
//		and here...
			System.out.println(bs.search(array, 0));
			System.out.println(bs.search(array, 233));
			System.out.println(bs.search(array, 2584));
			System.out.println(bs.search(array, 46368));
			System.out.println(bs.search(array, 99999));
			
			System.out.println("Random Search");
			RandomSearch rs = new RandomSearch();
//		and one more time.
			System.out.println(rs.search(array, 0));
			System.out.println(rs.search(array, 233));
			System.out.println(rs.search(array, 2584));
			System.out.println(rs.search(array, 46368));
			System.out.println(rs.search(array, 99999));
		}
	}


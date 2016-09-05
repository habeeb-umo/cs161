package examReview;

public class Recursion1 {

	public int Recursion1(int n){
		//n<0
		if(n<0){
			return 0;
		}
		//n==1 or n== 0
		if(n==0 || n==1){
			return 1;
		}
		//n=2
		if(n==2){
			return 2;
		}
		else
			return Recursion1(n-1) * Recursion1(n-3);
	}
	
	public String Recursion2(int n){
		String s = "";
		if(n < 2){
			return null;
		}
		if(n == 2){
			s = n + "";
			return s;
		}
		else{
			s = Recursion2(n-1);
			if(n%2 == 0){
				return s + "," + n;
			}
			else
				return s;
		}
	}
	
	public int Recursion3(int n){
		if(n == 1){
			return 2;
		}
		else{
			
			return(int)Math.pow(2,n);
		}
	}
	
	public static void main(String[] args){
		Recursion1 r = new Recursion1();
		System.out.println(r.Recursion1(8));
		System.out.println(r.Recursion2(10));
		System.out.println(r.Recursion3(10));
	}
}

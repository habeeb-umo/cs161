import java.util.Scanner;

public class test {
	public static void main(String args[]){
		loadTweets(args[0]);
		System.out.println(count);
	}
	static int count;
	private String[] tweets; // stores the tweets loaded from a file containing tweets.
	public static void loadTweets(String fileName) {
		Scanner sc = new Scanner(fileName);
		for(int i=0;i<fileName.length();i++){
		if(sc.hasNext()){
			count++;
			sc.nextLine();
			
		}
	  }
	}
}

import java.util.*;
public class TwitterDB implements TwitterDBInterface {

	public static void main(String args[]){
		TwitterDB tdb = new TwitterDB();
		tdb.loadTweets("test.txt");
	}
//	static int count;
//	private String[] tweets; // stores the tweets loaded from a file containing tweets.
//	public void loadTweets(String fileName) {
//		Scanner sc = new Scanner(fileName);
//		for(int i=0;i<fileName.length();i++){
//		if(sc.hasNext()){
//			count++;
//			sc.nextLine();
//			
//		}
//	  }
//	}

	@Override
	public String mostCommonWord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] tweetLengths() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int frequency(String word) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void loadTweets(String fileName) {
		Scanner sc = new Scanner(fileName);
		while(sc.hasNextLine()){
			System.out.println(sc.nextInt());
			String line = sc.nextLine();
			System.out.println(line);
		}
	}
	


}

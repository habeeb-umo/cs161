import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/*
 * int[] a = {1,2,3};
   System.out.println(a.length);
   a = Arrays.copyOf(a, a.length + 1);
   System.out.println(a.length);

 */

public class TwitterDB {

    private Tweet[] tweets = new Tweet[0]; // stores all the tweets, and initially there are none
    private int numberOfTweets = 0; // stores the number of tweets in the atweets array 
    
    public TwitterDB(String fileName){
    	File file = new File(fileName);
    	try {
			Scanner sc = new Scanner(file);
			int i = 0;
			String[] parts;
			Tweet t;
			while(sc.hasNext()){
				   parts = sc.nextLine().split("\t");
				   //System.out.println(Arrays.toString(parts));
				    // parts[2] contains the tweet
				   t = new Tweet(parts[0],parts[1],parts[2]);
				   System.out.println(t);
				   addTweet(t);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void addTweet(Tweet tweet){
    	System.out.println(numberOfTweets);
    	tweets[numberOfTweets] = tweet;
    		numberOfTweets++;
    		tweets = Arrays.copyOf(tweets,tweets.length + 1);
    	
    	System.out.println(numberOfTweets);
}
    public int getNumberOfTweets(){
    	return numberOfTweets;
    }
   // public Tweet earliestTweet(){
    	
   // }
    public static void main(String[] args){
    	TwitterDB tdb = new TwitterDB("tweets.txt");
    	/*
        Tweet t = tdb.earliestTweet();
        System.out.println("Earliest tweeted message:" + t.getTweet());

        Tweet[] tweets = tdb.tweetsBy("USER_989b85bb");
        System.out.println("Number of tweets by USER_989b85bb: " + tweets.length);

        tweets = tdb.tweetsBefore("2010-03-07T18:26:13");
        System.out.println("Number of tweets before 2010-03-07T18:26:13: " + tweets.length);

        tweets = tdb.tweetsBefore(tdb.tweets[0]);
        System.out.println("Number of tweets before test tweet: " + tweets.length);
        */
    }


    	
    
    
}

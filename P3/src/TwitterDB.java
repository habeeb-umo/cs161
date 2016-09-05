import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TwitterDB {
	private String comment;
	private ArrayList<Tweet> tweets;
	
	public TwitterDB(String comment){
		this.comment = comment;
		tweets = new ArrayList<Tweet>();
	}
	public void addTweet(Tweet tweet){
		tweets.add(tweet);
	}
	public int getNumberOfTweets(){
		return tweets.size();
	}
	public Tweet getTweet(int i){
		return tweets.get(i);
	}
	public Tweet earliestTweet(){
		if(tweets.isEmpty()){
			return null;
		}
		else
		return tweets.get(0);
	}
	public TwitterDB tweetsBy(String userID){
		String tbComment = "tweets by" + userID;
		TwitterDB twdb = new TwitterDB(tbComment);
		for(int i=0;i<tweets.size();i++){
		if(!(twdb.tweets.get(i).getUserID() == userID)){
			twdb.tweets.clear();
		}
		if(twdb.tweets.get(i).getUserID() == userID){
			twdb.addTweet(tweets.get(i));
		}
	}
		return twdb;
		
	}
	public TwitterDB tweetsBefore(String dateTime){
		String tbComment = "tweets before" + dateTime;
		TwitterDB twdb = new TwitterDB(tbComment);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			Date date = sdf.parse(dateTime);
    	    for(int i=0;i<tweets.size();i++){
    	    	if(tweets.get(i).getDate().compareTo(date) < 0){
    	    		twdb.addTweet(tweets.get(i));
    	    	}
    	    }
    	} catch(ParseException e) {
    	    System.exit(0);
    	}
		return twdb;
	}
	public TwitterDB tweetsBefore(Tweet tweet){
		String tbComment = "tweets before this tweet: " + tweet;
		TwitterDB twdb = new TwitterDB(tbComment);
			for(int i=0;i<tweets.size();i++){
				if(tweets.get(i).getDate().before(tweet.getDate())){
					twdb.addTweet(tweets.get(i));
				}
			}
			return twdb;
		}
	public String toString(){
		String state = "";
		String tweetOut = "";
		for(int i=0;i<tweets.size();i++){
		state = this.comment + "\n"; 
		tweetOut = (this.tweets.get(i) + "\n");
		}
		return state + tweetOut;
	}
	public String whoTweetedThat(String tweet){
		String whoDat = "";
		for(int i=0;i<tweets.size();i++){
		if(tweet.equals(tweets.get(i).toString())){
			whoDat = tweets.get(i).getUserID();
		}
		else
			whoDat = null;
		}
		return whoDat;
	}

}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tweet {

    private String userID; // stores the user id (column 1 in tweets file)
    private Date date; // convert the date-time string (column 2 in the tweets file) to a java.util.Date format
    private String tweet; // stores the tweeted message (column 3 in the tweets file) 
    
    public Tweet (String userID, String dateTime, String tweet){
    	this.userID = userID;
    	this.tweet = tweet;
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    	try {
    	    this.date = sdf.parse(dateTime);
    	} catch(ParseException e) {
    	    System.exit(0);
    	}
    	
    }

	public String getUserID() {
		return userID;
	}

	public Date getDate() {
		return date;
	}

	public String getTweet() {
		return tweet;
	}
	
	public String toString() {
		String concat = this.userID + "\t" 
		+ this.date.toString() + "\t" 
		+ this.tweet;
		
		return concat;
	}
	
	public boolean equals(Object other){
		
		if(!(other instanceof Tweet)){
			return false;
		}
		Tweet otherTweet = (Tweet) other;
		if(this.tweet.equals(otherTweet.tweet)){
			return true;
		}
		return false;
	}


	}


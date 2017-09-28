package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by pennyfea on 9/13/17.
 *
 * Represents a normal tweet.
 */



public class  NormalTweet extends Tweet {

    /**
     *
     * @param message
     */


    public NormalTweet(String message) {
        super(message);
    }


    public NormalTweet(String message, Date date) {

        super(message,date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

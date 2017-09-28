/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27 2017
 *
 * Copyright (c)  2017 Pennyfeather. CMPUT301, University of Alberta -- All rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of the license in this project, Otherwise please contact contact@abc.ca
 *
 */

package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by pennyfea on 9/13/17.
 *
 * Represents a tweey.
 *
 * @author pennyfea
 * @version 1.5
 * @see NormalTweet
 * @see importantTweet
 * @since 1.0
 *
 */

public abstract class Tweet implements  Tweetable{
    private String message;
    private Date date;
    private ArrayList<CommonMood> commonMoodList;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     *
     * Connects a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     *
     *
     */

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;

    }

    public String getMessage(){

        return message;
    }

    /**
     * Select the tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     *
     */

    public void setMessage(String message) throws  TweetTooLongException{
        if(message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns a date
     * @return date
     */

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();

    /**
     * Sets a date
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " |" + message;
    }


}

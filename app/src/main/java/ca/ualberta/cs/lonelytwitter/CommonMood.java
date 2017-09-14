package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by pennyfea on 9/13/17.
 */

public abstract class CommonMood {

    private String message;
    private Date date;


    public CommonMood(String message){
        date = new Date();
        this.message = message;
    }

    public CommonMood(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public Date getDate() {
        return date;
    }




}

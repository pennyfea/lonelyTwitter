package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by pennyfea on 9/13/17.
 */

public class Excited extends CommonMood {
    public Excited(String message)
    {
        super(message);
    }
    public String getMessage(){
        return "I'm Excited";
    }

    public Excited(String message, Date date) {
        super(message,date);
    }
}

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by pennyfea on 9/13/17.
 */

public class Happy extends CommonMood {

    public Happy(String message)
    {
        super(message);
    }

    public String getMessage() {
        return "I'm Happy";
    }

    public Happy(String message, Date date) {

        super(message,date);
    }
}

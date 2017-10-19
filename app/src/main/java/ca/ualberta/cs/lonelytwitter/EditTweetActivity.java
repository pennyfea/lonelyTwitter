/*
 * Copyright (c)  2017 Pennyfeather. CMPUT301, University of Alberta -- All rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of the license in this project, Otherwise please contact contact@abc.ca
 *
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

     /*   TextView tweet = (TextView) findViewById(R.id.textView);
        tweet.setText(getIntent().getStringExtra("GetMessage"));
    */
    }
}

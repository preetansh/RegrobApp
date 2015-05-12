package com.example.preetansh.tryinglogin;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class FeedbackActivity extends DashBoardActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        setHeader(getString(R.string.FeedbackActivityTitle), true, true);

    }
}

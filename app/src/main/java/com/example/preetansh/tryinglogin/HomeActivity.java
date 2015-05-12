package com.example.preetansh.tryinglogin;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by preetansh on 11/5/15.
 */
public class HomeActivity extends DashBoardActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.DEBUG) {
            Log.d(Constants.LOG, "onCreated called");
        }
        setContentView(R.layout.main);
        setHeader(getString(R.string.HomeActivityTitle), false, true);

    }

    /**
     * Button click handler on Main activity
     * @param v
     */
    public void onButtonClicker(View v)
    {
        Intent intent;

        switch (v.getId()) {
            case R.id.main_btn_properties:
                intent = new Intent(this, properties.class);
                startActivity(intent);
                break;

            case R.id.main_btn_new:
                intent = new Intent(this, AddNew.class);
                startActivity(intent);
                break;

            case R.id.main_btn_your_profile:
                intent = new Intent(this, YourProfile.class);
                startActivity(intent);
                break;

/*            case R.id.main_btn_honeycomb:
                intent = new Intent(this, Activity_Honeycomb.class);
                startActivity(intent);
                break;

            case R.id.main_btn_ics:
                intent = new Intent(this, Activity_ICS.class);
                startActivity(intent);
                break;

            case R.id.main_btn_jellybean:
                intent = new Intent(this, Activity_JellyBean.class);
                startActivity(intent);
                break;*/
            default:
                break;
        }
    }
}

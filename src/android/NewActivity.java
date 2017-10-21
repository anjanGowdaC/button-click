package com.example.sample.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_new", "layout", package_name));
    }
    public void start(View view) {
       Log.i("log","close btn clicked");
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

   }
}
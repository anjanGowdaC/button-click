package com.example.sample.plugin;


import android.app.Activity;
import android.os.Bundle;

import android.content.Context;
import android.widget.Toast;
import android.view.View;
import android.view.*;
import android.widget.EditText;

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("activity_new", "layout", package_name));
    }
    public void start(View view) {
       String package_name = getApplication().getPackageName();
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                //    EditText username = (EditText)findViewById(getApplication().getResources().getIdentifier("chat_text", "id", package_name));

                 
                // CharSequence txt = String.valueOf(username.getText().toString());
 
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

        setContentView(getApplication().getResources().getIdentifier("chat_activity", "layout", package_name));

   }
   public void closeme(View view) {
       
                Context context = getApplicationContext();
                CharSequence text = "Closed!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                this.finish();

   }
}
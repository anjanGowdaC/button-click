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
       
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                  EditText username = (EditText)findViewById(android.R.id.chat_text);

                // Context context = getApplicationContext();
                CharSequence txt = String.valueOf(username);
 
                Toast toast = Toast.makeText(context, txt, duration);
                toast.show();

   }
   public void closeme(View view) {
       
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

   }
}
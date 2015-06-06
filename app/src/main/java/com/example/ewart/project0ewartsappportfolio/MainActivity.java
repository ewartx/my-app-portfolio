package com.example.ewart.project0ewartsappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        Button b = (Button)view;

        // Use the button text as much as we can
        String buttonText = b.getText().toString().toLowerCase();

        // the 6th button text is very different, so we'll make an exception here
        if (buttonText.equals("capstone: my own app")) {
            buttonText = "capstone";
        }

        String outputText = "This button will launch my " + buttonText.replace(" app", "") + " app!";

        Toast.makeText(getApplicationContext(), outputText, Toast.LENGTH_SHORT).show();
    }
}

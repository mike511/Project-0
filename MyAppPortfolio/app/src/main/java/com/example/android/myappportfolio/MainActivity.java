package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    public void displaySpotifyApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my Spotify App", Toast
                .LENGTH_SHORT);
        toastMessage.show();

    }

    public void displayScoresApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my Scores App", Toast
                .LENGTH_SHORT);
        toastMessage.show();
    }

    public void displayLibraryApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my Library App", Toast
                .LENGTH_SHORT);
        toastMessage.show();
    }

    public void displayBuildItBiggerApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my Build It Bigger " +
                "App", Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    public void displayXYZReaderApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my XYX Reader App", Toast
                .LENGTH_SHORT);
        toastMessage.show();

    }

    public void displayCapstoneApp(View view){

        Toast toastMessage = Toast.makeText(this, "This button will launch my Capstone App",
                Toast.LENGTH_SHORT);
        toastMessage.show();

    }
}

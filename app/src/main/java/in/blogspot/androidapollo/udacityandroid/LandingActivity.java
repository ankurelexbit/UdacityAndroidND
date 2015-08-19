package in.blogspot.androidapollo.udacityandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener{

    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildItBigger;
    private Button baconReader;
    private Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        spotifyStreamer = (Button) findViewById(R.id.spotify_streamer_button);
        scoresApp = (Button) findViewById(R.id.score_app_button);
        libraryApp = (Button) findViewById(R.id.library_app_button);
        buildItBigger = (Button) findViewById(R.id.build_it_bigger_button);
        baconReader = (Button) findViewById(R.id.bacon_reader_button);
        capstone = (Button) findViewById(R.id.capstone_button);

        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        baconReader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_landing, menu);
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

    @Override
    public void onClick(View v) {

        int id = v.getId();
        
        switch (id) {
            case R.id.spotify_streamer_button :
                Toast.makeText(LandingActivity.this, "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.score_app_button :
                Toast.makeText(LandingActivity.this, "This button will launch Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_app_button :
                Toast.makeText(LandingActivity.this, "This button will launch Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger_button :
                Toast.makeText(LandingActivity.this, "This button will launch Build it Bigger", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bacon_reader_button :
                Toast.makeText(LandingActivity.this, "This button will launch Bacon Reader", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_button :
                Toast.makeText(LandingActivity.this, "This button will Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

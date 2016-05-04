package jainsaab.proto2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LeaderboardActivity extends Activity {
    public String filename = "abz.txt";//getString(R.string.myLocalFile);
    private static String logtag = "on LeaderboardActivity ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        Intent intent = getIntent();

        String message = "On Leaderboard screen";
        TextView textView = new TextView(this);
        //textView.setTextSize(40);
        textView.setText(message);
       // writeStuff();
        readStuff();

        //LinearLayout layout = (LinearLayout) findViewById(R.id.contentLeaderboard);
        //layout.addView(textView);  // put this back when you remove writestuff and readstuff

    }

//    public void writeStuff(){
//        String myString = "Aww yiss3";
//        FileOutputStream outputStream;
//        try {
//            outputStream = openFileOutput(filename,Context.MODE_PRIVATE);
//            outputStream.write(myString.getBytes());
//            outputStream.close();
//            Log.d(logtag,"saved file");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public void  readStuff(){
        Log.d(logtag,"inside readStuff");
        BufferedReader reader = null;
        TextView textView = new TextView(this);
        try {
            FileInputStream inputStream = openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String mLine;
            String fullLine = "";
            while ((mLine = bufferedReader.readLine()) != null) {
                fullLine = fullLine + mLine;
                Log.d(logtag,fullLine);
            }
            textView.setText(fullLine);
            LinearLayout layout = (LinearLayout) findViewById(R.id.contentLeaderboard);
            layout.addView(textView);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}


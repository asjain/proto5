package jainsaab.proto2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String logtag = "Proto2";//for use as the tag when logging
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonProfile = (Button)findViewById(R.id.buttonProfile);
        buttonProfile.setOnClickListener(profileListener); // Register the onClick listener with the implementation above

        Button buttonBalance = (Button)findViewById(R.id.buttonBalance);
        buttonBalance.setOnClickListener(balanceListener);

        Button buttonSchedule = (Button)findViewById(R.id.buttonSchedule);
        buttonSchedule.setOnClickListener(scheduleListener);

        Button buttonBet = (Button)findViewById(R.id.buttonBet);
        buttonBet.setOnClickListener(betListener);

        Button buttonLeaderBoard = (Button)findViewById(R.id.buttonLeaderboard);
        buttonLeaderBoard.setOnClickListener(leaderboardListener);
    }

    private View.OnClickListener profileListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(logtag,"onClick() called PROFILE");
            Intent intent = new Intent(v.getContext(), ProfileActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Selected PROFILE Button", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended PROFILE");
        }
    };
    private View.OnClickListener balanceListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(logtag,"onClick() called BALANCE");
            Intent intent = new Intent(v.getContext(), BalanceActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Selected BALANCE Button", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended BALANCE");
        }
    };
    private View.OnClickListener scheduleListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(logtag,"onClick() called SCHEDULE");
            Intent intent = new Intent(v.getContext(), ScheduleActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Selected SCHEDULE Button", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended SCHEDULE");
        }
    };
    private View.OnClickListener betListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(logtag,"onClick() called BET");
            Intent intent = new Intent(v.getContext(), BetActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Selected BET Button", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended BET");
        }
    };
    private View.OnClickListener leaderboardListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(logtag,"onClick() called LEADERBOARD");
            Intent intent = new Intent(v.getContext(), LeaderboardActivity.class);
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Selected LEADERBOARD Button", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended LEADERBOARD");
        }
    };
    @Override
    protected void onStart() {//activity is started and visible to the user
        Log.d(logtag,"onStart() called");
        super.onStart();
    }
    @Override
    protected void onResume() {//activity was resumed and is visible again
        Log.d(logtag,"onResume() called");
        super.onResume();

    }
    @Override
    protected void onPause() { //device goes to sleep or another activity appears
        Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
        super.onPause();

    }
    @Override
    protected void onStop() { //the activity is not visible anymore
        Log.d(logtag,"onStop() called");
        super.onStop();

    }
    @Override
    protected void onDestroy() {//android has killed this activity
        Log.d(logtag,"onDestroy() called");
        super.onDestroy();
    }
}

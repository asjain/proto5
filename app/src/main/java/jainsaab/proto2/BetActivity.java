package jainsaab.proto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class BetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet);
        Intent intent = getIntent();
        /*String message = "On Bet screen";
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);*/
                                                    // month  date     time      team1     team2
        String[][] myScheduleArray = new String [][] {{"04" ,  "9"  ,   "8" ,    "MI"   ,   "RPS"},
                                                     {"04"  ,  "10" ,   "8" ,    "KKR"	,   "DD"},
                                                     {"04"  ,  "11" ,   "8" ,    "KXIP"	,   "GL"},
                                                     {"04"  ,  "12" ,   "8" ,    "RCB"	,   "SRH"},
                                                     {"04"  ,  "13" ,   "8" ,    "KKR"	,   "MI"},
                                                     {"04"  ,  "14" ,   "8" ,    "GL"  	,   "RPS"},
                                                     {"04"  ,  "15" ,   "8" ,    "DD" 	,   "KXIP"},
                                                     {"04"  ,  "16" ,   "4" ,    "SRH"	,   "KKR"},
                                                     {"04"  ,  "16" ,   "8" ,    "MI" 	,   "GL"},
                                                     {"04"  ,  "17" ,   "4" ,    "KXIP"	,   "RPS"},
                                                     {"04"  ,  "17" ,   "8" ,    "RCB"	,   "DD"},
                                                     {"04"  ,  "18" ,   "8" ,    "SRH"	,   "MI"},
                                                     {"04"  ,  "19" ,   "8" ,    "KXIP"	,   "KKR"},
                                                     {"04"  ,  "20" ,   "8" ,    "MI"   ,   "RCB"},
                                                     {"04"  ,  "21" ,   "8" ,    "GL" 	,   "SRH"},
                                                     {"04"  ,  "22" ,   "8" ,    "RPS"	,   "RCB"},
                                                     {"04"  ,  "23" ,   "4" ,    "DD"  	,   "MI"},
                                                     {"04"  ,  "23" ,   "8" ,    "SRH"	,   "KXIP"},
                                                     {"04"  ,  "24" ,   "4" ,    "GL"  	,   "RCB"},
                                                     {"04"  ,  "24" ,   "8" ,    "RPS" 	,   "KKR"},
                                                     {"04"  ,  "25" ,   "8" ,    "KXIP"	,   "MI"},
                                                     {"04"  ,  "26" ,   "8" ,    "SRH"	,   "RPS"},
                                                     {"04"  ,  "27" ,   "8" ,    "DD"  	,   "GL"},
                                                     {"04"  ,  "28" ,   "8" ,    "MI"  	,   "KKR"},
                                                     {"04"  ,  "29" ,   "8" ,    "RPS" 	,   "GL"},
                                                     {"04"  ,  "30" ,   "4" ,    "DD"  	,   "KKR"},
                                                     {"04"  ,  "30" ,   "8" ,    "SRH"	,   "RCB"},
                                                     {"05"  ,  "1"  ,   "4" ,    "GL"  	,   "KXIP"},
                                                     {"05"  ,  "1"  ,   "8" ,    "RPS" 	,   "MI"},
                                                     {"05"  ,  "2"  ,   "8" ,    "RCB"	,   "KKR"},
                                                     {"05"  ,  "3"  ,   "8" ,    "GL"  	,   "DD"},
                                                     {"05"  ,  "4"  ,   "8" ,    "KKR"	,   "KXIP"},
                                                     {"05"  ,  "5"  ,   "8" ,    "DD"  	,   "RPS"},
                                                     {"05"  ,  "6"  ,   "8" ,    "SRH"	,   "GL"},
                                                     {"05"  ,  "7"  ,   "4" ,    "RCB"	,   "RPS"},
                                                     {"05"  ,  "7"  ,   "8" ,    "KXIP"	,   "DD"},
                                                     {"05"  ,  "8"  ,   "4" ,    "MI"  	,   "SRH"},
                                                     {"05"  ,  "8"  ,   "8" ,    "KKR"	,   "GL"},
                                                     {"05"  ,  "9"  ,   "8" ,    "KXIP"	,   "RCB"},
                                                     {"05"  ,  "10" ,   "8" ,    "RPS"	,   "SRH"},
                                                     {"05"  ,  "11" ,   "8" ,    "RCB"	,   "MI"},
                                                     {"05"  ,  "12" ,   "4" ,    "SRH"	,   "DD"},
                                                     {"05"  ,  "13" ,   "8" ,    "MI"  	,   "KXIP"},
                                                     {"05"  ,  "14" ,   "4" ,    "RCB"	,   "GL"},
                                                     {"05"  ,  "14" ,   "8" ,    "KKR"	,   "RPS"},
                                                     {"05"  ,  "15" ,   "4" ,    "MI"  	,   "DD"},
                                                     {"05"  ,  "15" ,   "8" ,    "KXIP"	,   "SRH"},
                                                     {"05"  ,  "16" ,   "8" ,    "KKR"	,   "RCB"},
                                                     {"05"  ,  "17" ,   "8" ,    "RPS" 	,   "DD"},
                                                     {"05"  ,  "18" ,   "8" ,    "RCB"	,   "KXIP"},
                                                     {"05"  ,  "19" ,   "8" ,    "GL"  	,   "KKR"},
                                                     {"05"  ,  "20" ,   "8" ,    "DD"  	,   "SRH"},
                                                     {"05"  ,  "21" ,   "4" ,    "RPS" 	,   "KXIP"},
                                                     {"05"  ,  "21" ,   "8" ,    "GL"  	,   "MI"},
                                                     {"05"  ,  "22" ,   "4" ,    "KKR"	,   "SRH"},
                                                     {"05"  ,  "22" ,   "8" ,    "DD"  	,   "RCB"}};


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        String date1 = sdf.format(new Date());

        TextView textView1 = (TextView) findViewById(R.id.textView4);
        textView1.setText(date1);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.contentBet);
        //layout.addView(textView);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
        sdf1.setTimeZone(TimeZone.getTimeZone("IST"));
        String myDate = sdf1.format(new Date());
        Log.d("date",myDate);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        sdf2.setTimeZone(TimeZone.getTimeZone("IST"));
        String myMonth = sdf2.format(new Date());
        Log.d("month",myMonth);
        String myTeamA1 = "";  // 4 pm match
        String myTeamA2 = "";
        String myTimeA  = "";

        String myTeamB1 = ""; // 8 pm match
        String myTeamB2 = "";
        String myTimeB  = "";

        if (myMonth.equals("04"))
            Log.d("matched month",myMonth);
        if (myDate.equals("16"))
            Log.d("matched date",myDate);
        for (int i=0; i < 56; i++)
            if (myMonth.equals(myScheduleArray[i][0])){  // match current month
                Log.d("matched month",myMonth);
                for (int j=1; j < 5; j++)
                    if(myDate.equals(myScheduleArray[i][j])){  // match current day
                        Log.d("matched date",myDate);
                        if ((myScheduleArray[i][2]).equals("04")){ // 4pm match
                            myTeamA1 = myScheduleArray[i][3];
                            myTeamA2 = myScheduleArray[i][4];
                            myTimeA = "4 PM";
                        }
                        else {
                            myTeamB1 = myScheduleArray[i][3];
                            myTeamB2 = myScheduleArray[i][4];
                            myTimeB = "8 PM";
                        }
                    }
            }

        String matchA = "";
        if(myTeamA1.isEmpty())
            matchA = "";
        else matchA = (myTimeA.concat("   ").concat(myTeamA1).concat(" vs ").concat(myTeamA2));
        String matchB = (myTimeB.concat("   ").concat(myTeamB1).concat(" vs ").concat(myTeamB2));

        TextView textView2 = (TextView) findViewById(R.id.textView5);
        textView2.setText(matchA);

        TextView textView3 = (TextView) findViewById(R.id.textView6);
        textView3.setText(matchB);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{myTeamA1,myTeamA2}; //{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        String[] items2 = new String[]{myTeamB1,myTeamB2};//{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);
    }
}

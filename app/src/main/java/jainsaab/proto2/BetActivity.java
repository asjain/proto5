package jainsaab.proto2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class BetActivity extends AppCompatActivity {

    BetData betMatch1;
    BetData betMatch2;
    public String selection1 = ""; // user selection from the dropdown menu
    public String selection2 = ""; // same
    String filename = "abz.txt";//getString(R.string.myLocalFile);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bet);
        Intent intent = getIntent();
        /*String message = "On Bet screen";
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);*/
        //------------------------------------------------------------------------------------------
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
                                                     {"05"  ,  "01"  ,   "4" ,    "GL"  	,   "KXIP"},
                                                     {"05"  ,  "01"  ,   "8" ,    "RPS" 	,   "MI"},
                                                     {"05"  ,  "02"  ,   "8" ,    "RCB"	,   "KKR"},
                                                     {"05"  ,  "03"  ,   "8" ,    "GL"  	,   "DD"},
                                                     {"05"  ,  "04"  ,   "8" ,    "KKR"	,   "KXIP"},
                                                     {"05"  ,  "05"  ,   "8" ,    "DD"  	,   "RPS"},
                                                     {"05"  ,  "06"  ,   "8" ,    "SRH"	,   "GL"},
                                                     {"05"  ,  "07"  ,   "4" ,    "RCB"	,   "RPS"},
                                                     {"05"  ,  "07"  ,   "8" ,    "KXIP"	,   "DD"},
                                                     {"05"  ,  "08"  ,   "4" ,    "MI"  	,   "SRH"},
                                                     {"05"  ,  "08"  ,   "8" ,    "KKR"	,   "GL"},
                                                     {"05"  ,  "09"  ,   "8" ,    "KXIP"	,   "RCB"},
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
        //------------------------------------------------------------------------------------------

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String date1 = sdf.format(new Date());

        TextView textView1 = (TextView) findViewById(R.id.textView4);
        textView1.setText(date1);
        //------------------------------------------------------------------------------------------
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.contentBet);
        //------------------------------------------------------------------------------------------

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
        sdf1.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String myDate = sdf1.format(new Date());
        //Log.d("date",myDate);
        //------------------------------------------------------------------------------------------
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        sdf2.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String myMonth = sdf2.format(new Date());
        //Log.d("month",myMonth);
        //------------------------------------------------------------------------------------------
        String myTeamA1 = "";  // 4 pm match
        String myTeamA2 = "";
        String myTimeA  = "";

        String myTeamB1 = ""; // 8 pm match
        String myTeamB2 = "";
        String myTimeB  = "";
        //------------------------------------------------------------------------------------------
        //if (myMonth.equals("04"))
            Log.d("current month",myMonth);
        //if (myDate.equals("17"))
            Log.d("current date",myDate);
        for (int i=0; i < 56; i++)
            if (myMonth.equals(myScheduleArray[i][0])){  // match current month
                Log.d("matched month",myMonth);
                for (int j=1; j < 5; j++)
                    if(myDate.equals(myScheduleArray[i][j])){  // match current day
                        Log.d("matched date",myDate);
                        if ((myScheduleArray[i][2]).equals("4")){ // 4pm match
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
        //------------------------------------------------------------------------------------------
        String matchA = "";
        String matchB = "";
        if(myTeamA1.isEmpty())
            matchA = "No Match at 4PM today";
        else matchA = (myTimeA.concat("   ").concat(myTeamA1).concat(" vs ").concat(myTeamA2));
        if(myTeamB1.isEmpty())
            matchB = "No Match at 8PM today";
        else matchB = (myTimeB.concat("   ").concat(myTeamB1).concat(" vs ").concat(myTeamB2));

        TextView textView2 = (TextView) findViewById(R.id.textView5);
        textView2.setText(matchA);
        //writeStuff(matchA);
        TextView textView3 = (TextView) findViewById(R.id.textView6);
        textView3.setText(matchB);
        //writeStuff(matchB);
        //------------------------------------------------------------------------------------------

        betMatch1 =  new BetData();
        betMatch2 =  new BetData();
        //------------------------------------------------------------------------------------------

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{myTeamA1,myTeamA2}; //{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //betMatch1.setM_teamSelected( parent.getItemAtPosition(position).toString());
                selection1 = (String) parent.getItemAtPosition(position);
                Log.d("user selection",selection1);
                //Toast.makeText(BetActivity.this, "Selected "+selection1, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do nothing for now
            }
        });
        //------------------------------------------------------------------------------------------

        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        String[] items2 = new String[]{myTeamB1,myTeamB2};//{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);
        dropdown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selection2 = (String) parent.getItemAtPosition(position);
                Log.d("user selection",selection2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        //------------------------------------------------------------------------------------------


        Switch sw1 = (Switch)findViewById(R.id.switch1);  // matchA
        sw1.setChecked(false);
        //sw1.setOnClickListener(lockSw1);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(BetActivity.this, "Locked choice 1", Toast.LENGTH_LONG).show();
                    Log.d("user locked choice 1",selection1);
                    betMatch1.setM_teamSelected(selection1);
                }else{
                    Toast.makeText(BetActivity.this, "Deselected choice 1", Toast.LENGTH_LONG).show();
                    Log.d("deselected choice1",selection1);
                }
            }
        });

        Switch sw2 = (Switch)findViewById(R.id.switch2); //matchB
        sw2.setChecked(false);
        //sw2.setOnClickListener(lockSw2);
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(BetActivity.this, "Locked choice 2", Toast.LENGTH_LONG).show();
                    Log.d("user locked choice 2",selection2);
                    betMatch2.setM_teamSelected(selection2);
                    String temp = betMatch2.getM_teamSelected();
                    writeStuff(temp);
                }else{
                    Toast.makeText(BetActivity.this, "Deselected choice 2", Toast.LENGTH_LONG).show();
                    Log.d("deselected choice2",selection2);
                }
            }
        });

        //------------------------------------------------------------------------------------------
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH");
        sdf3.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String myTime = sdf3.format(new Date());
        Log.d("Current time",myTime);

        if(myTime.equals("15")) {  // disable switch for 1 hr before the match
            Toast.makeText(BetActivity.this, "Disabled locking for match 1 till 4 PM", Toast.LENGTH_LONG).show();
            sw1.setEnabled(false);
            Log.d("sampling at 3 pm",selection1);
            betMatch1.setM_teamSelected(selection1);
        }
        if(myTime.equals("21")) {
            Toast.makeText(BetActivity.this, "Disabled locking for match 2 till 8 PM", Toast.LENGTH_LONG).show();
            sw2.setEnabled(false);
            Log.d("user selection",selection2);
            betMatch2.setM_teamSelected(selection2);
        }
        //------------------------------------------------------------------------------------------
        //writeStuff(betMatch1.getM_teamSelected());
        //writeStuff("abhishek");
        //betMatch2.setM_teamSelected(myTeamB2); // for test

    }
    public void writeStuff(String string){
        String myString = string;
        FileOutputStream outputStream;
        String filename = "abz.txt";
        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(myString.getBytes());
            outputStream.close();
            Log.d("from BetActivity","saved file");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


//    private View.OnClickListener lockSw1 = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(BetActivity.this, "Locked choice 1", Toast.LENGTH_LONG).show();
//            Log.d("user locked this ",selection1);
//            betMatch1.setM_teamSelected(selection1);
//        }
//    };
//
//    private View.OnClickListener lockSw2 =  new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(BetActivity.this, "Locked choice 2", Toast.LENGTH_LONG).show();
//            Log.d("user locked this ",selection2);
//            betMatch2.setM_teamSelected(selection2);
//        }
//    };

}

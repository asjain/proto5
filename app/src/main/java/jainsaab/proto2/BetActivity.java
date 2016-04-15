package jainsaab.proto2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
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

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        String date1 = sdf.format(new Date());

        TextView textView1 = (TextView) findViewById(R.id.textView4);
        textView1.setText(date1);
        textView1.setTextSize(18);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.contentBet);
        //layout.addView(textView);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        String[] items2 = new String[]{"MI", "RPS", "KKR", "DD", "KXIP",  "GL", "RCB", "SRH"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);
    }
}

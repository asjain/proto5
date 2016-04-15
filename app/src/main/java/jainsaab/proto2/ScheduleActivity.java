package jainsaab.proto2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        Intent intent = getIntent();
        /*String message = "On Schedule screen";
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.contentSchedule);
        layout.addView(textView);*/

        Button buttonFullSchedule = (Button)findViewById(R.id.buttonFullSchedule);
        buttonFullSchedule.setOnClickListener(fullSch_listener);
    }
    private View.OnClickListener fullSch_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),FullScheduleActivity.class);
            startActivity(intent);
        }
    };
}

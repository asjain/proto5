package jainsaab.proto2;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by jainabhi on 4/16/2016.
 */
public class BetData {
    private String m_teamSelected;
    //private String m_teamB;
    private SimpleDateFormat m_sampleTime;

    public void setM_teamSelected(String m_teamSelected) {
        this.m_teamSelected = m_teamSelected;
        Log.d("inside BetData Set ",m_teamSelected);
    }

    public String getM_teamSelected() {
        //Log.d("inside BetData Get ",m_teamSelected);
        return this.m_teamSelected;
    }
    public SimpleDateFormat getM_sampleTime() {

        return m_sampleTime;
    }

    public void setM_sampleTime(SimpleDateFormat m_sampleTime) {

        this.m_sampleTime = m_sampleTime;
    }

    public void fixBet(){



    //public String getM_teamB() {
    //    return m_teamB;
    //}

    //public void setM_teamB(String m_teamB) {
    //    this.m_teamB = m_teamB;
    //}


    }
}


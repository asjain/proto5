package jainsaab.proto2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by jainabhi on 4/16/2016.
 */
public class BetData {
    private String m_teamA;
    private String m_teamB;
    private SimpleDateFormat m_sampleTime;

    public String getM_teamA() {
        return m_teamA;
    }

    public void setM_teamA(String m_teamA) {
        this.m_teamA = m_teamA;
    }

    public String getM_teamB() {
        return m_teamB;
    }

    public void setM_teamB(String m_teamB) {
        this.m_teamB = m_teamB;
    }

    public SimpleDateFormat getM_sampleTime() {
        return m_sampleTime;
    }

    public void setM_sampleTime(SimpleDateFormat m_sampleTime) {
        this.m_sampleTime = m_sampleTime;
    }

    public void fixBet(){

    }
}


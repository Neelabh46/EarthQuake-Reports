package com.example.android.quakereport;

public class EarthQuake {

    private String place;
    private  double  magnitude;
    private long  date;
    private String murl;
    public EarthQuake(String plc,double mag, long  dte,String url)
    {
        place=plc;
        magnitude=mag;
        date=dte;
        murl=url;
    }

    public String getPlace()
    {
        return place;
    }
    public double  getMagnitude()
    {
        return magnitude;
    }
    public long getDate()
    {
        return date;
    }
    public String getMurl()
    {
        return murl;
    }



}

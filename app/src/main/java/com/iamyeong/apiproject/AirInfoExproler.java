package com.iamyeong.apiproject;

import android.net.Uri;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;

public class AirInfoExproler {
    //API select method

    private static final String KEY = "VHCuTt%2FKH7%2FFAg%2Bo1C0pYfJiO7Hw%2BB6mKffyTlI7hxPmBPKn%2BHP4i7Pq2%2BvOaWzG1LMPAuUHhgeE%2B%2BSE8hHq6Q%3D%3D";
    private static final String URL = "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";


    public AirInfoExproler() {




    }

    public String getData() {

        StringBuffer buffer = new StringBuffer();

        try{
            java.net.URL url = new java.net.URL(URL); // Create object of URL
            InputStream is = url.openStream(); // Connect InputStream to url info
            XmlPullParserFactory xmlFactory = XmlPullParserFactory.newInstance();
            XmlPullParser xmlPullParser = xmlFactory.newPullParser();
            xmlPullParser.setInput(new InputStreamReader(is, "UTF-8"));

            String tag;

            xmlPullParser.next();




        } catch(Exception e) {
            e.printStackTrace();
        }


        return "";

    }









}

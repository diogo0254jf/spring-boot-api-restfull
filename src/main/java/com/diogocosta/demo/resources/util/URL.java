package com.diogocosta.demo.resources.util;

import java.net.URLDecoder;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class URL {
    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    public static Date convertDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(textDate);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}

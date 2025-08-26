package coreJava;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateTime {
    public static void main(String[] args) {
       
        Date now = new Date();

        
        SimpleDateFormat format1 = new SimpleDateFormat("EEE MMM dd");

        
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss z yyyy");

        
        System.out.println("Current date time: " + format1.format(now));
        System.out.println(format2.format(now));
    }
}
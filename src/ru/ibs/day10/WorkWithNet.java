package ru.ibs.day10;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WorkWithNet {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://google.com");
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof HttpURLConnection) {
                HttpURLConnection con = (HttpURLConnection) urlConnection;
                // Not necessary for GET requests
                con.setRequestMethod("GET");
                /*
                If request body is required

                con.setDoOutput(true);
                con.getOutputStream()
                */
                // If request headers are required
                //con.setRequestProperty("Content-Type", "text");

                // This command actually opens a connection
                byte[] result = con.getInputStream().readAllBytes();
                System.out.println(con.getResponseCode());
                System.out.println(new String(result));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

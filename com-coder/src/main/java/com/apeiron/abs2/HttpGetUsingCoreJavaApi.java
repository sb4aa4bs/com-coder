package com.apeiron.abs2;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

//clone https://github.com/sb4aa4bs/spring-boot-playground1.git and run the app to make the score endpoint available!

public class HttpGetUsingCoreJavaApi {

    public static void getUsingUrl() {
        String line = null;
        URL url = null;
        try {
            url = new URL("http://localhost:8080/v1/playground1/score");
            InputStream in;
            URLConnection urlConnection = url.openConnection();
            try (InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream())) {
                try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println("getUsingUrl: Http Response from Score Service is " + line.toString());
                    }
                }
            }
        } catch (IOException ioex) {
            System.out.println("Exception Occurred");
            ioex.getCause();
        }
    }

    public static void getUsingHttpUrlConnection() {
        URL url = null;
        String line = null;
        try {
            url = new URL("http://localhost:8080/v1/playground1/score");
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setRequestProperty("correlationId", "123456789");
            InputStream in;
            try (InputStream inputStream = httpUrlConnection.getInputStream()) {
                try (Reader reader = new InputStreamReader(inputStream)) {
                    try (BufferedReader bufferedReader = new BufferedReader(reader)) {
                        while ((line = bufferedReader.readLine()) != null) {
                            System.out.println("getUsingHttpUrlConnection : Http Response from Score Service is " + line.toString());
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception Occurred");
            ex.getCause();
        }

    }

    public static void main(String[] args) throws IOException {
        // using a plain url api
        getUsingUrl();
        getUsingHttpUrlConnection();
    }
}

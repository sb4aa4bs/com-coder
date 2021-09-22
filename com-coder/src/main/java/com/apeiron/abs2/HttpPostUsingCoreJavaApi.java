package com.apeiron.abs2;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

//clone https://github.com/sb4aa4bs/spring-boot-playground1.git and run the app to make the score endpoint available!

public class HttpPostUsingCoreJavaApi {

    public static void main(String[] args) throws IOException {
        postUsingHttpUrlConnection();
    }

    public static void postUsingHttpUrlConnection() throws IOException {
        URL postUrl = new URL("http://localhost:8080/v1/playground1/echo");
        String jsonPayload = "{  \"x\": \"Bharath\" }";
        String lineContent = null;
        StringBuilder respStr = new StringBuilder();
        HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
        // set the http method to POST
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "application/json");
        connection.setDoOutput(Boolean.TRUE);
        try (OutputStream outputStream = connection.getOutputStream()) {
            outputStream.write(jsonPayload.getBytes());
        }
        InputStream stream = connection.getInputStream();
        Reader reader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((lineContent = bufferedReader.readLine()) != null) {
            respStr.append(lineContent);
        }
        System.out.println("Post Response Payload is " + respStr.toString());
    }
}

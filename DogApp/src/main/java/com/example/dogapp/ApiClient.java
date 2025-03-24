package com.example.dogapp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ApiClient {
    private static final String BASE_URL = "https://dog.ceo/api/breed/";

    public static String getDogImageByBreed(String breed) throws IOException {
        String apiUrl = BASE_URL + breed + "/images/random";
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();

        JSONObject json = new JSONObject(response);
        return json.getString("message"); // Return the image URL
    }
}

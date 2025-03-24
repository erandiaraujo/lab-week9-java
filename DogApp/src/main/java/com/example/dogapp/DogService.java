package com.example.dogapp;

import java.io.IOException;

public class DogService {
    public String fetchDogImage(String breed) {
        try {
            return ApiClient.getDogImageByBreed(breed);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error fetching image!";
        }
    }
}

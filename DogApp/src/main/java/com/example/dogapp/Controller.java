package com.example.dogapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private Button btnLoadDog;

    @FXML
    private ImageView imgDog;

    @FXML
    private ComboBox<String> breedSelector;

    private final DogService dogService = new DogService();

    @FXML
    public void initialize() {
        breedSelector.getItems().addAll(
                "bulldog", "labrador", "poodle", "husky", "beagle"
        );
        breedSelector.setValue("bulldog"); // default breed
    }

    @FXML
    private void loadDogImage() {
        String selectedBreed = breedSelector.getValue();
        if (selectedBreed != null) {
            String imageUrl = dogService.fetchDogImage(selectedBreed);
            imgDog.setImage(new Image(imageUrl));
        }
    }
}

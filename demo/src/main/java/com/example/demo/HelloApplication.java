package com.example.demo;

import javafx.application.Application;

import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        MainWindow mainWindow = new MainWindow(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
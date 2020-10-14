package com.cs122.classlabs.chap4;


import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//************************************************************************
//  ImageDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates a the use of Image and ImageView objects.
//************************************************************************

public class ImageDisplay extends Application
{
    //--------------------------------------------------------------------
    //  Displays an image centered in a window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image img = new Image("https://i.guim.co.uk/img/media/c35cf5cef2bd467fb261014ebbd27cba69df55ef/123_494_3978_2387/master/3978.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=8b79f474071f6f81f9e3331bb20fad87");
        ImageView imgView = new ImageView(img);

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        imgView.setViewport(new Rectangle2D(600, 200, 300, 300));
        
        Scene scene = new Scene(pane, 500, 350);

        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

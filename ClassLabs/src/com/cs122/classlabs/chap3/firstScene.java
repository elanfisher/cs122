package com.cs122.classlabs.chap3;

//************************************************************************
//  HelloJavaFX.java       Author: Lewis/Loftus
//
//  Demonstrates a basic JavaFX application.
//************************************************************************

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
import javafx.scene.shape.*;
//import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class firstScene extends Application
{
    public void start(Stage primaryStage)
    {
        Text yayText = new Text(210, 420, "Im learning GUI");
        yayText.setStroke(Color.WHITE);
        
        Circle circ = new Circle(250,250,250);
        
        Rectangle rect = new Rectangle(100,100,150,50);
        rect.setStroke(Color.BLUEVIOLET);
        rect.setStrokeWidth(2);
        rect.setFill(Color.BLUEVIOLET);
        
        Group root = new Group(circ,yayText,rect);        
        Scene scene = new Scene(root, 500, 500, Color.WHITE);
        
        primaryStage.setTitle("GUI Programming");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

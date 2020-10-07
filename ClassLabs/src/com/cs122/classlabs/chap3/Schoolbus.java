package com.cs122.classlabs.chap3;


//************************************************************************
//  Snowman.java       Author: Lewis/Loftus
//
//  Demonstrates the translation of a set of shapes.
//************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Schoolbus extends Application
{
    //--------------------------------------------------------------------
    //  Presents a snowman scene.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {   
    	Rectangle body = new Rectangle(0, 0, 400, 250);
        body.setFill(Color.YELLOW);        
        Circle leftWheel = new Circle(100, 250, 30);
        leftWheel.setFill(Color.BLACK);        
        Circle rightWheel = new Circle(300, 250, 30);
        rightWheel.setFill(Color.BLACK);        
        Group wheels = new Group(leftWheel,rightWheel);
        
        Rectangle w1 = new Rectangle(10, 30, 60, 100);
        w1.setFill(Color.BLACK);
        Rectangle w2 = new Rectangle(10+70+70+70+70, 30, 60, 100);
        w2.setFill(Color.BLACK);
        Rectangle w3 = new Rectangle(10+70, 30, 60, 100);
        w3.setFill(Color.BLACK);
        Rectangle w4 = new Rectangle(10+70+70, 30, 60, 100);
        w4.setFill(Color.BLACK);
        Rectangle w5 = new Rectangle(10+70+70+70, 30, 60, 100);
        w5.setFill(Color.BLACK);
        
        Group windows = new Group(w1,w2,w3,w4,w5);
        
        Group bus = new Group(body,windows,wheels);
        
        bus.setTranslateX(90);
        bus.setTranslateY(150);
        
        Rectangle ground = new Rectangle(0, 420, 600, 500);
        ground.setFill(Color.GRAY);

        Group root = new Group(ground, bus);
        Scene scene = new Scene(root, 600, 500, Color.PURPLE);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

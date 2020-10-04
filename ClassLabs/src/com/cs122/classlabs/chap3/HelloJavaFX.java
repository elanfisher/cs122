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

public class HelloJavaFX extends Application
{
    //--------------------------------------------------------------------
    //  Creates and displays two Text objects in a JavaFX window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
    	int wid = 520;
        int hei = 200;
        Text hello = new Text(50, 50, "Hello, JavaFX!");
        Text question = new Text(120, 80, "How's it going?");
        Text question2 = new Text(120, 160, "Are you getting any ideas?");
        
        Line simpleLine = new Line(0, 0, 520, 200);
        
        Circle simpleCircle = new Circle(260,100,20);
        Rectangle simpleRectangle = new Rectangle(200,100,20,30);
        Ellipse e = new Ellipse(200, 30, 10,20);
        
        Group root = new Group(e,simpleRectangle, hello, question, question2, simpleLine, simpleCircle);        
        Scene scene = new Scene(root, 520, 200, Color.ANTIQUEWHITE);
        
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Launches the JavaFX application. This method is not required
    //  in IDEs that launch JavaFX applications automatically.
    //--------------------------------------------------------------------
    public static void main(String[] args)
    {
        launch(args);
    }
}

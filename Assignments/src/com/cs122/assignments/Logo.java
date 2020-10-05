package com.cs122.assignments;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.application.Application;

public class Logo extends Application
{
	/*
	 * Write a JavaFX application to make a logo(Imagine you are build a company) in a 300 x 300 window/stage
		Shift the entire snowman 40 pixels right
		Write a program that takes an input from user with following conditions
		If the length is greater than 6, throw exception
		if the 6th character is not lowercase letter, it throws an exception.
	 */
	public void start(Stage primaryStage)
    {        
        Circle circle = new Circle(150, 150, 150);
        circle.setFill(Color.CORNSILK);
        
        Rectangle rect = new Rectangle(30, 150, 250, 60);
        rect.setStroke(Color.BROWN);
        rect.setStrokeWidth(2);
        rect.setFill(Color.ALICEBLUE);        
        
        Ellipse ellipse = new Ellipse(150, 100, 50, 50);
        ellipse.setFill(Color.DARKCYAN);
        
        Text quote = new Text(30, 170, "Tell me how my driving is. (555)-555-5555");
        
        Group root = new Group(circle, ellipse, rect, quote);
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Logo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

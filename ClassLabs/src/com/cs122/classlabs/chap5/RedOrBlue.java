package com.cs122.classlabs.chap5;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//************************************************************************
//  RedOrBlue.java       Author: Lewis/Loftus
//
//  Demonstrates the use of one handler for multiple buttons.
//************************************************************************

public class RedOrBlue extends Application
{
    private Button redButton, blueButton, greenButton;
    private FlowPane pane;
    
    //--------------------------------------------------------------------
    //  Presents a GUI with two buttons that control the color of the
    //  pane background.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        redButton = new Button("Red!");
        redButton.setOnAction(this::processColorButton);
        
        blueButton = new Button("Blue!");
        blueButton.setOnAction(this::processColorButton);
        
        greenButton = new Button("Green!");
        greenButton.setOnAction(this::processColorButton);
        
        pane = new FlowPane(redButton, blueButton, greenButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");
        
        Scene scene = new Scene(pane, 300, 100);
        
        primaryStage.setTitle("Red, Blue, or Green?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //--------------------------------------------------------------------
    //  Determines which button was pressed and sets the pane color
    //  accordingly.
    //--------------------------------------------------------------------
    public void processColorButton(ActionEvent event)
    {
        if (event.getSource() == redButton)
            pane.setStyle("-fx-background-color: crimson");
        else if(event.getSource() == greenButton) {
        	pane.setStyle("-fx-background-color: green");
        }
        else {
        	pane.setStyle("-fx-background-color: deepskyblue");
        }
                
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

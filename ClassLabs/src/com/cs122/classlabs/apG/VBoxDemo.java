package com.cs122.classlabs.apG;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.event.*;

// Used only to generate screen shots for appendix.
public class VBoxDemo extends Application
{
    public void start(Stage primaryStage)
    {
        RadioButton sepiaButton = new RadioButton("Sepia");
        RadioButton monoButton = new RadioButton("Monochrome");
        RadioButton colorButton = new RadioButton("Full Color");
        
        Separator sep = new Separator();
        Label colorLabel = new Label("Frame:");
        ColorPicker colorPicker = new ColorPicker(Color.ORANGE);
        
        Rectangle rect = new Rectangle(350, 300, null);
        rect.setStroke(colorPicker.getValue());
        rect.setStrokeWidth(6);
        
        VBox colorControls = new VBox(sepiaButton, monoButton, colorButton,
            sep, colorLabel, colorPicker, rect);
        colorControls.setStyle("-fx-background-color: skyblue");
        colorControls.setPadding(new Insets(20, 10, 20, 10));
        colorControls.setSpacing(10);
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            {  
                Color c = colorPicker.getValue();  
                rect.setStroke(colorPicker.getValue());
            } 
        }; 
        
        colorPicker.setOnAction(event);
        
        Scene scene = new Scene(colorControls, 600, 500);
        
        primaryStage.setTitle("VBox Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

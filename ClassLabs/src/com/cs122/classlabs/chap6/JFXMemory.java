package com.cs122.classlabs.chap6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JFXMemory extends Application{

	public void start(Stage primaryStage)
	{
		Button b1 = new Button("Push Me!");
        Button b2 = new Button("or else");
        
        Text mainText = new Text("Woah buddy;");
        
        VBox pane = new VBox(b1, b2, mainText);
        pane.setStyle("-fx-background-color: wheat");
        pane.setPadding(new Insets(20, 10, 20, 10));
        pane.setSpacing(10);
		
        b1.setOnAction(e -> {
        	mainText.setFill(Color.SKYBLUE);
        	mainText.setText("no thank you");
        });
        
        b2.setOnAction(e -> {
        	mainText.setFill(Color.CRIMSON);
        	mainText.setText("thank you");
        });
        
		Scene scene = new Scene(pane, 300, 300);
		
		primaryStage.setTitle("Flow Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}

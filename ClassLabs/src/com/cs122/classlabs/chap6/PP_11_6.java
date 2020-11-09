package com.cs122.classlabs.chap6;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class PP_11_6 extends Application{

	public static void main(String[] args) 
	{
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		
		Button b1 = new Button("first");
		Button b2 = new Button("sec");
		Button b3 = new Button("third");
		
		Separator sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);
		
		Separator sep2 = new Separator();
		sep2.setOrientation(Orientation.VERTICAL);
		
		TilePane pane = new TilePane(b1, sep, b2, sep2, b3);
		pane.setStyle("-fx-background-color: black");
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setVgap(20);

		Scene scene = new Scene(pane, 300, 300);
		
		primaryStage.setTitle("PP 11.6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}

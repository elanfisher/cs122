package com.cs122.classlabs.chap11;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

//************************************************************************
//  MapViewer.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a scroll pane.
//************************************************************************

public class MapViewer extends Application
{
    //--------------------------------------------------------------------
    //  Presents a scroll pane that allows the user to determine which
    //  section of the underlying image (a map of the USA) is visible.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Image img = new Image("file:///C:/Users/Elan/Desktop/CS122%20N/elanfisher/ClassLabs/src/com/cs122/classlabs/chap11/tiger.jpg");
        ImageView imgView = new ImageView(img);

        ScrollPane root = new ScrollPane(imgView);
        root.setHbarPolicy(ScrollBarPolicy.ALWAYS);
        
        Scene scene = new Scene(root, 100, 100);
        
        primaryStage.setTitle("Map Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public static void main(String[] args)
    {
        launch(args);
    }
}

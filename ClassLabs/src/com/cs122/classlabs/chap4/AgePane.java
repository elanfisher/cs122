package com.cs122.classlabs.chap4;


import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class AgePane extends GridPane
{
    private Label result;
    private TextField YOB;

    public AgePane()
    {
        Font font = new Font(18);
        
        Label inputLabel = new Label("Year of Birth:");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);
        
        Label outputLabel = new Label("Age:");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.CENTER);
        
        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);
        
        YOB = new TextField();
        YOB.setFont(font);
        YOB.setPrefWidth(70);
        YOB.setAlignment(Pos.CENTER);
        YOB.setOnAction(this::processReturn);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(20);
        setStyle("-fx-background-color: cyan");
        
        add(inputLabel, 0, 0);
        add(YOB, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }
    
    public void processReturn(ActionEvent event)
    {
    	System.out.println(event.getSource());
        int fahrenheitTemp = Integer.parseInt(YOB.getText());
        if(fahrenheitTemp < 1900)
        {
        	result.setText("Invalid Age");
        }
        else
        {
        	int ageFinal = (2020-fahrenheitTemp);
            result.setText(ageFinal + "");
        }
        
    }
}

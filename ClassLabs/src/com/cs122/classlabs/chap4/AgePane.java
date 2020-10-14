package com.cs122.classlabs.chap4;


import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AgePane extends GridPane
{
    private Label result;
    private TextField yOB;
    private Label cent;
    
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
        
        yOB = new TextField();
        yOB.setFont(font);
        yOB.setPrefWidth(70);
        yOB.setAlignment(Pos.CENTER);
        yOB.setOnAction(this::processReturn);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(20);
        setStyle("-fx-background-color: cyan");
        
        cent = new Label("");
        cent.setTextFill(Color.RED);
        inputLabel.setFont(font);
        GridPane.setHalignment(cent, HPos.CENTER);
        
        add(inputLabel, 0, 0);        
        add(yOB, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
        add(cent,0,2);
    }
    
    public void processReturn(ActionEvent event)
    {
    	//System.out.println(event.getSource());
    	//if age is > 100 "good job you lived more than a century, 
    	//if you enter a text throw "age should be a number"
        try{

        	int finalAge = Integer.parseInt(yOB.getText());
        	
        	if(finalAge < 1900)
            {
            	cent.setText("Good job! You lived over a century.");
            
            }
            else
            {
            	int ageFinal = (2020-finalAge);
                result.setText(ageFinal + "");
            }
        }
        catch(Exception e)
        {
        	cent.setText("Age should be a number.");
        }
    }
}

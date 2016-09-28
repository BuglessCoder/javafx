package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestBMI extends Application{
		
	 private TextField t1 = new TextField();
	 private TextField t2 = new TextField();
	 private TextField t3 = new TextField();
	 public void start(Stage primaryStage){
		 GridPane g = new GridPane();
		 
		 g.add(new Label("体重(公斤) "),0,0);
	     g.add(t1,1,0);
	     g.add(new Label("身高(米)   "),0,1);
	     g.add(t2,1,1);
	     g.add(new Label("BMI        "),0,2);
	     g.add(t3,1,2); 
	     
	       
		 
		 
		 Button b = new Button("计算BMI");
		 b.setOnAction(e -> {
			 double weight = Double.parseDouble(t1.getText());
	         double height = Double.parseDouble(t2.getText()); 
	         double bmi = weight/(height * height);                          
	         t3.setText(bmi + ""); 
                       
		 });
		 g.add(b,1,3);
		 
		 Scene scene = new Scene(g,250,100);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("BMI计算");
	        primaryStage.show();
	 
	 }
	 public static void main(String[] args){
         Application.launch(args);
       }  
	
}
 


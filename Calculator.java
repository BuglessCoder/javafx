package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calculator extends Application {
	private TextField t1 = new TextField();
	private TextField t2 = new TextField();
	private TextField t3 = new TextField();

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane p = new BorderPane();
		
		HBox h1 = new HBox();
		h1.getChildren().addAll(t1,new Label(" "),t2,new Label("="),t3);
		
		Button b1 = new Button("¼Ó");
		b1.setOnAction(e ->{
			h1.getChildren().set(1, new Label("+"));
			double x = Integer.parseInt(t1.getText());
			double y = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(x+y));
		});
		
		Button b2 = new Button("¼õ");
		b2.setOnAction(e ->{
			h1.getChildren().set(1, new Label("-"));
			double x = Integer.parseInt(t1.getText());
			double y = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(x-y));
		});
		
		Button b3 = new Button("³Ë");
		b3.setOnAction(e ->{
			h1.getChildren().set(1, new Label("*"));
			double x = Integer.parseInt(t1.getText());
			double y = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(x*y));
		});
		
		Button b4 = new Button("³ý");
		b4.setOnAction(e ->{
			h1.getChildren().set(1, new Label("/"));
			double x = Integer.parseInt(t1.getText());
			double y = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(x/y));
		});
		
		HBox h2 = new HBox();
		h2.getChildren().addAll(b1,b2,b3,b4);
		h2.setAlignment(Pos.CENTER);
		
		p.setTop(h1);
		p.setBottom(h2);
		
		
		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.setTitle("¼ÆËãÆ÷");
		primaryStage.show();
		
	}
	
	public static void main(String args[]){
		Application.launch(args);
	}

}

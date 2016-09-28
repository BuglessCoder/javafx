package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Chufa extends Application{
	
	private TextField t1 = new  TextField();
	private TextField t2 = new  TextField();
	private TextField t3 = new  TextField();

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane g = new GridPane();
		
		g.add(new Label("Number 1"), 0, 0);
		g.add(t1, 1, 0);
		g.add(new Label("Number 2"), 0, 1);
		g.add(t2, 1, 1);
		g.add(new Label("Result"), 0, 2);
		g.add(t3, 1, 2);
		
		HBox h = new HBox();
		
		Button b1 = new Button("Divide");
		b1.setOnAction(e ->{
			int x = Integer.parseInt(t1.getText());
			int y = Integer.parseInt(t2.getText());
			
			t3.setText(String.valueOf(x/y));
													
		});
		
		Button b2 = new Button("Muliiply");
		b2.setOnAction(e ->{
			int x = Integer.parseInt(t1.getText());
			int y = Integer.parseInt(t2.getText());
			
			t3.setText(String.valueOf(x*y));
													
		});
		
		h.getChildren().addAll(b1,b2);
		
		g.add(h, 1, 3);
		
		Scene scene = new Scene(g);
		arg0.setScene(scene);
		arg0.setTitle("³Ë³ý·¨");
		arg0.show();
	}
	
	public static void main(String a[]){
		Application.launch(a);
	}
	
	
}

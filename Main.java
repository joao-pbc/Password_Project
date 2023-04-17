package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.text.Text;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Group group = new Group();
			
			Button btn1 = new Button();
			
			CheckBox cBox = new CheckBox();
			
			CheckBox cBox2 = new CheckBox();
			
			CheckBox cBox4 = new CheckBox();
			
			BackgroundFill bimba = new BackgroundFill(Color.WHITE, null, null);
			
			Text txt = new Text("a nova senha aparecera aqui");
			
			BorderPane root = new BorderPane();
			
			Scene scene = new Scene(root,400,400);
			
			setAll(btn1, cBox, cBox2, cBox4, txt);
			
			root.setBackground(new Background(bimba));
			
			group.getChildren().addAll(btn1, cBox, cBox2, cBox4, txt);
			
			root.getChildren().add(group);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			btn1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				public void handle(MouseEvent me) {
					
					txt.setText(PasswordChecker.generateString(cBox.isSelected(), cBox2.isSelected(),cBox4.isSelected()));
					
				}
				
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void setAll(Button btn1, CheckBox cBox, CheckBox cBox2, CheckBox cBox4, Text txt) {
		cBox.setLayoutX(50);
		cBox.setLayoutY(20);
		cBox.setText("Usar caracteres especiais?\n"
					+ "(A, B, C...)");
		
		cBox2.setLayoutX(50);
		cBox2.setLayoutY(95);
		cBox2.setText("Usar caracteres Numericos?\n"
				+ "(1, 2, 3...)");
		
		cBox4.setLayoutX(50);
		cBox4.setLayoutY(170);
		cBox4.setText("Usar caracteres em maiusculo??\n"
					+ "(#, @, %...)");

		
		btn1.setLayoutX(50);
		btn1.setLayoutY(250);
		
		txt.setLayoutX(150);
		txt.setLayoutY(265);
		
		btn1.setText("Gerar senha");
	}
	
		
}

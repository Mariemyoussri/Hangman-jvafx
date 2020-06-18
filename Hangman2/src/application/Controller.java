package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {
	
	Hangman man = new Hangman();
	
	@FXML 
	private Button Exit;
	@FXML 
	private Button how;
	@FXML 
	private Button start;
	@FXML 
	private Label score;
	@FXML 
	private Label lives;
	@FXML 
	private Label word;
	
	public void exit(ActionEvent event) {
		Exit.setOnAction(e -> System.exit(0));
	}
	
	public void how(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/How.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}
	
	public void back(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Menu.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	public void start(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/application/Category.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void game(ActionEvent event) throws IOException {
		man.score = 0;
		Parent root = FXMLLoader.load(getClass().getResource("/application/Category.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void mix(ActionEvent event) throws IOException {
		man.readfile("Dictionaries\\words.txt");
		man.selectRandomSecretWord();
		ControllerLetters.receive(man);
		Parent root = FXMLLoader.load(getClass().getResource("/application/Game.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void food(ActionEvent event) throws IOException {
		man.readfile("Dictionaries\\Food.txt");
		man.selectRandomSecretWord();
		ControllerLetters.receive(man);
		Parent root = FXMLLoader.load(getClass().getResource("/application/Game.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void animals(ActionEvent event) throws IOException {
		man.readfile("Dictionaries\\Animals.txt");
		man.selectRandomSecretWord();
		ControllerLetters.receive(man);
		Parent root = FXMLLoader.load(getClass().getResource("/application/Game.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void countries(ActionEvent event) throws IOException {
		man.readfile("Dictionaries\\Countries.txt");
		man.selectRandomSecretWord();
		ControllerLetters.receive(man);
		Parent root = FXMLLoader.load(getClass().getResource("/application/Game.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	

	

}



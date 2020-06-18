package application;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerLetters {
	
//load images
	final static javafx.scene.image.Image back_Ground = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/Bground.png").toString());
	final static javafx.scene.image.Image man_1 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/1.png").toString());
	final static javafx.scene.image.Image man_2 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/2.png").toString());
	final static javafx.scene.image.Image man_3 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/3.png").toString());
	final static javafx.scene.image.Image man_4 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/4.png").toString());
	final static javafx.scene.image.Image man_5 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/5.png").toString());
	final static javafx.scene.image.Image man_6 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/6.png").toString());
	final static javafx.scene.image.Image man_7 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/7.png").toString());
	final static javafx.scene.image.Image man_8 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/8.png").toString());
	final static javafx.scene.image.Image man_9 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/9.png").toString());
	final static javafx.scene.image.Image man_10 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/10.png").toString());
	final static javafx.scene.image.Image man_11 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/11.png").toString());
	final static javafx.scene.image.Image man_12 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/12.png").toString());
	final static javafx.scene.image.Image man_13 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/13.png").toString());
	final static javafx.scene.image.Image man_14 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/14.png").toString());
	final static javafx.scene.image.Image man_15 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/15.png").toString());
	final static javafx.scene.image.Image man_16 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/16.png").toString());
	final static javafx.scene.image.Image man_17 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/17.png").toString());
	final static javafx.scene.image.Image man_18 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/18.png").toString());
	final static javafx.scene.image.Image man_19 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/19.png").toString());
	final static javafx.scene.image.Image man_20 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/20.png").toString());
	final static javafx.scene.image.Image man_21 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/21.png").toString());
	final static javafx.scene.image.Image man_22 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/22.png").toString());
	final static javafx.scene.image.Image man_23 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/23.png").toString());
	final static javafx.scene.image.Image man_24 = new javafx.scene.image.Image(ControllerLetters.class.getResource("/images/24.png").toString());

	
	 static Hangman man;
	 Stage window1;
	
	@FXML 
	private Button A;
	@FXML 
	private Button B;
	@FXML 
	private Button C;
	@FXML 
	private Button D;
	@FXML 
	private Button E;
	@FXML 
	private Button F;
	@FXML 
	private Button G;
	@FXML 
	private Button H;
	@FXML 
	private Button I;
	@FXML 
	private Button J;
	@FXML 
	private Button K;
	@FXML 
	private Button L;
	@FXML 
	private Button M;
	@FXML 
	private Button N;
	@FXML 
	private Button O;
	@FXML 
	private Button P;
	@FXML 
	private Button Q;
	@FXML 
	private Button R;
	@FXML 
	private Button S;
	@FXML 
	private Button T;
	@FXML 
	private Button U;
	@FXML 
	private Button V;
	@FXML 
	private Button W;
	@FXML 
	private Button X;
	@FXML 
	private Button Y;
	@FXML 
	private Button Z;
	@FXML 
	private Button exit;
	@FXML 
	private Label word;
	@FXML 
	private Label score;
	@FXML 
	private Label lives;
	@FXML 
	private ImageView hangman;
	
	@FXML
  public void initialize(){
      word.setText(man.guess);
      score.setText(Integer.toString(man.score));
  }
	
	public void hangMan(int lives) {			
		Timeline t = new Timeline();
		t.setCycleCount(1);
		
		if(lives == 9) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_1);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_2);
					}
					));	
			
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(600), 
					(ActionEvent event) -> {
						hangman.setImage(man_3);
					}
					));	
		}
		if(lives == 8) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_4);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_5);
					}
					));	
			
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(600), 
					(ActionEvent event) -> {
						hangman.setImage(man_6);
					}
					));	
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(800), 
					(ActionEvent event) -> {
						hangman.setImage(man_7);
					}
					));	
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(1000), 
					(ActionEvent event) -> {
						hangman.setImage(man_8);
					}
					));	
		}
		if(lives == 7) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_9);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_10);
					}
					));	
		}
		if(lives == 6) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_11);
					}
					));		
		}
		if(lives == 5) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_12);
					}
					));		
		}
		
		if(lives == 4) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_13);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_12);
					}
					));	
			
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(600), 
					(ActionEvent event) -> {
						hangman.setImage(man_15);
					}
					));	
		}
		if(lives == 3) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_16);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_17);
					}
					));	
		}
		if(lives == 2) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_18);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_19);
					}
					));		
		}
		if(lives == 1) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_20);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_21);
					}
					));	
			
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(600), 
					(ActionEvent event) -> {
						hangman.setImage(man_22);
					}
					));	
		}
		if(lives == 0) {
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(200), 
					(ActionEvent event) -> {
						 hangman.setImage(man_23);
					}
					));		
			t.getKeyFrames().add(new KeyFrame(
					Duration.millis(400), 
					(ActionEvent event) -> {
						hangman.setImage(man_24);
					}
					));	
		}
		t.play();
	}
	
	
	public void disable() {
		A.setDisable(true);
		B.setDisable(true);
		C.setDisable(true);
		D.setDisable(true);
		E.setDisable(true);
		F.setDisable(true);
		G.setDisable(true);
		H.setDisable(true);
		I.setDisable(true);
		J.setDisable(true);
		K.setDisable(true);
		L.setDisable(true);
		M.setDisable(true);
		N.setDisable(true);
		O.setDisable(true);
		P.setDisable(true);
		Q.setDisable(true);
		R.setDisable(true);
		S.setDisable(true);
		T.setDisable(true);
		U.setDisable(true);
		V.setDisable(true);
		W.setDisable(true);
		X.setDisable(true);
		Y.setDisable(true);
		Z.setDisable(true);
	}
	
	public void word(char letter) {
		int count = man.livesCounter;
		String w = man.guess(letter);
		if(man.livesCounter == count-1) {
			lives.setText(Integer.toString(man.livesCounter));
			hangMan(man.livesCounter);
		}
		if(w == null) {
			w = man.secret.toUpperCase();
			word.setTextFill(Color.web("#C80000"));
			pop();
			disable();
		}
		word.setText(w);
		if(man.state == 1) {
			man.score++;
			hangman.setImage(back_Ground);
			man.state = 0;
			man.livesCounter = 10;
			man.selectRandomSecretWord();
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/Game.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				window1.setScene(scene);
				window1.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			word.setText(man.guess);
		}
	}
	
	public void A(ActionEvent event) {
		String pressedLetter = A.getText();
		char letter = pressedLetter.charAt(0);
	  A.setVisible(false);
	 window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void B(ActionEvent event) {
		String pressedLetter = B.getText();
		char letter = pressedLetter.charAt(0);
	  B.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void C(ActionEvent event) {
		String pressedLetter = C.getText();
		char letter = pressedLetter.charAt(0);
		C.setVisible(false);
	  window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void D(ActionEvent event) {
		String pressedLetter = D.getText();
		char letter = pressedLetter.charAt(0);
	  D.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}

	public void E(ActionEvent event) {
		String pressedLetter = E.getText();
		char letter = pressedLetter.charAt(0);
	  E.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void F(ActionEvent event) {
		String pressedLetter = F.getText();
		char letter = pressedLetter.charAt(0);
	  F.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void G(ActionEvent event) {
		String pressedLetter = G.getText();
		char letter = pressedLetter.charAt(0);
	  G.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void H(ActionEvent event) {
		String pressedLetter = H.getText();
		char letter = pressedLetter.charAt(0);
	  H.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void I(ActionEvent event) {
		String pressedLetter = I.getText();
		char letter = pressedLetter.charAt(0);
	  I.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void J(ActionEvent event) {
		String pressedLetter = J.getText();
		char letter = pressedLetter.charAt(0);
	  J.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void K(ActionEvent event) {
		String pressedLetter = K.getText();
		char letter = pressedLetter.charAt(0);
	  K.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void L(ActionEvent event) {
		String pressedLetter = L.getText();
		char letter = pressedLetter.charAt(0);
	  L.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void M(ActionEvent event) {
		String pressedLetter = M.getText();
		char letter = pressedLetter.charAt(0);
	  M.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void N(ActionEvent event) {
		String pressedLetter = N.getText();
		char letter = pressedLetter.charAt(0);
	  N.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void O(ActionEvent event) {
		String pressedLetter = O.getText();
		char letter = pressedLetter.charAt(0);
	  O.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}

	public void P(ActionEvent event) {
		String pressedLetter = P.getText();
		char letter = pressedLetter.charAt(0);
	  P.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void Q(ActionEvent event) {
		String pressedLetter = Q.getText();
		char letter = pressedLetter.charAt(0);
	  Q.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void R(ActionEvent event) {
		String pressedLetter = R.getText();
		char letter = pressedLetter.charAt(0);
	  R.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void S(ActionEvent event) {
		String pressedLetter = S.getText();
		char letter = pressedLetter.charAt(0);
	  S.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void T(ActionEvent event) {
		String pressedLetter = T.getText();
		char letter = pressedLetter.charAt(0);
	  T.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void U(ActionEvent event) {
		String pressedLetter = U.getText();
		char letter = pressedLetter.charAt(0);
		U.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void V(ActionEvent event) {
		String pressedLetter = V.getText();
		char letter = pressedLetter.charAt(0);
	  V.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void W(ActionEvent event) {
		String pressedLetter = W.getText();
		char letter = pressedLetter.charAt(0);
	  W.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void X(ActionEvent event) {
		String pressedLetter = X.getText();
		char letter = pressedLetter.charAt(0);
	  X.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void Y(ActionEvent event) {
		String pressedLetter = Y.getText();
		char letter = pressedLetter.charAt(0);
	  Y.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void Z(ActionEvent event) {
		String pressedLetter = Z.getText();
		char letter = pressedLetter.charAt(0);
	  Z.setVisible(false);
		window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
	  word(letter);
	}
	
	public void game(ActionEvent event) throws IOException {
		window1.close();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Category.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//this line gets the stage info.
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();	
	}
	
	public void exit(ActionEvent event) {
		window1.close();
		exit.setOnAction(e -> System.exit(0));
	}
	
	public void menu(ActionEvent event) throws IOException {
		window1.close();
		Parent  root = FXMLLoader.load(getClass().getResource("/application/Menu.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	   //this line gets the stage info.
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();	
	}
	
	public void pop() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Loser.fxml"));
			Scene scene = new Scene(root);
		  window1 = new Stage();
			window1.setScene(scene);
			window1.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void receive(Hangman hangman) {
		man = hangman;
	}
}

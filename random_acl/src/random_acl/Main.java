package random_acl;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	 public void start(Stage primaryStage) {
		 	GamePanel game = new GamePanel();
	        primaryStage.setTitle("Labyrinthe Simple");
	        primaryStage.setScene(game.scene);
	        primaryStage.setResizable(false);
	        game.startGameThread();
	        primaryStage.show();
	       
	       
	        }
	 public static void main(String[] args) {
	        launch(args);
	        
	    }
}

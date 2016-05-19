package org.learning.Symphonia;

import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

public class App extends Application {
	public static String INITIAL_SCENE_ID = "initialScene";
	public static String AUTHORS_SCENE_ID = "authorsScene";
	public static String PIANO_PLAY_SCENE_ID = "pianoPlayScene";
	
	@Override
	public void start(Stage primaryStage) {
		ScenesController container = new ScenesController();
		container.loadScene(App.INITIAL_SCENE_ID, "/scenes/InitialScene.fxml");
		container.loadScene(App.AUTHORS_SCENE_ID, "/scenes/AuthorsScene.fxml");
		container.loadScene(App.PIANO_PLAY_SCENE_ID, "/scenes/PianoPlay.fxml");
		container.setScene(App.INITIAL_SCENE_ID);
		
		Group root = new Group();
		root.getChildren().addAll(container);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Symphonia");
		primaryStage.show();
	}
}
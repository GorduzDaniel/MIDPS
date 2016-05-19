package org.learning.Symphonia.Scene;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.learning.Symphonia.App;
import org.learning.Symphonia.ControllerTemplate;
import org.learning.Symphonia.ScenesController;
import org.learning.Symphonia.Piece.Piece;
import org.learning.Symphonia.Piece.Songs;
import org.learning.Symphonia.Piece.SongsController;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class PiecesListController implements Initializable, ControllerTemplate {
	private ScenesController controller;

	private SongsController songs = new SongsController();
	
	private Map<String, String> labels = new HashMap<String, String>();
	
	@FXML
	private VBox verticalBox;
	
	@FXML
	private void onMouseClickedBack() {
		controller.setScene(App.AUTHORS_SCENE_ID);
	}
	
	@Override
	public void setSceneParent(ScenesController scenePage) {
		controller = scenePage;
	}
	
	private void setPieces() throws Exception {
		Songs song = songs.getSongs();

		for (Piece piece : song.getPieces()) {
			Label label = new Label(piece.getName());
			
			label.setTextFill(Color.web("#282827cc"));
			label.setFont(Font.font("ChopinScript",70));
			labels.put(piece.getName()+label, piece.getResource());
			verticalBox.getChildren().add(label);
			
			label.setOnMouseClicked(new EventHandler<MouseEvent>() {
			    @Override 
			    public void handle(MouseEvent e) {
			    	controller.setSceneEx(App.PIANO_PLAY_SCENE_ID);
			    	App.pieceResource = labels.get(label.getText()+label);
			    }
			});
			label.setOnMouseEntered(new EventHandler<MouseEvent>() {
				@Override 
			    public void handle(MouseEvent e) {
					label.setTextFill(Color.RED);
				}
			});
			label.setOnMouseExited(new EventHandler<MouseEvent>() {
				@Override 
			    public void handle(MouseEvent e) {
					label.setTextFill(Color.web("#282827cc"));
				}
			});
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			songs.loadSongs("src/main/resources/pieces/Beethoven.xml");
			setPieces();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

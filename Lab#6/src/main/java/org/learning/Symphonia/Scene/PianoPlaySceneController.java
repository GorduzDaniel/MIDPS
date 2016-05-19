package org.learning.Symphonia.Scene;

import java.net.URL;
import java.util.ResourceBundle;

import org.learning.Symphonia.App;
import org.learning.Symphonia.ControllerTemplate;
import org.learning.Symphonia.ScenesController;
import org.learning.Symphonia.Bubble.BubbleSheetBuilder;
import org.learning.Symphonia.Music.SheetMusicController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PianoPlaySceneController implements Initializable, ControllerTemplate {
	@FXML
	private ImageView playButton;
	
	@FXML
	private AnchorPane anchorPane;
	
	private ScenesController controller;
	
	private SheetMusicController sheetMusicController = new SheetMusicController();
	
	private BubbleSheetBuilder bubbleSheet = new BubbleSheetBuilder();
	
	@Override
	public void setSceneParent(ScenesController scene) {
		controller = scene;
	}
	
	@FXML
	private void onMouseClickedPlayButton() throws Exception {
		playButton.setVisible(false);
		sheetMusicController.loadPiece(App.pieceResource);
		bubbleSheet.load(sheetMusicController.getSheetMusic());
		bubbleSheet.draw(anchorPane);
		sheetMusicController.play();
	}
	
	@FXML
	private void onMouseClickedBack() {
		controller.setSceneEx(App.AUTHORS_PIECES_LIST);
		playButton.setVisible(true);
	}
	
	@FXML
	private void onMouseExitedPlayButton() {
		ColorAdjust colorAdjust = new ColorAdjust();
		colorAdjust.setContrast(0.0);
		colorAdjust.setHue(0.0);
	    colorAdjust.setBrightness(-1.0);
	    colorAdjust.setSaturation(0.0);
	    playButton.setEffect(colorAdjust);
	}
	
	@FXML
	private void onMouseEnteredPlayButton() {
		ColorAdjust colorAdjust = new ColorAdjust();
		colorAdjust.setContrast(0.0);
		colorAdjust.setHue(0.0);
	    colorAdjust.setBrightness(0.0);
	    colorAdjust.setSaturation(1.0);
	    playButton.setEffect(colorAdjust);
	}
	
	@FXML
	private void onMouseClickedAnchor() {
		sheetMusicController.append();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
	}
}

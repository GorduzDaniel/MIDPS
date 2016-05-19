package org.learning.Symphonia.Scene;

import java.net.URL;
import java.util.ResourceBundle;

import org.learning.Symphonia.App;
import org.learning.Symphonia.ControllerTemplate;
import org.learning.Symphonia.ScenesController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

import javafx.util.Duration;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;

public class InitialSceneController implements Initializable, ControllerTemplate {
	@FXML
	private ImageView playButton;
	
	private ScenesController controller;
	
	private ScaleTransition playButtonScaleTransition;
	
	@FXML
	private void onMouseClickedPlayButton() {
		playButtonScaleTransition.stop();
		controller.setScene(App.AUTHORS_SCENE_ID);
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
	@Override
	public void setSceneParent(ScenesController scene) {
		controller = scene;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		playButtonScaleTransition = new ScaleTransition(Duration.millis(1000), playButton);
		playButtonScaleTransition.setByX(0.2f);
		playButtonScaleTransition.setByY(0.2f);
		playButtonScaleTransition.setCycleCount(Timeline.INDEFINITE);
		playButtonScaleTransition.setAutoReverse(true);
	 
		playButtonScaleTransition.play();
	}
}

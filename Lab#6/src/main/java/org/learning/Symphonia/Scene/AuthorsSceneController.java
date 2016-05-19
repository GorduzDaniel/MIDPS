package org.learning.Symphonia.Scene;

import java.net.URL;
import java.util.ResourceBundle;

import org.learning.Symphonia.App;
import org.learning.Symphonia.ControllerTemplate;
import org.learning.Symphonia.ScenesController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class AuthorsSceneController implements Initializable, ControllerTemplate {
	private ScenesController controller;

	@Override
	public void setSceneParent(ScenesController scenePage) {
		controller = scenePage;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	@FXML
	private void onMouseClickedBeethoven() {
		;
	}
}
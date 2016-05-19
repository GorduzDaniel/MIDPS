package org.learning.Symphonia;

import java.util.HashMap;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class ScenesController extends StackPane {
	private HashMap<String, Node> scenes = new HashMap<>();
	
	public ScenesController() {
		super();
	}
	public void addScene(String name, Node scene) {
		scenes.put(name, scene);
	}
	public Node getScene(String name) {
		return scenes.get(name);
	}
	public void loadScene(String name, String resource) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
			Parent loadScene = (Parent) loader.load();
			ControllerTemplate scene = ((ControllerTemplate) loader.getController());
			scene.setSceneParent(this);
			addScene(name, loadScene);
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public void setScene(final String name) {
		if (scenes.get(name) != null) {
			if (!getChildren().isEmpty()) {
				getChildren().remove(0);
				getChildren().add(0, scenes.get(name));
			}
			else {
				getChildren().add(scenes.get(name));
			}
		}
	}
	public void setSceneEx(final String name) { 
		if(scenes.get(name) != null) { 
			final DoubleProperty opacity = opacityProperty(); 
			
			if(!getChildren().isEmpty()){ 
				Timeline fade = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(opacity,1.0)),
				new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() { 
					
					@Override 
					public void handle(ActionEvent t) { 
						getChildren().remove(0); 
						getChildren().add(0, scenes.get(name)); 
						Timeline fadeIn = new Timeline( 
							new KeyFrame(Duration.ZERO, 
                            new KeyValue(opacity, 0.0)), 
							new KeyFrame(new Duration(800), 
                            new KeyValue(opacity, 1.0))); 
						fadeIn.play(); 
					}
	            }, new KeyValue(opacity, 0.0))); 
				fade.play(); 
	        } 
			else { 
				setOpacity(0.0); 
				getChildren().add(scenes.get(name)); 
				Timeline fadeIn = new Timeline(new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)), 
	             new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0))); 
				fadeIn.play(); 
			} 
		} 
	}
	public void unloadScene(String name) {
		scenes.remove(name);
	}
}

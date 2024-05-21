package com.TriviaDesktop.Models;

import com.TriviaDesktop.Interfaces.Screen;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InfoScreen implements Screen{
	
	// Declarate elements
	private Label channel;
	private Label description;
	private Button yt;
	
	// Load images
	private final Image ytLogo = new Image("/src/main/resources/Images/youtube-logo.png");
	private final ImageView ytLogoImg = new ImageView(ytLogo);
	private final Image platypus = new Image("/src/main/resources/Images/ornitorrincoVF.png");
	private final ImageView platypusImg = new ImageView(platypus);
	
	public InfoScreen() {
		channel = new Label();
		description = new Label();
		yt.setGraphic(ytLogoImg);
	}

	@Override
	public void render(Stage stage) {
		VBox layout = new VBox(10, channel, description, yt, platypusImg);
        Scene scene = new Scene(layout, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("Languages");
        stage.show();	
	}
	
	// GETTERS
	public Button getYt() {
		return this.yt;
	}

}

package com.TriviaDesktop.Models;

import com.TriviaDesktop.Interfaces.Screen;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LanguagesScreen implements Screen {
	// Declarate screen elements
	private Label languages;
	private Button es = new Button();
	private Button de = new Button();
	private Button en = new Button();
	private Button pt = new Button();
	
	// Load images
	private final Image platypus = new Image("/src/main/resources/Images/ornitorrincoVF.png");
	private final Image spanish = new Image("/src/main/resources/Images/ES.png");
	private final Image german = new Image("/src/main/resources/Images/DE.png");
	private final Image english = new Image("/src/main/resources/Images/EN.png");
	private final Image portuguese = new Image("/src/main/resources/Images/PT.png");
	
	private final ImageView spainFlag = new ImageView(spanish);
	private final ImageView germanyFlag = new ImageView(german);
	private final ImageView euaFlag = new ImageView(english);
	private final ImageView brFlag = new ImageView(portuguese);
	private final ImageView platypusImg = new ImageView(platypus);
	
	public LanguagesScreen() {
		languages = new Label("Languages");
		es.setGraphic(spainFlag);
		de.setGraphic(germanyFlag);
		en.setGraphic(euaFlag);
		pt.setGraphic(brFlag);
	}

	@Override
	public void render(Stage stage) {
		VBox layout = new VBox(10, languages, es, de, en, pt, platypusImg);
        Scene scene = new Scene(layout, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("Languages");
        stage.show();	
	}
	
	// GETTERS
	public Button getEs() {
		return this.es;
	}
	
	public Button getDe() {
		return this.de;
	}
	
	public Button getEn() {
		return this.en;
	}
	
	public Button getPt() {
		return this.pt;
	}

}

package com.TriviaDesktop.Models;

import com.TriviaDesktop.Interfaces.Screen;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuScreen implements Screen {
	
	private Button startButton;
	private Button languagesButton;
	private Button infoButton;
	
	public MenuScreen() {
		this.startButton = new Button("Start");
		this.languagesButton = new Button("Languages");
		this.infoButton = new Button("Infos");	
	}

	@Override
	public void render(Stage stage) {
		VBox layout = new VBox(10, startButton, languagesButton, infoButton);
        Scene scene = new Scene(layout, 800, 800);
        
        stage.setScene(scene);
        stage.setTitle("Main Menu");
        stage.show();
	}
	
	// GETTERS
	public Button getStartButton() {
		return this.startButton;
	}
	
	public Button getLanguageButton() {
		return this.languagesButton;
	}
	
	public Button getInfoButton() {
		return this.infoButton;
	}

}

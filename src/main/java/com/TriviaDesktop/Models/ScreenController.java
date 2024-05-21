package com.TriviaDesktop.Models;

import javafx.application.Application;
import javafx.stage.Stage;

public class ScreenController extends Application {
	MenuScreen menu = new MenuScreen();
	GameScreen game = new GameScreen();
	LanguagesScreen languages = new LanguagesScreen();
	InfoScreen infos = new InfoScreen();
	
	
	@Override
	public void start(Stage primaryStage) {
		menu.render();
		
		menu.getStartButton().setOnAction(event -> {
            game.render(primaryStage);
        });
		
		menu.getLanguageButton().setOnAction(event -> {
            languages.render(primaryStage);
        });
		
		menu.getInfoButton().setOnAction(event -> {
            infos.render(primaryStage);
        });
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }
	
}

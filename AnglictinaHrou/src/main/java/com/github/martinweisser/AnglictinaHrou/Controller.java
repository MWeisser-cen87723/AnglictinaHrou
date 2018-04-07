package com.github.martinweisser.AnglictinaHrou;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextFlow;

public class Controller {
	
	@FXML private ImageView bear;
	@FXML private ImageView flower;
	@FXML private ImageView monkey;
	@FXML private ImageView car;
	@FXML private ImageView house;
	@FXML private ImageView window;
	
	@FXML private TextFlow bearText;
	@FXML private TextFlow windowText;
	@FXML private TextFlow houseText;
	@FXML private TextFlow carText;
	@FXML private TextFlow monkeyText;
	@FXML private TextFlow flowerText;
	
	private int spatna;
	private int spravna;

	
	@FXML public void bear() {
		bearText.setVisible(true);
	}
	
	@FXML public void window() {
		windowText.setVisible(true);
	}
	
	@FXML public void car() {
		carText.setVisible(true);
	}
	
	@FXML public void house() {
		houseText.setVisible(true);
	}
	
	@FXML public void flower() {
		flowerText.setVisible(true);
	}
	
	@FXML public void monkey() {
		monkeyText.setVisible(true);
	}
	
	@FXML public void viditelnostObrazku() {
		bearText.setVisible(false);
		windowText.setVisible(false);
		carText.setVisible(false);
		flowerText.setVisible(false);
		houseText.setVisible(false);
		monkeyText.setVisible(false);
	}

}

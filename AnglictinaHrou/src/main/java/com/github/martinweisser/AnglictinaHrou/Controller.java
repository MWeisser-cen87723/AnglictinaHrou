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
	
	private int spatna;
	private int spravna;

	
	@FXML public void bear() {
		bearText.setVisible(true);
	}
	
	@FXML public void viditelnostObrazku() {
		bearText.setVisible(false);
	}

}

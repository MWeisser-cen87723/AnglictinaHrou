package com.github.martinweisser.AnglictinaHrou;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
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
	
	@FXML private TextArea tipText;
	@FXML private Label tipLbl;
	@FXML private VBox tipWindow;
	
	
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
	
	@FXML public void hadej() {
		Random cislo = new Random();
        int  nahodne = cislo.nextInt(6) + 1;
        
        bear.setVisible(false);
		window.setVisible(false);
		car.setVisible(false);
		flower.setVisible(false);
		house.setVisible(false);
		monkey.setVisible(false);
		
		tipWindow.setVisible(true);
		tipText.setEditable(true);
		
        if (nahodne == 1) {
        		bear.setVisible(true);
        } 
        if (nahodne == 2) {
    			window.setVisible(true);
        } 
        if (nahodne == 3) {
    			car.setVisible(true);
        } 
        if (nahodne == 4) {
    			flower.setVisible(true);
        } 
        if (nahodne == 5) {
    			house.setVisible(true);
        } 
        if (nahodne == 6) {
    			monkey.setVisible(true);
        } 
        
        
        
	}

}

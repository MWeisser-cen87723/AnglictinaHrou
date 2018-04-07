package com.github.martinweisser.AnglictinaHrou;

import java.awt.MouseInfo;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML private ImageView bear;
	@FXML private ImageView flower;
	@FXML private ImageView monkey;
	@FXML private ImageView car;
	@FXML private ImageView house;
	@FXML private ImageView window;

	/*@FXML public void ukazNazev( ) {
		if (MouseInfo.getPointerInfo().getLocation().equals(bear)) {
			bear.setToolTipText("medvěd");
		}
		if (MouseInfo.getPointerInfo().getLocation().equals(window)) {
			window.setToolTipText("okno");
		}
		if (MouseInfo.getPointerInfo().getLocation().equals(car)) {
			car.setToolTipText("auto");
		}
		if (MouseInfo.getPointerInfo().getLocation().equals(monkey)) {
			monkey.setToolTipText("opice");
		}
		if (MouseInfo.getPointerInfo().getLocation().equals(house)) {
			house.setToolTipText("dům");
		}
		if (MouseInfo.getPointerInfo().getLocation().equals(flower)) {
			flower.setToolTipText("květina");
		}
	}*/
}

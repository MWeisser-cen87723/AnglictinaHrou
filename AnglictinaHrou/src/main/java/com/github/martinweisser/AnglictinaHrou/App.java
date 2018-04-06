package com.github.martinweisser.AnglictinaHrou;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Základní třída
 *
 */
public class App extends javafx.application.Application {

	/**
	 * Spouštěcí metoda pro aplikaci
	 * @param args
	 */
	public static void main(String[] args) {
            launch(args);
	}
    /**
	 * Metoda, ve které se konstruuje okno, kontroler a hra,
	 * která se předává kontroleru
	 */
    @Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource("/Home.fxml"));
		Parent root = loader.load();
		
        primaryStage.setTitle("ANGLIČTINA HROU!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		
	}
}

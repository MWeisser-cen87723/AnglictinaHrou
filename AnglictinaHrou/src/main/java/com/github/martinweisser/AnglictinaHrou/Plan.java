package com.github.martinweisser.AnglictinaHrou;

/** Třída Plan
 * 
 * @author martinweisser
 *
 */
public class Plan {
	
	/**
	 * Konstruktor
	 */
	public Plan( ) {
		
		novyPlan();
	}
	
	/**
	 * Metoda pro založení plánu
	 */
	public void novyPlan() {
		Slovo slovo1 = new Slovo ("medvěd", "bear");
		Slovo slovo2 = new Slovo ("dům", "house");
		Slovo slovo3 = new Slovo ("květina", "flower");
		Slovo slovo4 = new Slovo ("opice", "monkey");
		Slovo slovo5 = new Slovo ("auto", "car");
		Slovo slovo6 = new Slovo ("okno", "window");
	}

}

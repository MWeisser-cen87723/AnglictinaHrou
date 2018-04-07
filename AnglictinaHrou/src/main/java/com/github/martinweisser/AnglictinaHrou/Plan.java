package com.github.martinweisser.AnglictinaHrou;

/** Třída Plan
 * 
 * @author martinweisser
 *
 */
public class Plan {
	
	public int spravna;
	public int spatna;
	
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
		
		spatna = 0;
		spravna = 0;
	}
	
	/**
	 * Metoda pro získaní počtu správných odpovědí
	 */
	public int getSpravna() {
		return spravna;
	}
	
	/**
	 * Metoda pro nastavení počtu správných odpovědí
	 */
	public void setSpravna() {
		this.spravna = spravna;
	}
	
	/**
	 * Metoda pro získaní počtu špatných odpovědí
	 */
	public int getSpatna() {
		return spravna;
	}
	
	/**
	 * Metoda pro nastavení počtu špatných odpovědí
	 */
	public void setSpatna() {
		this.spatna = spatna;
	}
	

}

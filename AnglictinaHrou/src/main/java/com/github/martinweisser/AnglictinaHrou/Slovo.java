package com.github.martinweisser.AnglictinaHrou;

/** Třída Slovo
 * 
 * @author martinweisser
 *
 */
public class Slovo {
	
	private String cs;
	private String en;
	
	/**
	 * Konstruktor
	 */
	public Slovo(String cs, String en) {
		this.cs = cs;
		this.en = en;
	}
	
	/**
	 * Metoda pro ziskani cs nazvu
	 */
	public String getCs() {
        return cs;       
    }
	
	/**
	 * Metoda pro nastaveni cs nazvu
	 */
	public void setCs() {
        this.cs = cs;       
    }
	
	/**
	 * Metoda pro ziskani en nazvu
	 */
	public String getEn() {
        return en;       
    }
	
	/**
	 * Metoda pro nastaveni en nazvu
	 */
	public void setEn() {
        this.en = en;       
    }

}

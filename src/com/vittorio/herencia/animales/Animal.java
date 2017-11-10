package com.vittorio.herencia.animales;
import com.vittorio.herencia.animales.interfaces.Comestible;

public class Animal
{
	private int patas = 0;
	private boolean vuela = false;
	private int velocidad = 0;
	private float peso = 0;
	private String especie = "";
	
	// Constructor.
	
	public Animal()
	{
		// Default values.
	}
	
	public Animal (int numLegs, boolean doFly, String theSpecies)
	{
		this.patas = numLegs;
		this.vuela = doFly;
		this.especie = theSpecies;
	}
	
	// Set properties.
	
	public int getPatas()
	{
		return this.patas;
	}
	public void setPatas(int theNumber)
	{
		this.patas = theNumber;
	}
	public boolean vuela()
	{
		return this.vuela;
	}
	public int getVelocidad()
	{
		return this.velocidad;
	}
	public void setVelocidad(int theSpeed)
	{
		this.velocidad = theSpeed;
	}
	public float getPeso()
	{
		return this.peso;
	}
	public void setPeso(float theWeight)
	{
		this.peso = theWeight;
	}
	public String getEspecie()
	{
		return this.especie;
	}
	public void setEspecie(String theSpecies)
	{
		this.especie = theSpecies;
	}
	
	// Things that animals do.
	
	public void eat (Comestible theMeal)
	{
		System.out.println("Estoy comiendo " + theMeal.toString());
	}

}

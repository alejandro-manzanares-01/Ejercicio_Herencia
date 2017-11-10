package com.vittorio.herencia.animales;
import com.vittorio.herencia.animales.interfaces.Comestible;
import com.vittorio.herencia.common.Vacuna;
import java.util.List;

public class Gato extends Animal implements Comestible
{
	private float largoBigotes = 0.0f;
	private int numVidas = 7;
	private List<Vacuna> vacunas = null;
	
	// Constructor.
	
	public Gato()
	{
		// Default values.
	}
	
	public Gato(int numLegs, boolean doFly, String theSpecies, int numLives, List<Vacuna> theVaccines, float theWhiskers)
	{
		super(numLegs, doFly, theSpecies);
		
		this.largoBigotes = theWhiskers;
		this.numVidas = numLives;
		this.vacunas = theVaccines;
	}

	// Get and set properties.
	
	public float getLargoBigotes()
	{
		return this.largoBigotes;
	}
	public void setLargoBigotes(float theWhiskers)
	{
		this.largoBigotes = theWhiskers;
	}
	public int getNumVidas()
	{
		return this.numVidas;
	}
	public void setNumVidas(int numLives)
	{
		this.numVidas = numLives;
	}
	public List<Vacuna> getVacunas()
	{
		return this.vacunas;
	}
	public void setVacunas(List<Vacuna> theVaccines)
	{
		this.vacunas = theVaccines;
	}
	
	// Shit that cats do.
	
	void Nothing()
	{
	}

	@Override
	public void sayItsCooked()
	{
	}		
}

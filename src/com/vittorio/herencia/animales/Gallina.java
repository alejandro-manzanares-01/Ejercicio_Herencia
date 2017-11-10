package com.vittorio.herencia.animales;
import com.vittorio.herencia.animales.interfaces.Comestible;
import com.vittorio.herencia.common.Vacuna;
import java.util.List;

public class Gallina extends Animal implements Comestible
{
	private int numHuevos = 0;
	private List<Vacuna> vacunas = null;
	
	// Constructor.
	
	public Gallina()
	{
		// Default values.
	}
	
	public Gallina(int numLegs, boolean doFly, String theSpecies, int numEggs, List<Vacuna> theVaccines)
	{
		super (numLegs, doFly, theSpecies);
		
		this.numHuevos = numEggs;
		this.vacunas = theVaccines;
	}

	// Get and set properties.

	public int getNumHuevos()
	{
		return this.numHuevos;
	}
	public void setNumHuevos(int numHuevos)
	{
		this.numHuevos = numHuevos;
	}
	public List<Vacuna> getVacunas()
	{
		return this.vacunas;
	}
	public void setVacunas(List<Vacuna> vacunas)
	{
		this.vacunas = vacunas;
	}

	@Override
	public void sayItsCooked()
	{
	}
	
}
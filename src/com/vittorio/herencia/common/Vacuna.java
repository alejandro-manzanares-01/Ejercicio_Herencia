package com.vittorio.herencia.common;

public class Vacuna
{
	private String myName = "";
	
	// Constructor.
	
	public Vacuna()
	{
	}
	
	public Vacuna (String theName)
	{
		this.myName = theName;
	}
	
	// Get and set properties.
	
	public String getName()
	{
		return this.myName;
	}

	public void setName(String theName)
	{
		this.myName = theName;
	}
	
}

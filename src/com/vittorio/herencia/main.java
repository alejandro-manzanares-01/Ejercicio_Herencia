package com.vittorio.herencia;

import com.vittorio.herencia.animales.*;

public class main {

	public static void main(String[] args)
	{
		Gato jinx = new Gato(4,false,"bichus estupidus inutilus",7,null,2.5f);
		Gallina caponata = new Gallina(2,true,"gallus gallus domesticus",3,null);
	
	    for (String argumento: args)
	    {
	    	System.out.println(argumento);
	    }	

		jinx.eat(caponata);
		caponata.eat(jinx);
	}
}

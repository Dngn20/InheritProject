package inherit.model;

import inherit.model.LoudNoises;

public class Hearing implements LoudNoises
{
	public double clapVolume(Double decibleLevel)
	{
		decibleLevel = decibleLevel;
		return decibleLevel;
	}
	
	public double quietClap()
	{
		double decibleLevel = 109 ;
		return decibleLevel;
	}
	
	public double loudClap()
	{
		double decibleLevel = 112.34534;
		return decibleLevel;
	}
	
	public double duncanClap()
	{
		double decibleLevel = 99999999.99;
		return decibleLevel;
	}

	
	public double shotgunBlast() 
	{
		double decibleLevel = 187.96;
		return 0;
	}

	
	public String carHorn() 
	{
		String carHorn = "Beep, Honk, Beep";
		
		
		return null;
	}
}
package inherit.model;

import inherit.model.LoudNoises;

public class Inherit implements LoudNoises
{
	public double clapVolume(Double decibleLevel)
	{
		return decibleLevel;
	}
	
	public double quietClap()
	{
		double decibleLevel = 50.71;
		return decibleLevel;
	}
	
	public double loudClap()
	{
		double decibleLevel = 100.33;
		return decibleLevel;
	}
	
	public double duncanClap()
	{
		double decibleLevel = 99999999.9999;
		return decibleLevel;
	}
}

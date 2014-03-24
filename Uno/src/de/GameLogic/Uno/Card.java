package de.GameLogic.Uno;

public class Card {
	private EColor color;
	private ECardType type;
	
	public Card(EColor color, ECardType type)
	{
		this.color = color;
		this.type = type;
	}
	
	public EColor getColor()
	{
		return this.color;
	}
	
	public ECardType getType()
	{
		return this.type;
	}
}

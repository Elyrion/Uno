package de.GameLogic.Uno;

import java.util.Stack;

public class GameStateManager {
	static private GameStateManager gameStateManager;
	private Stack<IGameState> gameStates;
	
	
	
	public static void main(String[] args)
	{
		GameStateManager gameStateManager = GameStateManager.getInstance();

		while(true)
		{
			gameStateManager.update();
		}
	}
	
	public static GameStateManager getInstance()
	{
		if(gameStateManager == null)
		{
			gameStateManager = new GameStateManager();
		}
		
		return gameStateManager;
	}
	
	private GameStateManager() { };
	private void update()
	{
		gameStates.peek().update(0);
	}
	
	static private void pushGameState(IGameState newGameState)
	{
		gameStates.push(newGameState);
	}
	
	static private void popGameState()
	{
		gameStates.pop();
	}
}

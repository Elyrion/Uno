package de.GameLogic.Uno;

import java.util.ArrayList;
import java.util.Stack;

public class GsGame implements IGameState {
	private Stack<Card> deck;
    private Stack<Card> playedCards;
    private ArrayList<Player> players;
    private int nextPlayerValue = 1;
    
    //TODO:
    /* @author = sebastian 
     * Spielreihenfolge
     * Effekte
     */
    
	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//@author = Kevin
	public void onEvent(String event) {
		// TODO Auto-generated method stub

	}
	
	//@author = Sergej
	private void resetDeck()
	{
		//TODO: reset deck
	}
	
	//gets the next player who is able to play
    private Player getNextPlayer(int currentPlayerPosition) {
    	
    	if(currentPlayerPosition + nextPlayerValue > players.size()) {
    		return players.get(0);
    	}
    	else {
    		if (currentPlayerPosition + nextPlayerValue < 0) {
    			return players.get(players.size()-1);
    		}
    		else {
    			return currentPlayerPosition + nextPlayerValue;
    		}
    	}
    }
    
    //changes direction in which the players play
    private void changeDirection() {
    	
    	this.nextPlayerValue * -1;
    }
	
	//@author = Sergej
	private boolean isValidCard(Card card)
	{
		//TODO: check if card is a valid card
		return true;
	}
	
	
}

package de.GameLogic.Uno;

public interface IGameState {
	void update(float dt);
	void onEvent(String event);
}

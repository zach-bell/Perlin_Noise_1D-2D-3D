package com.game.launcher.screens;

import java.awt.Graphics2D;


public abstract class Screen {
	
	/*
	 * All you have to do is make a new class you want to be a screen
	 * extend this class and update will run anything
	 */
	
	public abstract void create(ScreenManager screenManager);
	
	public abstract void update();
	
	public abstract void draw(Graphics2D g);
	
}

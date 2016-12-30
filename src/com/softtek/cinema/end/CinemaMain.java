package com.softtek.cinema.end;

import com.softtek.cinema.end.services.MenuService;
import com.softtek.cinema.end.services.MenuServiceImpl;

public class CinemaMain {

	public static void main(String[] args) {
		
		MenuService menu = new MenuServiceImpl();
		menu.showMenu();	

	}

}

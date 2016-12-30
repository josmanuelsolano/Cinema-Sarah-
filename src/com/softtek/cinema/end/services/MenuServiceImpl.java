package com.softtek.cinema.end.services;

import java.util.Scanner;

public class MenuServiceImpl implements MenuService{
	
	static Scanner sc = new Scanner(System.in);

	@Override
	public void showMenu() {
		StringBuffer instructionSB = new StringBuffer(); 
		instructionSB.append("You have 3 options: \n");
		instructionSB.append("1.- Select your sit\n");
		instructionSB.append("2.- Select your movie\n");
		instructionSB.append("3.- Exit\n");
		
		System.out.println(instructionSB.toString());
		this.selectMenuOption();
	}
	
	@Override
	public void selectMenuOption() {
		int option = 0;
		
		while (option != 3) {
			
			
			System.out.println("Your option: ");
			option = sc.nextInt();
			
			
			switch (option) {
			case 1:
				SelectSitService sits =  new SelectSitServiceImpl();
				sits.setSits();
				
				break;		
			case 2:
				SelectMovieService movie = new SelectMovieImpl();
				movie.getMovie();
				break;

			default:
				break;
			}
			
		}
		System.out.println("Thanks for using my system");
		sc.close();
		
	}
	
	

}

package com.softtek.cinema.end;

import java.util.Scanner;

import com.softtek.cinema.end.movie.Movie;
import com.softtek.cinema.end.movie.SelectMovie;
import com.softtek.cinema.end.sits.FillSits;
import com.softtek.cinema.end.sits.Sits;

public class CinemaMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//StringBuffer instructionSB = new StringBuffer(); 
		System.out.println("You have 3 options: ");
		System.out.println("1.- Select your sit");
		System.out.println("2.- Select your movie");
		System.out.println("3.- Exit");
		
		int option = 0;
		
		while (option != 3) {
			
			
			System.out.println("Your option: ");
			option = sc.nextInt();
			
			
			switch (option) {
			case 1:
				FillSits sits =  new Sits();
				sits.setSits();
				
				break;		
			case 2:
				SelectMovie movie = new Movie();
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

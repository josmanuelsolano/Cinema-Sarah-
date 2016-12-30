package com.softtek.cinema.end.services;

import java.util.Scanner;

import com.softtek.cinema.end.repository.MovieItem;

public class SelectMovieImpl implements SelectMovieService{

	@Override
	public String selectMovie(MovieItem movieItem) {
		System.out.println("your Movie is:");
		return movieItem.getTitle().toString();
	}
	
	//1(Title: Zootopia, Genre: ANIMATION)
	@Override
	public void getMovie() {
		for (MovieItem movie : MovieItem.values()) {
			System.out.println(movie);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("What Movie?");
		int numMovie = sc.nextInt();
		for (MovieItem movie : MovieItem.values()) {
			if (movie.getId() == numMovie) {
				System.out.println(selectMovie(movie));
			}
		}
	}

}

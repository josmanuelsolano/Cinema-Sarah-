package com.softtek.cinema.end.services;

import com.softtek.cinema.end.repository.MovieItem;

public interface SelectMovieService {
	
	String selectMovie(MovieItem movieItem);
	
	void getMovie();

}

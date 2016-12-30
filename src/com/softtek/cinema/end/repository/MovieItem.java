package com.softtek.cinema.end.repository;

public enum MovieItem {
	ZOOTOPIA(1,"Zootopia", Genre.ANIMATION),
	CIVIL_WAR(2, "Civil War", Genre.ACTION),
	THE_JUNGLE_BOOK(3, "The Jungle Book", Genre.DRAMA),
	FINDING_DORY(4, "Finding Dory", Genre.COMEDY),
	ME_BEFORE_YOU(5, "Me Before You", Genre.ROMANCE);
	
	private int id;
	private String title;
	private Genre genre;
	
	private MovieItem(int id, String title, Genre genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	StringBuffer sb = new StringBuffer();
	
	@Override
	public String toString() {
		sb.append(getId() + "(");
		sb.append("Title: " + getTitle() + ", ");
		sb.append("Genre: " + getGenre() + ")");
		return sb.toString();
	}

}

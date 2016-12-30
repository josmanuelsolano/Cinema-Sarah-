package com.softtek.cinema.end.sits;

public abstract class FillSits {
	
	protected String[][] sits;
	protected int rows;
	protected int cols;
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public abstract void setSits();
	
	void getSits(){
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				System.out.print(sits[i][j]);
			}
			System.out.println();
		}
	}

	void setSit(int row, int col){
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				if (i == row && j == col) {
					System.out.print("0");
				} else {
					System.out.print(sits[i][j]);
					
				}
				
			}
			System.out.println();
		}
	}

}

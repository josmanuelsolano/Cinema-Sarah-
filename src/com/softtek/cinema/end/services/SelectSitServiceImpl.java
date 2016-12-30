package com.softtek.cinema.end.services;

import java.util.Scanner;

public class SelectSitServiceImpl implements SelectSitService{
	
	private String[][] sits;
	private int rows;
	private int cols;
	
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

	@Override
	public void setSits() {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("How many rows?");
		int rows = sc.nextInt(); 
		this.setRows(rows);
		System.out.println("How many columns?");
		int cols = sc.nextInt();
		this.setCols(cols);
		sits = new String[getRows()][getCols()];
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				sits[i][j] = "X";
			}	
		}
		getSits();
		System.out.println("What row?");
		int row = sc.nextInt();
		System.out.println("What column?");
		int col = sc.nextInt();
		setSit(row, col);
		
	}
	
	@Override
	public void getSits(){
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				System.out.print(sits[i][j]);
			}
			System.out.println();
		}
	}
	
	@Override
	public void setSit(int row, int col){
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

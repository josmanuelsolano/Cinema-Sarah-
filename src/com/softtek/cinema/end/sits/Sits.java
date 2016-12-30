package com.softtek.cinema.end.sits;

import java.util.Scanner;

public class Sits extends FillSits{

	@Override
	public void setSits() {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("How many rows?");
		int rows = sc.nextInt(); 
		setRows(rows);
		
		System.out.println("How many columns?");
		int cols = sc.nextInt();
		setCols(cols);
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
}

package com.tech.array;
import java.util.*;
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[][]=new int[100][100];
		int row,col,i,j;
		
		System.out.println("Enter Number of Rows : ");
		 row=sc.nextInt();
		 System.out.println("Enter Number of Columns : ");
		col=sc.nextInt();
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.printf("Enter Element ",i,j);
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}

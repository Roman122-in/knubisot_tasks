package com.knubisoft.base.arrays;

import java.util.Scanner;

public class ArraysTasksImpl {
	
//Заполнение массива заданным количеством элементов
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize= scanner.nextInt();
		int array[] = new int[arraySize];
		
		for(int i=0; i<arraySize; i++) {
			array[i]=scanner.nextInt();
		}
		
		for(int i1 = array.length-1; i1 >= 0; i1--) {
		System.out.println(array[i1]);
		}

	}
}
	
	
	



 
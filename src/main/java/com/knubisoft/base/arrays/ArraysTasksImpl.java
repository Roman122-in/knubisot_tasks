package com.knubisoft.base.arrays;

import java.util.Scanner;

//Given an array, the task is to reverse the given array.
public class ArraysTasksImpl {
	
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
	
	//You are given two integer arrays array1 and array2, the task is to merge array1 and array2 into a single array.
   //  The elements of the second array must come after all the elements of the first.
	public void Part2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("size1:");
		int arraySize1 = scanner.nextInt();
		System.out.println("size2:");
		int arraySize2 = scanner.nextInt();
		
		int array2[]= new int[arraySize2];		
		int array1[]= new int[arraySize1];
		System.out.println("elements1");
		for(int i=0; i<arraySize1; i++) {
			array1[i]=scanner.nextInt();
		}
		System.out.println("elements2:");
		for(int i=0; i<arraySize2; i++) {
			array2[i]=scanner.nextInt();
		}
		 int[]c = new int[array1.length+array2.length];
		 int c1=0;
		 for(int i = 0; i<array1.length; i++) {
			        c[i] = array1[i];
			       c1++;
			     }
		 for(int j = 0;j<array2.length;j++) {
			        c[c1++] = array2[j];
			     }
		 for(int i = 0;i<c.length;i++)
			      System.out.print(c[i]);
		
}
	
	
	// Given an array with all distinct positive integers, find the largest three elements in the array.
	public void Part3() {
		
		
		
	}
	}
	

	
	
	



 
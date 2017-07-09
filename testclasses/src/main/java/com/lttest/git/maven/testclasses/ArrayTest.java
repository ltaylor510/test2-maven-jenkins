package com.lttest.git.maven.testclasses;

import java.util.Arrays;

public class ArrayTest {

	
	public static int search(int[] list, int key){
	      Arrays.sort(list);	
			return Arrays.binarySearch(list, key);
		  	}
	
	//test with string:
	public static void display(String... values){  
		  System.out.println("display method invoked "+values[0]);  
		 }  
	
	// overload test with ints:
	public static void display(int... values){  
		  System.out.println("display method invoked "+values[0]);  
		 }  
	
	
	public static void main(String[] args) {
		
		int [] numsa = {24355344,7712,29,33444,500078};
	    
		for (int i =0;i <= numsa.length -1; i++){
			System.out.println("mynums:"+ numsa[i]);
		}
		
		
	
		System.out.println(numsa[0] + ":" + numsa[3]);
		
		int a = search(numsa,0);
		System.out.println("test:"+a);
		
		
//int[][] mytdArray = new int[][]{{1,2},{3,4},{5,6},{7,8}};
	
	
		
	display("my","1","12.5","yes");
	display(3);
	
	
	
	
	
		
		
		

	}

}

package com.worksheet4;

public class Sorting {

private int[] ArraySort = new int[50];
		     
private int ArraySize = 10;
		     
public void RandomArray(){
		         
 for(int i = 0; i < ArraySize; i++){
		             
	 ArraySort[i] = (int)(Math.random()*10)+10;
		             
	 }
		         
		    }
 public void PrintArray(){
		    		         
		     System.out.println("----------");
 for(int i = 0; i < ArraySize; i++){
	 
		    System.out.print("| " + i + " | ");
		    System.out.println(ArraySort[i] + " |");
		    		             
		    System.out.println("----------");
		    		             
		    		        }
		    		         
		    		    }
		    		     
	public int ValueAtIndex(int index){
		    		         
		 if(index < ArraySize) return ArraySort[index];
		    		         
		  return 0;
		    		         
		    		    }
	
	 public boolean ArrayContainValue(int searchValue){
		    		    		         
		    boolean valueInArray = false;
		    		    		         
		    for(int i = 0; i < ArraySize; i++){
		    		    		             
		    if(ArraySort[i] == searchValue){
		    		    		                 
		     valueInArray = true;
		    		    		                 
		    		    		            }
		    		    		             
		    		    		        }
		    		    		         
		     return valueInArray; }
		    		    	     
	public void DeleteIndex(int index){
		    		    	         
		  if(index < ArraySize){
		    		   	             
		 for(int i = index; i < (ArraySize - 1); i++){
		    		    	                 
			 ArraySort[i] = ArraySort[i+1];
		    		    	                 
		    }
		    		    	             
		 ArraySize--;
		    		    	             
		    }
		    		    	         
		   }
	
	 
		    		    	    		     
	public void HorzArray(int i, int j){
		    		    	    		         
		 for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		 System.out.println();
		    		    	    		         
		  for(int n = 0; n < ArraySize; n++){
		    		    	    		             
		System.out.print("| " + n + "  ");
 }
		    		    	    		         
		 System.out.println("|");
		    		    	    		         
	for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		 System.out.println();
		    		    	    		         
	for(int n = 0; n < ArraySize; n++){
		    		    	    		             
		System.out.print("| " + ArraySort[n] + " ");
 }
		    		    	    		         
		System.out.println("|");
		    		    	    		         
 for(int n = 0; n < 51; n++)System.out.print("-");
		    		    	    		         
		System.out.println();
		    		    	    		         
	 if(j != -1){
		    		    	    	         
	 for(int k = 0; k < ((j*5)+2); k++)
		 System.out.print(" ");
		 System.out.print(j);
 }
		    		    	    		         
	  if(i != -1){
	  for(int l = 0; l < (5*(i - j)-1); l++)
		  System.out.print(" ");
		  System.out.print(i);
   }
		  System.out.println(); }
		    		    	    		     
	 public void BubbleSort(){
		 
	for(int i = ArraySize - 1; i > 1; i--){
		    		    	    		                 
	 for(int j = 0; j < i; j++){
		    		    	    		                     
	 if(ArraySort[j] > ArraySort[j + 1]){
		    		    	    		                         
		 swapValues(j, j+1);
		    		    	    		                         
		 HorzArray(i, j);  }
		    		    	    		                     
		 }
		     }
		 }
		    		    	    		         
	 public void swapValues(int indexOne, int indexTwo){
		    		    	    		             
		 int temp = ArraySort[indexOne];
		 ArraySort[indexOne] = ArraySort[indexTwo];
		 ArraySort[indexTwo] = temp;
		    		    	    		             
	 }
		    		    	    		         
		 public void binarySearchForValue(int value){
		    		    	    		             
		 int lowIndex = 0;
		 int highIndex = ArraySize - 1;
		    		    	    		             
	 while(lowIndex <= highIndex){
		    		    	    		                 
		 int middleIndex = (highIndex + lowIndex) / 2;
		 if(ArraySort[middleIndex] < value) lowIndex = middleIndex + 1;
		    		    	    		                 
		else if(ArraySort[middleIndex] > value) highIndex = middleIndex - 1;
		    		    	    		                 
		 else {
		    		    	    		                     
		System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
		    		    	    		                     
		 lowIndex = highIndex + 1; }
		    		    	    		                 
		 HorzArray(middleIndex, -1); }
		    		    	    		             
		  }
		    		    	    		         
	 public void SelectionSort(){
		    		    	    		             
	 for(int x=0; x < ArraySize; x++){
	 int minimum = x;
		    		    	    		                   
	 for(int y=x; y < ArraySize; y++){
		 
     if(ArraySort[minimum]>ArraySort[y]){
	 minimum = y;  }
	  }
		    		    	    		                   
	  swapValues(x, minimum);
		    		    	    		                   
	  HorzArray(x, -1);  }
		    		    	    		             
		 }
	 
	 public void InsertionSort(){
		    		    	    		             
	 for (int i = 1; i < ArraySize; i++){
		 
	  int j = i;
	  int toInsert = ArraySort[i];
	  
	  while ((j > 0) && (ArraySort[j-1] > toInsert)){
		  ArraySort[j] = ArraySort[j-1];
		 j--;
		    		    	    		                       
		 HorzArray(i, j); }
	  
	  ArraySort[j] = toInsert;
	  HorzArray(i, j);
	     System.out.println("\nArray[i] = " + ArraySort[i] + " Array[j] = " + ArraySort[j] + " toInsert = " + toInsert + "\n");
	 }
		    		    	    		             
		 }
		    		    	    		     
		 public static void main(String[] args){
		    		    	    		         
		Sorting newArray = new Sorting();
		    		    	    		         
		 newArray.RandomArray();
		    		    	    		           		    	    		         
		 newArray.BubbleSort();
		 
		 newArray.SelectionSort();
		    		    	    		         
		newArray.InsertionSort();
		    		    	    		         
		      }
		    		    	    		 
		    		    	    		}
		    		    	    	
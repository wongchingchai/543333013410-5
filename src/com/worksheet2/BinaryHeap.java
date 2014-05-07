package com.worksheet2;

public class BinaryHeap {
public void heapSort  (){}

public static final int max = 6;

public static void main(String[] args){
		
	int[] toSortArray = new int[max];
		
		//End
		
	toSortArray[0] =  0;
		
	for(int i = 1; i < max; i++){	
	toSortArray[i] = (int) (Math.random()*30);
	toSortArray[0]++; 
	
	int index = i;
	while(toSortArray[index/2]<toSortArray[index] && (index/2)!=0){
		int temp = toSortArray[index/2];
		toSortArray[index/2] = toSortArray[index];
		toSortArray[index] = temp;
		index=index/2;
				
			}
			
					
		}
		
	System.out.println("The array to be sorted is:");
		
	for(int i = 0; i < max; i++){
			
	System.out.print(" | " + toSortArray[i]);
			
		}
		
	System.out.println(" | ");

		//Start
		
		//Let's Sort it out now!
		
	while(toSortArray[0]>0){
				
	int temp = toSortArray[1];
	toSortArray[1] = toSortArray[toSortArray[0]];
	toSortArray[toSortArray[0]] = temp;
				
	for(int i = 1; i < toSortArray[0]; i++){
				
	int index = i;
						
	while(toSortArray[index/2]<toSortArray[index] && (index/2)!=0){
						
	int temp1 = toSortArray[index/2];
	toSortArray[index/2] = toSortArray[index];
	toSortArray[index] = temp1;
	index=index/2;
						
	}
						
		}	
				
	toSortArray[0]--;
			
		}
			
		//End
		
	System.out.println("The sorted array is: ");
		
	for(int i = 0; i < max; i++){
			
	System.out.print(" | " + toSortArray[i]);
		}
		
	System.out.println(" | ");
	}
	

	
	
}





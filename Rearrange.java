package p100days_code;

import java.util.ArrayList;
import java.util.Scanner;

//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
public class Rearrange_elements {
	public static int[] RearrangebySign(int[] A, int n){
	    
		  // Define 2 vectors, one for storing positive 
		  // and other for negative elements of the array.
		  ArrayList<Integer> pos=new ArrayList<>();
		  ArrayList<Integer> neg=new ArrayList<>();
		  
		  // Segregate the array into positives and negatives.
		  for(int i=0;i<n;i++){
		      
		      if(A[i]>0) pos.add(A[i]);
		      else neg.add(A[i]);
		  }
		  
		  // Positives on even indices, negatives on odd.
		  for(int i=0;i<n/2;i++){
		      
		      A[2*i] = pos.get(i);
		      A[2*i+1] = neg.get(i);
		  }

		 
		  return A;
		}    

		public static void main(String args[]) 
		{
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the no of elements");
		  int n = sc.nextInt();
		  int A[]=new int[n];
		  System.out.println("enter the elements in array");
		  for(int i=0;i<n;i++) {
			  A[i]=sc.nextInt();
		  }
		  
		 


		  int[]ans= RearrangebySign(A,n);
		  
		  for (int i = 0; i < n; i++) {
		    System.out.print(ans[i]+" ");
		  }

		}

}

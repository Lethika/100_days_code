package p100days_code;

public class Move_zero {
	public static int[] zero(int [] arr,int n) {
		int i,j=-1,temp;
		for(i=0;i<n;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1) return arr;
			for(i=j+1;i<n;i++) {
				if(arr[i]!=0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int [] ans= zero(arr,n);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
       // System.out.println(" ");
        }

	}

}


package p100days_code;
import java.util.*;
public class set_zero {
	public static ArrayList<ArrayList<Integer>> zeroset(ArrayList<ArrayList<Integer>> matrix ,int n, int m){
	int[] row = new int[n];
	int[] col = new int[m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(matrix.get(i).get(j)==0) {
				row[i]=1;
				col[i]=1;
			}
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(row[i]==1 || col[j]==1) {
				matrix.get(i).set(j, 0);
			}
		}
	}
	return matrix;
	}
public static void main (String args[]) {
	ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
	matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
	matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
	matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
	int n = matrix.size();
	int m = matrix.get(0).size();
	System.out.println("the final matrix is");
	ArrayList<ArrayList<Integer>> ans = zeroset(matrix,n,m);
	for(ArrayList<Integer>row:ans) {
		for (Integer ele : row) {
            System.out.print(ele + " ");
        }
        System.out.println();
	}
}
}

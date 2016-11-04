package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class arryli {
	/*input1:{12,13,14,15,16}
input2:{2,3,4,5,6}
output:{2,13,4,15,6}
*/
	public static void main(String[] args) {
		int a[]={12,13,14,15,16};
		int[] b={2,3,4,5,6};
		int ans[]=new int[a.length+b.length];
	ArrayList<Integer> al=new ArrayList<>();
	
		for(int i=0;i<a.length;i++)
			if(i%2!=0){
				ans[i]=a[i];
				al.add(a[i]);
			}
		for(int i=0;i<b.length;i++)
			if(i%2==0){
				ans[i]=b[i];
				al.add(b[i]);
			}
		System.out.println(Arrays.toString(ans));
		System.out.println(al.toString());
		
	}

}

package collections;
import java.util.*;
public class reverse {
/*input1={"red","green","blue","ivory"}
input2="ivory"
output:2(reverse sorted array = {"red","ivory","green","blue"}*/
	public static void main(String[] args){
		
		String arr[]={"red","green","blue","ivory"};
		String s2="ivory";
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(s2)){
				res=i;}
				
		}
		System.out.println(res);
	}
}

package check;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
input1:"delhi-pune-patna"
input2:"_"
output="delhi"*/
public class maxlength {
	public static void main(String[] args){
	String s1="aelhi-pune-aatna";
	String max="";
	String arr[]=s1.split("-");
	for(int i=0;i<arr.length;i++){
		for(int j=1;j<arr.length-1;j++){
		if(arr[i].length()>arr[j].length()){
			max=arr[i];
		}
		if(arr[i].length()==arr[j].length()){
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			max=arr[0];
		}
		else if(arr[i].length()>arr[j].length())
			max=arr[j];
	}
		}
	System.out.println(max);

}
}
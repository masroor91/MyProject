package check;

import java.util.StringTokenizer;

public class count {
	public static void main(String args[]){
		//Input=Hi this is cognizant Academy
		String s1="Hi this is cognizant Academy";
		String s2="is";
		int count=0;
		StringTokenizer st=new StringTokenizer(s2," ");
		if(st.hasMoreTokens())
				{
			if(s2.equals(st.nextToken())){
				count++;
			}
				}
		
		System.out.println(count);}
}

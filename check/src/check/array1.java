package check;

import java.util.StringTokenizer;

public class array1 {

	public static void main(String[] args) {
		//Input:Jessica Miller
		//output:Miller,J
		String s="Jessica Miller";
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(s," ");
		String s2=st.nextToken();
		System.out.println(s2);
	
		String s3=st.nextToken();
		System.out.println(s3);
		sb.append(s3).append(",").append(s2.substring(0,1));
		System.out.println(sb);
		
	}
}

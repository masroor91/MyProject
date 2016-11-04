package check;

public class swap {
/*The call swapPairs("forger") should return "ofgrte"
and
the call swapPairs("NEw York") should return "eN woYkr".*/
	public static void main(String[] args){
		String s1="NEw York";
		StringBuffer sb=new StringBuffer();

	
		for(int i=0;i<s1.length()-1;i=i+2){
			sb.append(s1.charAt(i+1)).append(s1.charAt(i));

				}
		if(s1.length()%2!=0){
		sb.append(s1.charAt(s1.length()-1));}
		System.out.println(sb.toString());

	}
}

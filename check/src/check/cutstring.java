package check;

public class cutstring {
	//input1=Hello
	//input2=hi
			//output=lohi
	public static void main(String[] args){
		String s1="hello";
		String s2="hi";
		StringBuffer sb=new StringBuffer();
		if(s1.length()==s2.length()){
			sb.append(s1).append(s2);
		}
		else{
			int b=s2.length();
			sb.append(s1.substring(b+1, s1.length())).append(s2);
			
		}
		System.out.println(sb.toString());
		
	}

}

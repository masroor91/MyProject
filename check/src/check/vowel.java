package check;

public class vowel {
	//Input=acebisouzz
		//	output=1
	public static void getvalues(String s1){
		String s2="aeiou";
	
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<s1.length();i++){
			for(int y=0;y<s2.length();y++){
			if(s1.charAt(i)==s2.charAt(y)){
				sb.append(s1.charAt(i));
				
			}
		
			}
		}
		if(sb.toString().equals(s2)){
			System.out.println("true");
		}
		else{
			System.out.println("false");}
		System.out.println(sb.toString());
		
	}
	public static void main(String[] args) {
		
		String s1="acebisouzz";
		getvalues(s1);
		
	}

}

package check;

public class Isdigit {
	//Input=good23bad4
			//output=2+3+4=9
	public static void main(String args[]){
	String s="goodbad123";
	int sum=0;
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++){
		char a=s.charAt(i);

	if(Character.isDigit(a)){
		sum=sum+Integer.parseInt(String.valueOf(a));
	}

	}
	if(sum==0)
		System.out.println(-1);
	else
	System.out.println(sum);
}
}
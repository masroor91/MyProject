package check;

public class trickylength {
public static void main(String[] args){
	/*input1="Rajasthan";
input2=2.
input3=3.
output=hts.*/
	String s1="Rajasthan";
	//nahtsajar

	int n1=2;
	int n2=3;
	StringBuffer sb=new StringBuffer(s1);


	sb.reverse();
	System.out.println(sb);
	String s2=sb.substring(n1, n1+n2);
	System.out.println(s2);
}
}

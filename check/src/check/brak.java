package check;

public class brak {
	/*Input1=California
Input2=3
output=Calnia*/
	public static void main(String[] args){
		String s1="California";
		int n1=3;
		StringBuffer sb=new StringBuffer();
		sb.append(s1.substring(0, n1)).append(s1.substring(s1.length()-n1,s1.length() ));
		System.out.println(sb.toString());
	}

}

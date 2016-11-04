package check;

public class maxvowels {
	/*Input: Appreciation is the best way to motivate.
Output: Appreciation(total vowels =6)*/
	public static void main(String[] args){
		String s1="Appreciation is the best way to motivate aeiouaeiouASD";
	String arr[]=s1.split(" ");
	String s2="aeiou";
	String s5="";

	int count=0;
	for(int i=0;i<arr.length;i++){
		
		int max=0;
		String s6=null;
		for(int j=0;j<arr[i].length();j++){
		char a=arr[i].charAt(j);
		s6=arr[i];
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
			max++;
		}
		
	}
		if(max>count){
			count=max;
			s5=s6;
		}
	}
System.out.println(s5);
System.out.println(count);
}
}

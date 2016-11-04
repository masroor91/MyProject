package check;
import java.util.*;

public class duplicate {
		public static void main(String[] args){
			LinkedHashSet<Character> lh=new LinkedHashSet<>();
			//Input : "HelloWod"
			//Output: 5
			String s1="Helloworld";
			for(char i:s1.toCharArray())
			//	for(int i=0;i<s1.length();i++)
			lh.add(i);
				System.out.println(lh.size());
}
}
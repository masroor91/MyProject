package collections;
import java.util.*;
public class arraylist {
	/*input={3,1,11,19,17,19}
output={3,1,19,17}*/
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		al.add(3);
		al.add(1);
		al.add(11);
		al.add(19);
		al.add(17);
		al.add(19);
		for(int i=1;i<al.size();i++){
			System.out.println(i);
			if(i%3!=0){
				
				al1.add(al.get(i-1));
			}
		}
		System.out.println(al1.toString());
	}

}

package collections;
import java.util.*;
public class arrylist {
	public static void main(String[] args) {
		int []a={2,3,5,1};
		int b[]={1,3,9};
		int sum=0;
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();

		for(int i:a)
			al.add(i);
		for(int i:b)
		al1.add(i);
		al.retainAll(al1);
		for(int i=0;i<al.size();i++)
			sum=sum+al.get(i);
		System.out.println(sum);
		
		

		
	}}

package collections;
import java.util.*;
public class hashmap {
/*Input={{2,"hi"}{8,"hello"}{12,"hellow world"}}
output=1*/
	
	public static void main(String[] args){
		Set<String> s=new HashSet<>();
		s.add("pooja");
		s.add("pooja");
		HashMap<Integer,String> hs=new HashMap<>();
		HashMap<Integer,String> hs1=new HashMap<>();
		hs.put(2, "hi");
		hs.put(8, "hello");
		hs.put(12, "helloworld");
		hs.put(2,"hi");
		hs.put(8, "hello");
		hs.put(15, "yoo");
		hs.put(12, "world");
		hs.put(45, "ya");
		int count=0;
	Iterator<Integer> it=hs.keySet().iterator();
	while(it.hasNext()){
		int n=it.next();
		if(n%4!=0){
			count++;
		}
	}
	System.out.println(count);
	Iterator<String> st=s.iterator();
	while(st.hasNext()){
		System.out.println(st);
	}
	
	}
}

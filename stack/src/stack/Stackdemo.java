package stack;
import java.util.*;
public class Stackdemo {
	public static final int capacity=3;
	int arr[]=new int[capacity];
	int top=-1;
	
	/** push method
	 
	 * check if array is full
	 */
	public void push(int value){
		if(top<capacity-1){
			top++;
			arr[top]=value;
			 System.out.println("Element " + value
				     + " is pushed to Stack !");
				   print();
			
		
		}
		else{
			
			System.out.println("stack overflow");
		}
			
	}
	
	/**
	 * check if array is empty
	 * else delete and print the top element
	 * */
	public void pop(){
		if(top<0){
			System.out.println("stack underflow");
		}
		else
			top--;
		
	}
	public void print(){
		if(top>=0){
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}}
	}
	
public static void main(String[] args){
	Stackdemo s=new Stackdemo();
	s.pop();
	s.push(3);
	s.push(4);
	s.pop();
	s.push(5);
	s.push(4);
	s.push(7);
	s.print();
	
}
	
	
	
}

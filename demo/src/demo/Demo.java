package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Demo extends Exception{
	
	
	
	public  void call(Integer a)
	{
		System.out.println("Double");
	}
	
	public static void call(short a)
	{
		System.out.println("Short");
	}
	public void call(long a)
	{
		System.out.println("Long");
	}
	
	public  int call(int a)
	{
		System.out.println("Integer");
		return a;
	}
	public static void call(byte a)
	{
		System.out.println("byte");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10.30;
		int y=5;
		int z=(int) (x*y);
	Demo d= new Demo();
	d.call(10);
//	int[] arr=new int[10];
//	TreeMap<Integer,Integer> tm=new TreeMap();
//	tm.put(1, 5);
//	HashMap< Integer, Integer> hm=new HashMap<Integer, Integer>();
//	hm.put(null, 5);
//	System.out.println(hm);
	List<Integer> ls=new ArrayList<Integer>();
	ls.add(1);
	ls.add(5);
	Integer[] i= ls.toArray(new Integer[ls.size()]);
	for(Integer s:i)
		 System.out.println(s);

	List<Integer> l= Arrays.asList(i);
	
	System.out.println(l);
	}

}

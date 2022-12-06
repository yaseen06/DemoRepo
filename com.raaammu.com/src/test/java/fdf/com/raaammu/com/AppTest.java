package fdf.com.raaammu.com;

import java.util.LinkedList;

public class AppTest {

	public static void main(String[] args)
	{
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("benz");
		cars.add("volvo");
		cars.add("apple");
		cars.addFirst("One");
		cars.add(1,"Two");
		cars.clone();
		cars.add(null);
		cars.add("benz");
		cars.add("benz");
		cars.add(null);
		
		for(String str : cars)
		{
			System.out.println(str);
		}
		
	}

}

package VogelAlgorithms;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]){
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Raaj", new Double(1000));
		balance.put("Raja", new Double(2000));
		balance.put("Rajni", new Double(3000));
		balance.put("Rajesh", new Double(4000));
		balance.put("Raj", new Double(500000));
		
		names = balance.keys();
		bal = ((Double)balance.get("Raj")).doubleValue();
		balance.put("Rani", new String("Swapnil"));
		
		balance.put("Rajesh", new Double(bal+4000));
		System.out.println(balance.get("Rajesh"));
		while(names.hasMoreElements()){
			System.out.println(names.nextElement()+" and balance is: "+balance.get(names.nextElement()));
			
		}
		
	}
}

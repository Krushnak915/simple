package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		list.add("melon");
		list.add("CustardApple");
		//find fruit which start with m
		list.stream().filter(e -> e.startsWith("m")).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		//sort list s
		list.stream().map(String::length).sorted().collect(Collectors.toList()).forEach(e -> System.out.println(e));;

		
		System.out.println(list);
	}

}

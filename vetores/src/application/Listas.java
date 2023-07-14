package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listas {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s = new LinkedHashSet<>();
		s = new TreeSet<>();
		

		List<String> list = new ArrayList<>();
		list = new LinkedList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(3) == 'x');
		for (String x : list) {
		System.out.println(x);
		
		}		
	}
}
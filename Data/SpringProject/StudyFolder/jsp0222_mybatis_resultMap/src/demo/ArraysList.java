package demo;

import java.util.Arrays;
import java.util.List;

public class ArraysList {
public static void main(String[] args) {
	String[] ar = {"10","20","30"};
	List<String> arlist = Arrays.asList(ar);
	for(String e : arlist) {
		System.out.println(e);
	}
}
}

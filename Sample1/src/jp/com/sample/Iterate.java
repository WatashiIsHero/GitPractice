package jp.com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Takayuki", "Haruka", "Tsuyoshi"));

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}

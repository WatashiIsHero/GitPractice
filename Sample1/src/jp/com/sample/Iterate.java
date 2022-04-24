package jp.com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Iterate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Takayuki", "Haruka", "Tsuyoshi"));

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String element = iterator.next();
			System.out.println(element);
		}

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {

			String nextIterator = iterator.next();
			if (nextIterator.equals("Takayuki")) {
				iterator.remove();
			}
		}

		System.out.println();

		for (String listData : list) {
			System.out.println(listData);
		}

		Map<String, Integer> scores = new HashMap<>();

		scores.put("Takayuki", 10);
		scores.put("Haruka", 70);
		scores.put("Tsuyoshi", 40);
		scores.put("Shin", 50);

		// キーから値の取得
		System.out.println(scores.get("Tsuyoshi"));

		// 情報の削除
		scores.remove("Haruka");

		// Map内の情報を文字列で出力
		String strScore = scores.toString();
		System.out.println(strScore);

		// キーの検索
		System.out.println(scores.containsKey("Takayuki"));

		// 値の検索
		System.out.println(scores.containsValue(70));


	}
}
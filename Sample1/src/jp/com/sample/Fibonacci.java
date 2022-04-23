package jp.com.sample;

public class Fibonacci {

	public static void main(String[] args) {

		// フィボナッチ数列を配列を用いて10個処理する
		int[] fiboArray = new int[11];

		for (int i = 0; i <= 10; i++) {
			// 0 と 1 を先に格納する
			// 次以降は前の二つの要素の和を格納する
			if (i == 0 || i == 1) {
				fiboArray[i] = i;
			} else {
				fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
			}
		}

		// 配列要素を出力する
		for (int fechedData : fiboArray) {

			System.out.println(fechedData);
		}
	}
}
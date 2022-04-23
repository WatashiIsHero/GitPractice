package jp.com.sample.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {

	public static void main(String[] args) {

		Student[] list =
			{
			 new Student(1, "Takayuki"),
			 new Student(3, "Tsuyoshi"),
			 new Student(4, "Haruka"),
			 new Student(2, "Shin")
			};

		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return Integer.compare(o1.getId(), o2.getId());
			}
		};

		Arrays.sort(list, comparator);

		for (Student data : list) {

			System.out.println("ID : " + data.getId()
					+ " , " + "Name : " + data.getName());
		}

		/** List<Student> convertedArrayStudent = new ArrayList<Student>(Arrays.asList(list));

		int result1 = Collections.binarySearch(convertedArrayStudent, "Takayuki");
		int result2 = Collections.binarySearch(convertedArrayStudent, "Yaesu");

		System.out.println(result1);
		System.out.println(result2);*/

		List<Integer> list2 = Arrays.asList(1, 3, 4, 5, 7, 10, 12, 15);
		int searchResult1 = Collections.binarySearch(list2, 3);
		int searchResult2 = Collections.binarySearch(list2, 7);
		int searchResult3 = Collections.binarySearch(list2, 11);

		System.out.println(searchResult1);
		System.out.println(searchResult2);
		System.out.println(searchResult3);
	}
}
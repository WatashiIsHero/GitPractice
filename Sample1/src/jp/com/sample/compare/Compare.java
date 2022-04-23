package jp.com.sample.compare;

import java.util.Arrays;
import java.util.Comparator;

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
	}
}
package jp.com.sample.compare;

public class Student implements Comparable<Object> {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

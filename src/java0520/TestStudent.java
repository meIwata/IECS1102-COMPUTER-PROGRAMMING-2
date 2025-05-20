package java0520;

public class TestStudent {
	public static void main(String[] args) {
		Student tom = new Student("Tom", "Male", 18);
		Student chen = new Student("Tom", "Male", 18);

		System.out.println(tom == chen); // false
		System.out.println(tom.equals(chen)); // false -> true，因爲回去Student寫姥覆寫equals的方法
	}
}

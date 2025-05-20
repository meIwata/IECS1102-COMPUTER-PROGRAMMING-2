package java0520;

public class TestStudent {
	public static void main(String[] args) {
		Student tom = new Student("Tom", "Male", 18);
		Student chen = new Student("Tom", "Male", 18);

		System.out.println(tom == chen); // false
		System.out.println(tom.equals(chen)); // false -> true，因爲回去Student寫覆寫equals的方法
		String tomToString = tom.toString();
		System.out.println(tomToString); // java0520.Student@5ca881b5，印出識別號碼 -> name=Tom, gender=Male, age=18，因爲回去Student寫覆寫toString()方法
		System.out.println(tom); // java0520.Student@5ca881b5，印出識別號碼 -> name=Tom, gender=Male, age=18，因爲回去Student寫覆寫toString()方法
	}
}

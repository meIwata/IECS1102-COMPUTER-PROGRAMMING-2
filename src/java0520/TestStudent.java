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

		// 基本型別和基本資料類別型態的轉換（int ↔ Integer）
		String str = "Hello";
		int num = 123;
//		Integer num2 = Integer.valueOf(num); // Boxing: 把基本型別的整數 num 轉成包裝類別 Integer，產生一個 Integer 物件 num2，值也是 123。
//		int num3 = num2.intValue(); // Unboxing
		Integer num2 = num; // Auto-boxing
		int num3 = num2; // Auto-unboxing
		String str2 = num2.toString(); // 把 num2（Integer 物件）轉成字串，得到 "123"，存到 str2 這個字串變數裡。
		str = str + num; // 做字串的串接
		System.out.println(str);
	}
}

package java0520;

public class Student extends Object {
	private String name;
	private String gender;
	private int age;

	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 覆寫equals方法: 比較名字相同才視為相同物件
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student other = (Student) obj;
//			if (this.name.equals(other.name)) {
//				return true;
//			}
//		}
//		return false;
//	}

	// 覆寫equals方法: 比較名字、性別、年紀相同才視為相同物件
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (this.name.equals(other.name) && this.gender.equals(other.gender) && this.age == (other.age)) { // int age 是基本型別需要用==來做比較
				return true;
			}
		}
		return false;
	}

	// 覆寫toString()方法
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", age=" + age;
	}
}

package No10_Polymorphism;

public class Student extends Person {
	String address;
	
	void introduce() {
		super.introduce();
		System.out.println("我家住在"+address);
	}
	
	void study() {
		System.out.println("我正在學習Java");
	}
}

package No10_Polymorphism;

public class Student extends Person {
	String address;
	
	void introduce() {
		super.introduce();
		System.out.println("�ڮa��b"+address);
	}
	
	void study() {
		System.out.println("�ڥ��b�ǲ�Java");
	}
}

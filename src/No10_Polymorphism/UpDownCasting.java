package No10_Polymorphism;

public class UpDownCasting {
// ����}:http://peimei0808.pixnet.net/blog/post/130333142-%5Bjava%5D-java%E4%B8%AD%E7%89%A9%E4%BB%B6%E8%BD%89%E5%9E%8B%E4%B9%8B%E4%BB%8B%E7%B4%B9%E2%80%94%E5%90%91%E4%B8%8A%E5%8F%8A%E5%90%91%E4%B8%8B%E8%BD%89%E5%9E%8B
	public static void main(String[] args) {
		// �V�W�૬�y�k�A�]�i�g�� Person p = new Student();
		Student s1 = new Student();
		Person p = s1;
		p.name = "�i�T";
		p.age = 10;
// �U�G�欰���~�N�X�A�b���u��եΤ���(Person)���������ܼƻP���		
//		p.address = "�x�F";
//		p.study();
// �U���ڽեΪ����O���󤤪������ܼƻP��ơA�]���䬰Student�����e�A���]address�S�Q��ȡA�ҥH�L�X���G��null		
		p.introduce();
		System.out.println();
		// �V�U�૬�y�k
		Student s2 = (Student) p;
		s2.name = "���|";
		s2.age = 10;
		s2.address = "�x�_";
		s2.study();
		s2.introduce();
	}

}

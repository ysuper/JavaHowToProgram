package No10_Polymorphism;

public class UpDownCasting {
// 原網址:http://peimei0808.pixnet.net/blog/post/130333142-%5Bjava%5D-java%E4%B8%AD%E7%89%A9%E4%BB%B6%E8%BD%89%E5%9E%8B%E4%B9%8B%E4%BB%8B%E7%B4%B9%E2%80%94%E5%90%91%E4%B8%8A%E5%8F%8A%E5%90%91%E4%B8%8B%E8%BD%89%E5%9E%8B
	public static void main(String[] args) {
		// 向上轉型語法，也可寫成 Person p = new Student();
		Student s1 = new Student();
		Person p = s1;
		p.name = "張三";
		p.age = 10;
// 下二行為錯誤代碼，在此只能調用父類(Person)有的成員變數與函數		
//		p.address = "台東";
//		p.study();
// 下行實際調用的都是物件中的成員變數與函數，因此其為Student的內容，但因address沒被賦值，所以印出結果為null		
		p.introduce();
		System.out.println();
		// 向下轉型語法
		Student s2 = (Student) p;
		s2.name = "李四";
		s2.age = 10;
		s2.address = "台北";
		s2.study();
		s2.introduce();
	}

}

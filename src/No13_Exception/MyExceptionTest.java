package No13_Exception;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			for (int i=1;i<10;i++) {
				if (i == 5) {
					throw new MyException(5);
				}
				System.out.println("�X������:"+i);
			}
		} catch(Exception e) {
			// �B�z�ۭq���ҥ~
			System.out.println("�ҥ~����:"+e.getMessage());
			System.out.println("�ҥ~��]");
			e.printStackTrace();
		} finally {
			System.out.println("�ҥ~�B�z����");
		}
	}

}

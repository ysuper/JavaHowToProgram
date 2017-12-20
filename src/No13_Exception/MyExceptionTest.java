package No13_Exception;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			for (int i=1;i<10;i++) {
				if (i == 5) {
					throw new MyException(5);
				}
				System.out.println("出價次數:"+i);
			}
		} catch(Exception e) {
			// 處理自訂的例外
			System.out.println("例外說明:"+e.getMessage());
			System.out.println("例外原因");
			e.printStackTrace();
		} finally {
			System.out.println("例外處理結束");
		}
	}

}

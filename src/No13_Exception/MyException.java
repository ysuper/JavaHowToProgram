package No13_Exception;

public class MyException extends Exception{
	MyException(){
		super();
	}

	MyException(int msg){
		super("�X�����ƤӦh "+msg);
	}
}

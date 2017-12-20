package No13_Exception;

public class MyException extends Exception{
	MyException(){
		super();
	}

	MyException(int msg){
		super("出價次數過多"+msg);
	}
}

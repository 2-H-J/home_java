package e03_exception;

public class UserException extends Exception{

	public UserException(String message) { // 외부에서 받아서 에러 메세지 
		super(message);
	}
	
	

}

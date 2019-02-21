package tech.hackpro.myapp.customexception;

//@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class CustomException extends Exception{
	
	
	public CustomException(String errorMessageInfo)
	{
		super(errorMessageInfo);
	}

}

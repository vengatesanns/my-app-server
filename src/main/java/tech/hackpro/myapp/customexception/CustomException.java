package tech.hackpro.myapp.customexception;

public class CustomException extends Exception{
	
	private String errorMessage;
	
	public CustomException(String errorMessageInfo)
	{
		this.errorMessage = errorMessageInfo;
	}
	
	public String toString()
	{
		return this.errorMessage+"" ;
	}

}

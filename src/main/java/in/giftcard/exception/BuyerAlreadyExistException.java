package in.giftcard.exception;

@SuppressWarnings("serial")
public class BuyerAlreadyExistException extends RuntimeException {
public static  String message="buyer already exists !..please login";


public BuyerAlreadyExistException()
{
	
}
@SuppressWarnings("static-access")
public BuyerAlreadyExistException(String message)
{
	this.message=message;
}
}

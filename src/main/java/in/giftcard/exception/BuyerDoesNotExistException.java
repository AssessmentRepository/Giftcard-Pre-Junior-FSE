package in.giftcard.exception;

@SuppressWarnings("serial")
public class BuyerDoesNotExistException extends RuntimeException {
	public static String message = "buyer does not exists !..please login";

	public BuyerDoesNotExistException() {

	}

	@SuppressWarnings("static-access")
	public BuyerDoesNotExistException(String message) {
		this.message = message;
	}
}

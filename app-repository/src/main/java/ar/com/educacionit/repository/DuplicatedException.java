package ar.com.educacionit.repository;


public class DuplicatedException extends Exception {

	public DuplicatedException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
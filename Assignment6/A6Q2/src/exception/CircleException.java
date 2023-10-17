package exception;

import java.util.Arrays;

public class CircleException extends Exception {

	public CircleException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CircleException [" + getMessage() + "]";
	}

}
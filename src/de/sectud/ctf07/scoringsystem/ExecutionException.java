package de.sectud.ctf07.scoringsystem;

/**
 * Thrown when a subprocess could not be executed (be it a local or remote
 * subprocess)
 * 
 * @author Hans-Christian Esperer
 * @email esperer@sit.fraunhofer.de
 * 
 */
public class ExecutionException extends Exception {

	public ExecutionException(Throwable e) {
		super(e);
	}

	public ExecutionException() {
	}

	public ExecutionException(String s) {
		super(s);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1757689955399751418L;

}

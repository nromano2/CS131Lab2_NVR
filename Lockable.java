/**
 * The Lockable interface specifies methods that the Wizard class must implement.
 * @author Nicholas Romano
 * @version 1.0
 * Module 2 Programming Lab
 * CS131 Spring 2023
 */
public interface Lockable {
	/**
	 * The setKey method will be implemented in the wizard class to modify the value of the wizard's key.
	 * @param key - the new value of the key that is to be set
	 */
	public void setKey(int key);
	
	/**
	 * The lock method will be implemented in the wizard class to modify the lockable state of the wizard to locked.
	 * @param key - the current key value
	 */
	public void lock(int key);
	
	/**
	 * The unlock method will be implemented in the wizard class to modify the lockable state of the wizard to unlocked.
	 * @param key - the current key value
	 */
	public void unlock(int key);
	
	/**
	 * The isLocked method will be implemented in the wizard class to simply return the lockable state of the wizard
	 * @return the lockable state of the wizard represented as a boolean value.
	 */
	public boolean isLocked();
}//end interface

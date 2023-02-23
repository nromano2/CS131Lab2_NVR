/**
 * This class represents a wizard for a D&D type game.
 * @author rkelley, Nicholas Romano
 * @version 1.0
 * Module 2 Programming Lab
 * CS131 Spring 2023
 */

public class Wizard implements Lockable{
	
	private String name; //name variable represents the name of the wizard character
	private int health; //health variable represents the health level of the wizard character
	private int key; //key variables represents the value of the key that locks the characters health level
	boolean locked; //locked boolean variable represents the lockable state of the character
	
	/**
	 * Default constructor to put object into consistent state.
	 * Default constructor sets wizards name to an empty string, the health and key to 0, and locked to false.
	 */
	public Wizard() 
	{
		setName("");
		setHealth(0);
		setKey(0);
		setLocked(false);
	}//end constructor
	
	/**
	 * Constructor to create object with common usage. 
	 * This is the preferred constructor.
	 * @param name - wizard's name
	 * @param health - wizards's health level
	 * @param key - key value that locks the wizard's health level from taking damage
	 * @param locked - boolean representing whether the wizard's health level starts out being locked or unlocked
	 */
	public Wizard(String name, int health, int key, boolean locked) 
	{
		setName(name);
		setHealth(health);
		setKey(key);
		setLocked(locked);
		
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) 
	{	
		if(isLocked() == false)
		{
			health -= power;
		}
		
	}//end takeDamage
	
	/**
	 * Getter method for name
	 * @return the name of the wizard
	 */
	public String getName() 
	{
		return name;
	}//end getName
	
	/**
	 * Setter method for name
	 * @param name - new name given to the wizard
	 */
	public void setName(String name) 
	{
		this.name = name;
	}//end setName
	
	/**
	 * Getter method for health
	 * @return the health level of the wizard
	 */
	public int getHealth() 
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter method for health
	 * @param health - new health level of the wizard
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter method for the key
	 * @return the value of the key
	 */
	public int getKey() 
	{
		return key;
	}//end getKey

	/**
	 * Setter method for the key.
	 * The setter for the key requires that the new key value passed is greater than 0 and that the new value is not the current key value.
	 * If both requirements are met the value of the key is set to the value passed in through the parameter list.
	 * @param key - the new value that the key is to be set to.
	 */
	public void setKey(int key) 
	{
		if((key > 0) && (this.key != key))
		{
			this.key = key;
		}
	}// end setKey
	
	/**
	 * Getter method for the locked health state of the wizard.
	 * @return the current locked health state of the wizard
	 */
	public boolean getLocked()
	{
		return locked;
	}//end getLocked
	
	/**
	 * Setter method for the locked health state of the wizard
	 * @param locked - the new boolean value that the locked health state of the character is to take on
	 */
	public void setLocked(boolean locked)
	{
		this.locked = locked;
	}//end setLocked
	
	/**
	 * The lock method modifies the lockable health state of the wizard to locked.
	 * The method does this by passing in an int value and checking to see if the passed value is equal to the current key value of the wizard.
	 * If the passed key parameter matches the current key value, the wizard's lockable health state becomes locked (true).
	 * 
	 * @param key - the current key value
	 */
	@Override
	public void lock(int key) {
		if(this.key == key)
		{
			this.locked = true;
		}
	}//end lock

	/**
	 * The unlock method modifies the lockable health state of the wizard to unlocked.
	 * The method does this by passing in an int value and checking to see if the passed value is equal to the current key value of the wizard.
	 * If the passed key parameter matches the current key value, the wizard's lockable health state becomes unlocked (false).
	 * 
	 * @param key - the current key value
	 */
	@Override
	public void unlock(int key) {
		if(this.key == key)
		{
			this.locked = false;
		}
	}//end unlock

	/**
	 * The isLocked method simply returns the lockable health state of the character
	 * @return lockable health state by using the getLocked method
	 */
	@Override
	public boolean isLocked() {
		return getLocked();
	}//end isLocked
	
	/**
	 * The toString method returns a string representation of the wizard object.
	 * @return a string representation of the wizard object.
	 */
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class


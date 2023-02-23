/**
 * @author Nicholas Romano
 * @version 1.0
 * Module 2 Programming Lab
 * CS131 Spring 2023
 */


public class Application {

	public static void main(String[] args) {
		
		
		Wizard wizardCharacter = new Wizard(); //instantiating a new wizard character using default parameter
		wizardCharacter.setName("Harry Potter"); //setting wizard name
		wizardCharacter.setHealth(3123); //setting wizard starting health level
		wizardCharacter.setKey(8); //setting wizard key value
		wizardCharacter.setLocked(true); //setting wizard's lockable health status as locked(true)
		
		Wizard magicalCharacter = new Wizard("Merlin", 4267, 9, true); //instantiating a new wizard character using the preferred parameter
		
		//Using the getter and toString methods to display character information
		System.out.println("======================================Starting Character Information====================================");
		System.out.println("Character 1: ");
		System.out.println("Wizard Name: " + wizardCharacter.getName());
		System.out.println("Current Health Level: " + wizardCharacter.getHealth());
		System.out.println("Key Value: " + wizardCharacter.getKey());
		System.out.println("Is " + wizardCharacter.getName() + "'s health locked?: " + wizardCharacter.getLocked());
		System.out.println("Condensed Character Information: " + wizardCharacter.toString() + "\n");
		
		System.out.println("\nCharacter 2: ");
		System.out.println("Wizard Name: " + magicalCharacter.getName());
		System.out.println("Current Health Level: " + magicalCharacter.getHealth());
		System.out.println("Key Value: " + magicalCharacter.getKey());
		System.out.println("Is " + magicalCharacter.getName() + "'s health locked?: " + magicalCharacter.getLocked());
		System.out.println("Condensed Character Information: " + magicalCharacter.toString());
		System.out.println("======================================================================================================\n");
		
		//opening prompt
		System.out.println("Trial 1:\n" 
		+ "Harry and Merlin must gather supplies at the nearby village of Pottersdale before the the incoming winter storm hits. \n"
		+ "Relucant to go, they remember that recent winter storms have been rather harsh so they decide to go. \n"
		+ "After a half day journey, they gather the neccesary food, wood, water and extra clothes needed to last about a week. \n"
		+ "On their back from the nearby village, they are caught off gaurd as they are ambushed by an evil, armed goblin. \n");
		
		wizardCharacter.unlock(8); //modifying wizard's lockable health status to false.
		magicalCharacter.unlock(9); //modifying wizard's lockable health status to false.
		
		//Having each wizard take damage while their health state is not locked and displaying the new health levels
		System.out.println("Opponent Attack 1:");
		wizardCharacter.takeDamage(350);
		magicalCharacter.takeDamage(425);
		System.out.println("Harry's current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		System.out.println("Opponent Attack 2:");
		wizardCharacter.takeDamage(275);
		magicalCharacter.takeDamage(342);
		System.out.println("Harry's current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		System.out.println("Opponent Attack 3:");
		wizardCharacter.takeDamage(356);
		magicalCharacter.takeDamage(430);
		System.out.println("Player Current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		
		//Checking and modifying each wizards lockable health status to true
		System.out.println("Harry's Health Lock status: " + wizardCharacter.isLocked());
		wizardCharacter.lock(8);
		System.out.println("Harry's Health Lock status: " + wizardCharacter.isLocked() + "\n");
		
		System.out.println("Merlin's Health Lock status: " + magicalCharacter.isLocked());
		magicalCharacter.lock(9);
		System.out.println("Merlin's Health Lock status: " + magicalCharacter.isLocked() + "\n");
		
		//Having each wizard take damage, but it would not inflict damage as their health status is locked.
		System.out.println("Opponent Attack 4:");
		wizardCharacter.takeDamage(670);
		magicalCharacter.takeDamage(721);
		System.out.println("Harry's current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		System.out.println("Opponent Attack 5:");
		wizardCharacter.takeDamage(800);
		magicalCharacter.takeDamage(880);
		System.out.println("Harry's current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		System.out.println("Opponent Attack 6:");
		wizardCharacter.takeDamage(1100);
		magicalCharacter.takeDamage(1090);
		System.out.println("Harry's current health level: " + wizardCharacter.getHealth());
		System.out.println("Merlin's current health level: " + magicalCharacter.getHealth() + "\n");
		
		System.out.println("\nGoblin retreats as his more powerful attacks are not dealing any damage. \n");
		
		//Displaying updated character information
		System.out.println("======================================Updated Character Information====================================");
		System.out.println("Character 1: ");
		System.out.println("Wizard Name: " + wizardCharacter.getName());
		System.out.println("Current Health Level: " + wizardCharacter.getHealth());
		System.out.println("Key Value: " + wizardCharacter.getKey());
		System.out.println("Is the " + wizardCharacter.getName() + " character locked?: " + wizardCharacter.getLocked());
		System.out.println("Condensed Character Information: " + wizardCharacter.toString());
		
		System.out.println("\nCharacter 2: ");
		System.out.println("Wizard Name: " + magicalCharacter.getName());
		System.out.println("Current Health Level: " + magicalCharacter.getHealth());
		System.out.println("Key Value: " + magicalCharacter.getKey());
		System.out.println("Is the " + magicalCharacter.getName() + " character locked?: " + magicalCharacter.getLocked());
		System.out.println("Condensed Character Information: " + magicalCharacter.toString());
		System.out.println("======================================================================================================\n");

	}

}

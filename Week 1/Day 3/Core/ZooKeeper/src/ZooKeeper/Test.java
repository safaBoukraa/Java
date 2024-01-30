package ZooKeeper ;
public class Test {
	 public static void main(String[] args) {
	        // Test the Gorilla1 class
	        Gorilla1 gorilla = new Gorilla1(100);
	        gorilla.throwSomething();
	        gorilla.throwSomething();
	        gorilla.throwSomething();
	        gorilla.eatBananas();
	        gorilla.eatBananas();
	        gorilla.climb();
	        gorilla.displayEnergy();

	        // Test the Bat class
	        Bat bat = new Bat();
	        bat.attackTown();
	        bat.attackTown();
	        bat.attackTown();
	        bat.eatHumans();
	        bat.eatHumans();
	        bat.fly();
	        bat.fly();
	        bat.displayEnergy();
	    }
}

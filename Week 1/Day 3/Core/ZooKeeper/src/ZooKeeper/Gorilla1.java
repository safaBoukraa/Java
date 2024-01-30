package ZooKeeper ;
public class Gorilla1 extends Mammal1 {

	public Gorilla1(int energy) {
		super(energy);}
		// TODO Auto-generated constructor stub
		 public void throwSomething() {
		        System.out.println("The gorilla has thrown something. Energy decreased by 5.");
		        this.setEnergy(this.getEnergy() - 5);
		    }

		    public void eatBananas() {
		        System.out.println("The gorilla is eating bananas. Energy increased by 10.");
		        this.setEnergy(this.getEnergy() + 10);
		    }

		    public void climb() {
		        System.out.println("The gorilla is climbing. Energy decreased by 10.");
		        this.setEnergy(this.getEnergy() - 10);
		    
	}

}

   

   


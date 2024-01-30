package ZooKeeper ;
public class Bat extends Mammal1  {

	public Bat(int energy) {
		super(energy);}
		
	 public Bat() {
	        super(300);
	    }

	    public void eatHumans() {
	        System.out.println(" the bat is eatingHumans .Energy  increased by 25");
	        this.setEnergy(this.getEnergy() + 25);
	    }
	    public void fly() {
	        System.out.println("The bat is flying. Energy decrease by 50.");
	        this.setEnergy(this.getEnergy() -50);
	    
}
	   
	    public void attackTown() {
	        System.out.println("The bat is attackingTown. Energy decrease by 100.");
	        this.setEnergy(this.getEnergy() -100);
	
	    }
	    }




		


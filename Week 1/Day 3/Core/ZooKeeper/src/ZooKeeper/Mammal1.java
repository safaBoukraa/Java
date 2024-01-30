package ZooKeeper ;
public class Mammal1{
	 
		private int energy;
		
		public Mammal1(int energy) {
		    this.setEnergy(energy);
		}
		
		public void displayEnergy() {
		    System.out.println("Energy level: " + getEnergy());
		}

		public int getEnergy() {
			return energy;
		}

		public void setEnergy(int energy) {
			this.energy = energy;
		}
		}

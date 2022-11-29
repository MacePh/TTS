package classes;

//import java.io.Console;
public class Grinch {
//	Variables
	 private String name;
	 private int heartSize; 
	 private String feelsForXmas;
	 private String plansForXmas;
	 
//	 Constructors
	 public Grinch() {
//		 default constructor 
	 }
	 public Grinch (String name, String feelsForXmas, String plansForXmas) {
		  this.name=name;
		  this.feelsForXmas = feelsForXmas;
		  this.plansForXmas = plansForXmas;
	  }
	 public Grinch (String name, int heartSize, String feelsForXmas, String plansForXmas) {
		  this.name=name;
		  this.heartSize=heartSize;
		  this.feelsForXmas =feelsForXmas;
		  this.plansForXmas = plansForXmas;
	  }
	 
//	 Gets
		public String getName() {
			return name;
		}
		public int getheartSize() {
			return heartSize;
		}
		public String feelsForXmas() {
			return feelsForXmas;
		}
		public String getplansForXmas() {
			return plansForXmas;
		}
		
		
		
//		Sets
		
		public void setName(String name) {
			this.name = name;
		}
			public void setheartSize(int heartSize) {
			this.heartSize = heartSize;
		}
		public void setfeelsForXmas(String feelsForXmas) {
			this.feelsForXmas = feelsForXmas;
		}
		public void setplansForXmas(String plansForXmas) {
			this.plansForXmas = plansForXmas;
		}
		
//Methods
		public void greetGrinchy() {
			 System.out.println("Hello, "+name +"!");
		 }
		 public void heartSize() {
			 System.out.println(name+ "'s heart is"+age +" sizes compared to the average Who in Whoville!");
		 }
		 public void getPlans() {
			 System.out.println("When asked how he feels about Christmas, "name+" will tell you "+feelsForXmas+"!");
		 }
		 public void runIt() {
			 this.greetPet();
			 this.agePet();
			 this.typePet();
		 }
		
//		Boolean
		public boolean isGrinchy() {
			return true; 
		}
		
		public String giddap() {
			return "And NOW!...I will stuff up the tree!";
		}
//		
		public String stealPresents(String list) {
			//there is now a variable called list, that exists in this code
			return list;
		}
		public String deliverPresents(String list) {
			//there is now a variable called list, that exists in this code
			return list;
		}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Grinch grinch = new Grinch("Grinch", -2, "hates it.", "steal xmas from the who's in Who-ville");
//		System.out.println(grinch.stealPresents("Stockings", "Roast Beast", "trees"));
		
		
		//String list = "pizza";
	}

}

package classes;
import java.io.Console;
import java.util.*;

public class Pet {
//	Variables
	 private String name;
	 private int age; 
	 private String location;
	 private String type;
	
//	 Constructors
	 public Pet(){
//		 Default constructor
	 }
	 public Pet (String name, int age, String location, String type) {
		  this.name=name;
		  this.age=age;
		  this.location =location;
		  this.type = type;
	  }
//	 Methods
	 public void greetPet() {
		 System.out.println("Hello, "+name +"!");
	 }
	 public void agePet() {
		 System.out.println(name+ " is "+age +" years old!");
	 }
	 public void typePet() {
		 System.out.println(name+" is a "+type+"! A good "+type+"y, too!");
	 }
	 public void runIt() {
		 this.greetPet();
		 this.agePet();
		 this.typePet();
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
		
		public void setname(String name) {
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
	 
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		 Pet pet1= new Pet();
		// Pet pet2 new Pet("Indigo");
		 Pet pet3 = new Pet("Yaya",1,"fishbowl","fish");
		 Pet pet4 = new Pet("Milo", 14, "yard", "dog");
		 pet3.runIt();
//		 
		 pet4.runIt();
		 System.out.println(pet3.name+", do you want to play with "+pet4.name+"?");
	}

}

package default_2;
import package_3.DataHelper2;
import java.util.LinkedList;
import java.util.*;
class DataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("it is working");
//System.out.println(i);
//DataHelper2 name = new DataHelper2();
//
//System.out.println(name.i);

//System.out.println("-----Slide 28-------");
				//LinkedList(); static
				//public class LinkedList {
				//    private Node first, last; 
				//    //Declares private variables `first` and `last`, which are 								
				//    //instances of Node objects, to keep track of the first and last 								
				//    //nodes of the list.
				//}


//System.out.println("-----Slide 30-------");
//
//				LinkedList<String> animalList = new LinkedList<String>();
//				animalList.add("frog");
//				animalList.add("giraffe");
//				animalList.add("buffalo");
//				animalList.add("mongoose");
//				System.out.println(animalList);
//				// => [frog, giraffe, buffalo, mongoose]
//				
//				// Puts shark as the first element in the LinkedList
//				animalList.addFirst("shark"); 
//				System.out.println(animalList);
//				// => [shark, frog, giraffe, buffalo, mongoose]
//				
//				// Puts koala as the last element in the LinkedList
//				animalList.addLast("koala"); 
//				System.out.println(animalList);
//				// => [shark, frog, giraffe, buffalo, mongoose, koala]
//				    
//				// This adds the value cuttlefish to the 3rd index of the LinkedList
//				animalList.add(3, "cuttlefish"); 
//				System.out.println(animalList);
//				// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
//				
//				System.out.println("-----Slide 31-------");
//				animalList.remove(3); 
//				//Removes the element that is at the 3rd index of the LinkedList
//				animalList.remove("piranha"); 
//				//Removes the first instance of "piranha" in the LinkedList
//				
//				animalList.removeFirst(); 
//				//Removes the first element of the LinkedList
//				animalList.removeLast(); 
//				//Removes the last elements of the LinkedList
//				
//				animalList.contains("giraffe"); 
//				//Returns `true` if "giraffe" is present in the LinkedList
//				
//				animalList.size(); 
//				//Returns an integer denoting the size of the LinkedList
//				
//				animalList.get(3); 
//				//Returns the value located at the 3rd index of the LinkedList
//				animalList.set(3, "emu"); 
//				//Sets the value at index 4 to "emu"
//				System.out.println(animalList);
//				//=> [frog, giraffe, buffalo, emu]

System.out.println("-----Slide 34-------");


Queue<String> q = new LinkedList<String>();

Queue<Integer> myQueue = new LinkedList<>(); 

//Adds elements {5, 6, 7, 8, 9} to queue 
for (int i=5; i<10; i++) 
myQueue.add(i); 

//Display contents of the queue. 
System.out.println("Elements of queue-"+ myQueue); 

//To remove the head of queue. 
int removedHead = myQueue.remove(); 
System.out.println("removed element-" + removedHead); 

System.out.println(myQueue); 

//To view the head of queue 
int head = myQueue.peek(); 
System.out.println("head of queue-" + head); 

//Rest all methods of collection interface, 
//Like size and contains can be used with this 
//implementation. 
int size = myQueue.size(); 
System.out.println("Size of queue-" + size); 
System.out.println("---------------------");
System.out.println("-----Slide 36-------");
//Imports the data we need to use the Stack class

Stack<Integer> myStack; 
//creates a reference variable for a Stack called myStack
myStack = new Stack<Integer>(); 
//creates a new Integer Stack and assigns its address to myStack

myStack.push(1); 
System.out.println(myStack);
//Pushes 1 to the top of our stack
//myStack now consists of [1]
myStack.push(2);
System.out.println(myStack);
//myStack now consists of [1, 2] 
myStack.push(3);
//myStack now consists of [1, 2, 3] 
System.out.println(myStack);
//Despite pushing to the "top" of the stack, the printed representation 
//puts our new numbers at the back. The important part is that they are 
//removed from the same place they are added.
System.out.println("---------------------");
System.out.println("-----Slide 37-------");
System.out.println(myStack);

myStack.pop(); 
System.out.println(myStack.pop());
//returns 3 and removes it from the stack

//myStack now consists of [1, 2]

//We can also look at the top of the stack without 
//removing it by using peek
myStack.peek(); 
System.out.println(myStack.peek());
//returns 2, but doesn't remove it
//myStack still consists of [1, 2] 

//We may want to know if a stack is empty before we manipulate it:
myStack.empty(); 
System.out.println(myStack.empty());
//this will return `false` because our stack is not empty




















	}

}

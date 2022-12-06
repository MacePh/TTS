

## Java OOP Day 3

## Table of Contents

1\\. Classes and Objects 
2\\. Interfaces 7\\. Abstract Classes 8\\. Association 9\\. Aggregation 10\\. Composition 11\\. Factory Pattern

\## Java OOP Day 3

\*\*Classes and Objects\*\* By now, you should be familiar with classes and objects. To recap, in Java, an object is created from a class. Let's create a class named \*\*Vehicle\*\*, so now we can use this to create objects. To create an object of type \*\*Vehicle\*\*, specify the class name, followed by the object name, and use the keyword \*\*new\*\* :

class Vehicle { int wheels = 4; } public class Demo { int x = 5; public static void main(String\[\] args) { Vehicle myObject = new Vehicle(); System.out.println(myObject.wheels); } }

\*\*Interface\*\* An interface contains behaviors that a class implements. All of the methods of an interface need to be defined in the class that implements the interface. An interface is like a class: \* An interface can contain any number of methods. \* An interface is written in a file with a .java extension, with the name of the interface matching the name of the file. However, an interface is different from a class in several ways: \* You cannot instantiate an interface. \* An interface does not contain any constructors. \* An interface is not extended by a class; it is implemented by a class.

\## Java OOP Day 3

On the next slide, we will give an example of using an interface. We have common methods that a Vehicle needs to implement. Since a motorcycle and a rally car are both vehicles, we can implement the Vehicle interface. \*\*Why Use Interfaces?\*\* Interfaces are needed where you expect change in your program. The primary point of using an interface is for abstraction, decoupling the "what" from the "how". Implementation is fragile in this sense: it breaks quite easily. This is why subclassing isn't always the best solution

\## Java OOP Day 3

interface Vehicle { void changeGear(int a); void accelerate(int a); void brake(int a); }

Create the interface \*\*Vehicle\*\*:

\## Java OOP Day 3

class Motorcycle implements Vehicle{ int speed, gear; @Override public void changeGear(int newGear){ gear = newGear; } @Override public void accelerate(int increment){ speed = speed + increment; } @Override public void brake(int decrement){ speed = speed - decrement; } public void displayStatus() { System.out.println("speed: " + speed + " gear: " + gear); } }

Create the class \*\*Motorcycle\*\* which implements \*\*Vehicle\*\*

\## Java OOP Day 3

class RallyCar implements Vehicle { int speed, gear; @Override public void changeGear(int newGear){ gear = newGear; } @Override public void accelerate(int increment){ speed = speed + increment; } @Override public void brake(int decrement){ speed = speed - decrement; } public void displayStatus() { System.out.println("speed: " + speed + " gear: " + gear); } }

Create the class \*\*RallyCar\*\* which implements \*\*Vehicle\*\*

\## Java OOP Day 3

public class Demo{ public static void main (String args \[\]){ Motorcycle motorcycle = new Motorcycle(); motorcycle.changeGear(5); motorcycle.accelerate(15); motorcycle.brake(1); System.out.println("Motorcycle display status :"); motorcycle.displayStatus(); // creating instance of RallyCar RallyCar rallyCar = new RallyCar(); rallyCar.changeGear(3); rallyCar.accelerate(12); rallyCar.brake(2); System.out.println("RallyCar display status :"); rallyCar.displayStatus(); } }

Try it out!

\## Java OOP Day 3

\*\*Abstract Classes\*\* \* An abstract class cannot be instantiated but can be inherited by another class. \* An Abstract class is a class which has the abstract keyword prefixed to it. \* A class must be prefixed with abstract if it has one or more methods with abstract keyword. An abstract method is only declared but not implemented. \* The inheriting class must implement all the abstract methods or else the subclass should also be declared as abstract.

\## Java OOP Day 3

abstract class Instrument{ //abstract method public abstract void createSound(); } class Guitar extends Instrument{ public void createSound(){ System.out.println("Strum"); } } public class Demo { public static void main(String args\[\]){ Instrument guitar = new Guitar(); guitar.createSound(); } }

In the example below, we know that all Instruments make a sound. If we know that all the child classes will (and should) override our createSound method, then there is no point to implement this method in our parent class. Making this method abstract is the best choice because this forces all sub classes to implement this method on their own.

\## Java OOP Day 3

\*\*Association\*\* Association - is a relationship between two objects where the relationship between the classes can be bi-directional. In this OOP concept, all objects have their separate lifecycle, and there is no owner. \*\*Example\*\*: Human and Animal Many animals can be associated with one human while one animal can also be associated with multiple humans. We can say that association in Java follows a \*\*many-to-many\*\* relationship.

\## Java OOP Day 3

\*\*Aggregation\*\* In this technique, all objects have their separate lifecycle. However, there is ownership such that the child object can’t belong to another parent object. Let’s use the example of a player and a team. A player who is a part of the team can exist even when the team ceases to exist. It represents the \*\*Has-A\*\* relationship. Aggregation in Java follows a one-way or one-to-one relationship. Ending one entity won’t affect another, both can be present independently.

\## Java OOP Day 3

\*\*Aggregation\*\* In the example below, every \*\*Programmer\*\* has an address so the relationship between Programmer and Address is a Has-A relationship. But, \*\*Address\*\* doesn’t need to have a Programmer necessarily.

class Address { int streetNum; String city, state; Address(int street, String city, String state){ this.streetNum = street; this.city = city; this.state = state; } } class Programmer { String name; //Creating HAS-A relationship with Address class Address programmerAddr; Programmer(String name, Address addr){ this.name=name; this.programmerAddr = addr; } }

\## Java OOP Day 3

\*\*Aggregation\*\* Try it out with your own sample data in an IDE.

public class Demo { public static void main(String args\[\]){ Address address = new Address(630, "Hendersonville", "NC"); Programmer object = new Programmer("Sarah", address); System.out.println(object.name); System.out.println(object.programmerAddr.streetNum); System.out.println(object.programmerAddr.city); System.out.println(object.programmerAddr.state); } }

\## Java OOP Day 3

\*\*Composition\*\* Composition in Java represents a \*\*one-to-many\*\* relationship. One entity cannot exist without the other. Let’s take an example of the relationship between questions and answers. Single questions can have multiple answers, and answers cannot belong to multiple questions. If we delete questions, answers will automatically be deleted.

\## Java OOP Day 3

\*\*Composition\*\* In our code example, we have an example of a streaming service and its movies. When our movies variable is declared with the \*\*final\*\* keyword, its value can’t be modified.

class NetflixMovie { public String title; public String producer; NetflixMovie(String title, String producer) { this.title = title; this.producer = producer; } } class NetflixMovieLibrary { private final List movies; NetflixMovieLibrary (List movies) { this.movies = movies; } public List getTotalNetflixMoviesInNetflixLibrary(){ return movies; } }

\## Java OOP Day 3

public class Demo { public static void main (String\[\] args) { NetflixMovie movieObject1 = new NetflixMovie("Titanic","James Cameron"); NetflixMovie movieObject2 = new NetflixMovie("47 Meters Down", "James Harris"); List allNetflixMovies = new ArrayList(); allNetflixMovies.add(movieObject1); allNetflixMovies.add(movieObject2); NetflixMovieLibrary netflix = new NetflixMovieLibrary(allNetflixMovies); List mvs = netflix.getTotalNetflixMoviesInNetflixLibrary(); for(NetflixMovie mv : mvs){ System.out.println("Title : " + mv.title + " and " +" Producer : " + mv.producer); } } }

Pretty simple, right?

\## Java OOP Day 3

\*\*Enumerations\*\* An enum can be used to easily define and use constants. This is useful for checking the state of objects or variables. For instance: Creates an enumeration for days of the week. Under the hood, these "days" are represented as numbers (SUNDAY->0, MONDAY->1, etc.), but they can be used in code by merely typing the day.

\## Java OOP Day 3

public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

\*\*Enumerations\*\* For example, here we have a switch case that checks the current day using the enumerations.

\## Java OOP Day 3

public class EnumTest{ public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY } Day day; public EnumTest(Day day){ this.day = day; } public void weekendOrWeekday(){ switch (day){ case SATURDAY: case SUNDAY: System.out.println("It's weekend!"); break; default: System.out.println("It's a weekday!"); break; } } public static void main(String\[\] args) { EnumTest weekday = new EnumTest(Day.MONDAY); weekday.weekendOrWeekday(); EnumTest weekend = new EnumTest(Day.SATURDAY); weekend.weekendOrWeekday(); } }

\*\*Lab: Car Dealership\*\* ​Using our knowledge from today, we will be making a car dealership in Java. We'll be reviewing some sample code to review the fundamentals we've learned and see them in action.

\## Java OOP Day 3

\*\*Composition\*\* In Java this concept can be represented with nested classes - essentially a class defined \_within\_ another class. Consider if the LightTruck class needed to define a class within it to represent a truck-specific piece of equipment: (NOTE: to save space, only the additional lines added to LightTruck class are shown)

\## Java OOP Day 3

\## Java OOP Day 3

public class LightTruck extends Vehicle { public class TransferCase { public TransferCase() { this.numGears = 4; } public TransferCase(int gears) { this.numGears = gears; } private int numGears; public int getNumGears() { return this.numGears; } } // member to represent the inner class public TransferCase xferCase; // in the constructor, manage if the truck object will have // a transfer case public LightTruck(/\* arguments not shown \*/) { // other ctor statements this.is4wd = is4wd; if (this.is4wd == true) { this.xferCase = new TransferCase(); } } // Now, in code that used the LightTruck class LightTruck lt = new LightTruck("16896XCKJE8", 48000.00, 62000.00, 2019, "Chevrolet", "Silverado", "Silver", 10000L, 90000L, true); if (lt.is4wd) { int gears = lt.xferCase.numGears; System.out.println(") }

In this case the TransferCase member was public and so users of the LightTruck class had access to it using the property member (.) notation. Designs and requirements may differ from project to project.

\## Java OOP Day 3

\*\*Enums\*\* Let's set up an enum for vehicle classifications! This will make it easier to reference

public enum VehicleClassification { NEW, USED, OFF\_LEASE, SHUTTLE, LOANER, PARTS\_RUNNER }

\## Java OOP Day 3

\*\*Enums\*\* Now, we can use those enums in a definition for \_Vehicle\_.

private VehicleClassification vehicleClass; public void setVehicleClass(VehicleClassification theClass) { this.vehicleClass = theClass; } public VehicleClassification getVehicleClass() { return this.vehicleClass; }

\## Java OOP Day 3

\*\*Enums\*\* This will make sure the class given is one of the ones we specified in our enum, and will also allow us to use the enum in switch statements later on.

// in the Vehicle class public void printVehicleType() { String type = "NOT SET"; switch (this.vehicleClass) { case NEW: type="New Car"; break; case USED: type = "User Car"; break; case OFF\_LEASE: type = "Leased Car"; break; case SHUTTLE: type = "Dealer Shuttle"; break; case LOANER: type = "Dealer Service Loaner"; break; case PARTS\_RUNNER: type = "Parts runner"; break; default: break; } System.out.println("This car type is: " + type); }

\## Java OOP Day 3

\*\*Enums\*\* Notice in the switch statement the type is already referred to by "switching" on the variable, which implies its type. When using an enumeration in regular code the full type specification must be used, much like a static final variable of a class.

// referring to an enum in the main() method VehicleClassification vc = VehicleClassification.SHUTTLE; // setting the classification of a vehicle lt.setVehicleClass(VehicleClassification.NEW);

\## Java OOP Day 3

\*\*Enums\*\* We can also make enums a bit more specific. Assume that \_VehicleClassificaiton\_ also contained additional information, such as if the class of vehicles could include a warranty and free service offers. A simple implementation is:

public enum VehicleClassification2 { NEW(true, true), USED(false, true), OFF\_LEASE(true, true), SHUTTLE(true, false), LOANER(false, false), PARTS\_RUNNER(true, true); private boolean warranty; private boolean freeService; public boolean WarrentyOffered() { return warranty; } public boolean FreeServiceOffered() { return freeService; } // constructor must be private or have no modifier private VehicleClassification2(boolean warranty, boolean freeService) { this.warranty = warranty; this.freeService = freeService; } }

\*\*Association\*\* Let's say we have a vehicle class and a department class. We have another class, \_ServiceDepartment\_, that inherits from department. Within the \_ServiceDepartment\_, we will use \*\*association.\*\* The changeEngineOil takes in a Vehicle object and alters it's engine oil.

\## Java OOP Day 3

// In the ServiceDepartment class public boolean changeEngineOil(Vehicle v) { if ( v!= null) { // logic to note a change of engine oil of variable v return true; } return false; }

\## Java OOP Day 3

\*\*Factory Pattern\*\* The Factory Pattern is a method for creating objects without exposing the logic needed for creation. The consumer of the interface does not really need to know what concrete class it is using as long as that class is implementing the correct interface. To insulate the consumer from the actual class implementations, the consumer can use a factory to create any object it uses.

\## Java OOP Day 3

\*\*Factory Pattern\*\* 1\\. The consumer can request the factory for a brand new object, or it may have some piece of information and can request the factory take what is know and return the complete object. 2\\. The factory returns the requested object which may be brand new or may be retrieved from some object store such as a database or file system.

\## Java OOP Day 3

\*\*Factory Pattern: Example\*\* First an enum was created to represent the different types of Departments. Next a DepartmentFactory was created with a single static method to create and return a department based on the passed-in enum value.

// An enum class to represent the departments public enum DepartmentNames { SERVICE, FINANCE, SALES } // The DepartmentFactory definition public class DepartmentFactory { public static Department CreateDepartment(DepartmentNames name) { Department d = null; if (name == null) return null; switch(name) { case SERVICE: d = new ServiceDepartment(); break; case SALES: d = new SalesDepartment(); break; case FINANCE: d = new FinanceDepartment(); break; default: // no op } return d; } }

\## Java OOP Day 3

\*\*Factory Pattern: Example\*\* We can now use this code in the main method. Instead of explicitly using new() to create the object, here we let the factory create them.

// based on the code seen earlier in main() // instead of "new"ing each department, the factory creates them Department sd = DepartmentFactory.CreateDepartment(DepartmentNames.SERVICE); Department fd = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE); List depts = new ArrayList(); depts.add(sd); depts.add(fd);

\## Java OOP Day 3

\*\*Factory Pattern: Example\*\* This is also known as loose coupling. The client of the factory (in this case the main() method) does not need to know anything about how to create a department. Let's say we want to examine the properties of a \_Leaseable\_ vehicle but only has the VIN number for instance, a factory could be created to produce the correct Vehicle.

\## Java OOP Day 3

\*\*Factory Pattern: Example\*\*

public class LeaseVehicleFactory { public static Leaseable getLeasableVehicleByVin(String VIN) { Leaseable leaseable = null; // get the vehicle type, then lookup details in datastore String vehicleType = decodeVinForType(VIN); if(vehicleType.equals("Car")) { leasable = getCarDetails(VIN); } else if (VehicleType.equals("LightTruck")) { leasable = getTruckDetails(VIN); } // more types. if not found return null return leaseable; } } // called in main as follows: Leaseable l = LeaseVehicleFactory.getLeasableVehicleByVin("16896XCKJE8"); System.out.println("Can be leased? " + l.isLeaseable());

\## Java OOP Day 3

\*\*Factory Pattern: Example\*\* This is a mix of loose coupling and isolation. The client has a bit of information and presents that to the factory to "build" the rest of the object it needs. From the client perspective, it simply asks for a \_Leaseable\_ based on VIN and the factory produces it.

\## Java OOP Day 3

\*\*Factory Pattern\*\* Factory pattern is what is known as a Java \_Design Pattern.\_ You will learn more Java Design Patterns later. For now, the factory is all we need.

\## Java OOP Day 3

\*\*Summary\*\* implements vs. extends: what is the difference? What is an Abstract Class? What are enums and why would you use them? What are the different types of associations that classes can have? Can you give an example of each? What is the Factory Pattern and why would you use it?

\#### Java OOP Day 3 By Tech Talent South

Private

\[\](/techtalentsouth/java-oop-day-3/fullscreen)

\# Java OOP Day 3 Basic OOP Principles \*

\### \[Tech Talent South\](/techtalentsouth) Tech Talent South (TTS) is an approachable and inclusive technical education company which exists to build and connect local tech and entrepreneurial ecosystems. We offer experiences for individuals, corporations, and talent pipeline partners. \* \[techtalentsouth\](https://twitter.com/techtalentsouth)

\[Help\](https://help.slides.com) • \[Terms\](https://techtalentsouth.slides.com/terms?root=true) • \[Privacy\](https://techtalentsouth.slides.com/privacy?root=true) • © 2022 Slides, Inc.


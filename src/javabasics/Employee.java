
/* Theory
 * In Java, there are three main types of variables: static variables, instance (class) variables, and local variables. 
 * 
 * 1. Static Variables (Class Variables):

· Definition: Static variables are declared using the static keyword and belong to the class itself, not to any instance of the class. 
				They are shared among all instances of the class.
				e.g-
				public class MyClass {
    static int count = 0;
    // ...
}
      · When to Use:

1. When you want to share a variable among all instances of a class.

2. To store constant values (constants in Java are typically declared as static final variables).

3. For variables that represent properties or attributes shared by all instances
 (e.g., a counter for all objects of a class).
 
 1. Static variables are initialized only once, when the class is loaded, and retain their values across all instances.

2. They can be accessed using the class name (MyClass.count) or directly if accessed from within the same class.

3. Changes to static variables are visible to all instances of the class.

4. Be cautious when using them in a multi-threaded environment; you may need to synchronize access.




2. Instance (Class) Variables:

· Definition: Instance variables are declared within a class but outside any method. 
Each instance of the class has its own copy of these variables.

· Example:

public class MyClass {
    int instanceVar = 0;
    // ...
}
· When to Use:
1. When you want each instance of a class to have its own set of attributes or properties.
2. For storing values that vary from one object to another.

1. Each instance of the class has its own set of instance variables.

2. They are initialized when an object is created.

3. Accessible through object references (e.g., myObj.instanceVar).

4. Changes to instance variables affect only the specific instance.

5. Typically, getter and setter methods are used to access and modify 
instance variables to control access and encapsulation.
3. Local Variables:

· Definition: Local variables are declared within a method, constructor, or block and have limited scope. They exist only for the duration of the method call or block execution.

· Example:

public void myMethod() {
    int localVar = 42;
    // ...
}
· When to Use:

· When you need temporary storage for calculations or processing within a method.

· To store data that is only relevant within a specific method or block.

· Rules:

· Local variables are only accessible within the method or block where they are declared.

· They must be explicitly initialized before use.
They are automatically destroyed when the method or block execution completes.

· Local variables can have the same name as an instance or static variables; in such cases, the local variable takes precedence within its scope.

Guidelines:

· Use static variables for shared data across all instances of a class or for constants.

· Use instance variables for attributes specific to each object (instance) of a class.

· Use local variables for temporary storage within methods or blocks.

· Follow naming conventions (e.g., use camelCase for instance and local variables, and UPPERCASE for static final constants).

· Be mindful of variable scope and visibility to avoid unintended side effects and ensure encapsulation.
 */
package javabasics;


 
public class Employee {
	
	
	String empFname = "Naresh"; //instance variable
	static String  empLname = "Neupane";  //static variable
	
	public static void main(String [] args) {
		String middleName = "Raj"; //local variable
		Employee employee = new Employee();// object creation
		
		Employee employee1 = new Employee();// 2nd object creation
		Employee employee2 = new Employee(); //3rd object creation
		
		System.out.println(middleName);
		System.out.println(empLname);
		System.out.println(employee.empFname);//object is used to access the instance variable
		
		// variable is a container which stores some value that can be changed.
// 1. local variable -- defined inside the method/it is accessible within the method only.
		// 2. instance variable  -- defined outside the method without static keyword
		// 3. static/class variable -- defined outside the method with static keyword
 
		// instance variable -- need to create instance of class(object creation)
		//static variable --no need to create instance of class.
		
		
		
		 System.out.println("after the change");
		employee1.empFname = "Mr Naresh";
		employee2.empFname ="Mr Naresh2";
		empLname = "Pathak";
		System.out.println("Instance value showing value changes in each instance");
		System.out.println(employee.empFname);//instance		
		System.out.println(employee1.empFname);//instance
		System.out.println(employee2.empFname);//instance
		System.out.println("Static value that remains static and does not change in each instance");
		System.out.println(employee.empLname);//static 		
		System.out.println(employee1.empLname);//static
		System.out.println(employee2.empLname);//static
		
		
		//every instance variable has its own copy of object --instance
		//all instances have one copy of object
		
	}

}




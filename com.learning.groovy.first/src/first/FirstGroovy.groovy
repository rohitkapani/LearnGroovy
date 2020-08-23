package first

import importPack.ReadyMethod as RM

class FirstGroovy {
	
	void display() {
		println 'Hello World'  //no semicolons and puntuation
	}

	/**
	 * main method
	 * @param arg
	 */
	static void main(def arg) {
		//Groovy basics example
		/*
		 * print hello world
		 * using string
		 */
		
		
		def (a,b,c)=[30,40,50] //multiassignements
		
		def object=new FirstGroovy()
		object.display()
		
		def x = "Rohit" as String  //defining using def variable
		println x
		x = 1   //changing data type for def variable to integer
		println x;
		x = 'R' //changing data type for def variable to character
		println x;
		

	}
}
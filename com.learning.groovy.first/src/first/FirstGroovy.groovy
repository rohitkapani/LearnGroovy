package first

import importPack.ReadyMethod as RM

class FirstGroovy {
	def invokeMethod(String name, Object args) {
		return "called invokeMethod $name $args"
	}

	//no datatype of parameters required , identify at runtime
	//can give default parameters
	def getName(parameter,default_parameter2 = 0, default_parameter3 = 0) {
		parameter+' Kapani'  // by default last statememt is returned
	}
	/**
	 * main method
	 * @param arg
	 */
	static void main(def arg) {
		//single line
		/*
		 * line1
		 * line2
		 */
		def (a,b,c)=[30,40,50] //multiassignements
		def object=new FirstGroovy()
		def x = "Rohit" as String
		println("x="+x);
		x = 1
		println("x="+x);
		x = 'R'
		println("x="+x);
		println("Hello World :" + x +" " +object.getName(x));
		println("Hello World non existing method :" + x +" " +object.myName(x));

		def range = 1..10;
		println(range);
		println(range.get(2));

		println RM.sum(2,3)
		
		//arithmatic operators
		
		assert 9.intdiv(5)==1
		assert 2**3==8 //2 raise to power 3
		
		//loops
		
		for (def i in 1..5)  // in works with collection only
			println i
		
			1.upto(5) 
			{
				println "$it"  // it is iteration
			}	
			
			
	
			5.times 
			{ 
				println "$it"  // it is iteration
			}
			
			1.step(10,2) 
			{
				println "$it"  // it is iteration till 10 by incrementing 2
			}
			
			//map
			
			def map =["name":"Rohit","subject":"groovy"]
			
			for (entry in map)
			{
				print entry.key +"->"
				println entry.value
			}
			
			//closure , block of code take parameters, can be passed as a parameter in method
			def closure1 = {name -> println "my closure $name"}
			closure1.call("Rohit")
	}
}
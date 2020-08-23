package first

class ClosureImpl {
	def static display(clo) {
		// This time the $param parameter gets replaced by the string "Inner"
		clo.call("Inner");
	 }
  
	static void main(def arg)
	{
		def closure1 = {name -> println "my closure $name"}
		closure1.call("Rohit")
		
		def clos = {println "Hello ${it}"};
		clos.call("World");
		
		def str1 = "Welcome";
		def clos1 = {param -> println "${str1} ${param}"}
		clos.call("World");
  
   ClosureImpl.display(clos1)
	}
}
